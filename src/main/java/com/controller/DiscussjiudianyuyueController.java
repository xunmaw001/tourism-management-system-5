package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussjiudianyuyueEntity;
import com.entity.view.DiscussjiudianyuyueView;

import com.service.DiscussjiudianyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 酒店预约评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@RestController
@RequestMapping("/discussjiudianyuyue")
public class DiscussjiudianyuyueController {
    @Autowired
    private DiscussjiudianyuyueService discussjiudianyuyueService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussjiudianyuyueEntity discussjiudianyuyue, HttpServletRequest request){

        EntityWrapper<DiscussjiudianyuyueEntity> ew = new EntityWrapper<DiscussjiudianyuyueEntity>();
		PageUtils page = discussjiudianyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjiudianyuyue), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussjiudianyuyueEntity discussjiudianyuyue, HttpServletRequest request){
        EntityWrapper<DiscussjiudianyuyueEntity> ew = new EntityWrapper<DiscussjiudianyuyueEntity>();
		PageUtils page = discussjiudianyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjiudianyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussjiudianyuyueEntity discussjiudianyuyue){
       	EntityWrapper<DiscussjiudianyuyueEntity> ew = new EntityWrapper<DiscussjiudianyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussjiudianyuyue, "discussjiudianyuyue")); 
        return R.ok().put("data", discussjiudianyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussjiudianyuyueEntity discussjiudianyuyue){
        EntityWrapper< DiscussjiudianyuyueEntity> ew = new EntityWrapper< DiscussjiudianyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussjiudianyuyue, "discussjiudianyuyue")); 
		DiscussjiudianyuyueView discussjiudianyuyueView =  discussjiudianyuyueService.selectView(ew);
		return R.ok("查询酒店预约评论表成功").put("data", discussjiudianyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussjiudianyuyueEntity discussjiudianyuyue = discussjiudianyuyueService.selectById(id);
        return R.ok().put("data", discussjiudianyuyue);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussjiudianyuyueEntity discussjiudianyuyue = discussjiudianyuyueService.selectById(id);
        return R.ok().put("data", discussjiudianyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussjiudianyuyueEntity discussjiudianyuyue, HttpServletRequest request){
    	discussjiudianyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjiudianyuyue);

        discussjiudianyuyueService.insert(discussjiudianyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussjiudianyuyueEntity discussjiudianyuyue, HttpServletRequest request){
    	discussjiudianyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjiudianyuyue);

        discussjiudianyuyueService.insert(discussjiudianyuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussjiudianyuyueEntity discussjiudianyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussjiudianyuyue);
        discussjiudianyuyueService.updateById(discussjiudianyuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussjiudianyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussjiudianyuyueEntity> wrapper = new EntityWrapper<DiscussjiudianyuyueEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussjiudianyuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
