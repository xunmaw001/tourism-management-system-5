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

import com.entity.DiscussluxiantuijianEntity;
import com.entity.view.DiscussluxiantuijianView;

import com.service.DiscussluxiantuijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 路线推荐评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@RestController
@RequestMapping("/discussluxiantuijian")
public class DiscussluxiantuijianController {
    @Autowired
    private DiscussluxiantuijianService discussluxiantuijianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussluxiantuijianEntity discussluxiantuijian, HttpServletRequest request){

        EntityWrapper<DiscussluxiantuijianEntity> ew = new EntityWrapper<DiscussluxiantuijianEntity>();
		PageUtils page = discussluxiantuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussluxiantuijian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussluxiantuijianEntity discussluxiantuijian, HttpServletRequest request){
        EntityWrapper<DiscussluxiantuijianEntity> ew = new EntityWrapper<DiscussluxiantuijianEntity>();
		PageUtils page = discussluxiantuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussluxiantuijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussluxiantuijianEntity discussluxiantuijian){
       	EntityWrapper<DiscussluxiantuijianEntity> ew = new EntityWrapper<DiscussluxiantuijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussluxiantuijian, "discussluxiantuijian")); 
        return R.ok().put("data", discussluxiantuijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussluxiantuijianEntity discussluxiantuijian){
        EntityWrapper< DiscussluxiantuijianEntity> ew = new EntityWrapper< DiscussluxiantuijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussluxiantuijian, "discussluxiantuijian")); 
		DiscussluxiantuijianView discussluxiantuijianView =  discussluxiantuijianService.selectView(ew);
		return R.ok("查询路线推荐评论表成功").put("data", discussluxiantuijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussluxiantuijianEntity discussluxiantuijian = discussluxiantuijianService.selectById(id);
        return R.ok().put("data", discussluxiantuijian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussluxiantuijianEntity discussluxiantuijian = discussluxiantuijianService.selectById(id);
        return R.ok().put("data", discussluxiantuijian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussluxiantuijianEntity discussluxiantuijian, HttpServletRequest request){
    	discussluxiantuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussluxiantuijian);

        discussluxiantuijianService.insert(discussluxiantuijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussluxiantuijianEntity discussluxiantuijian, HttpServletRequest request){
    	discussluxiantuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussluxiantuijian);

        discussluxiantuijianService.insert(discussluxiantuijian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussluxiantuijianEntity discussluxiantuijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussluxiantuijian);
        discussluxiantuijianService.updateById(discussluxiantuijian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussluxiantuijianService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscussluxiantuijianEntity> wrapper = new EntityWrapper<DiscussluxiantuijianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussluxiantuijianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
