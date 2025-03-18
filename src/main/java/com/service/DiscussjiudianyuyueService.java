package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiudianyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiudianyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiudianyuyueView;


/**
 * 酒店预约评论表
 *
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface DiscussjiudianyuyueService extends IService<DiscussjiudianyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiudianyuyueVO> selectListVO(Wrapper<DiscussjiudianyuyueEntity> wrapper);
   	
   	DiscussjiudianyuyueVO selectVO(@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);
   	
   	List<DiscussjiudianyuyueView> selectListView(Wrapper<DiscussjiudianyuyueEntity> wrapper);
   	
   	DiscussjiudianyuyueView selectView(@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiudianyuyueEntity> wrapper);
   	
}

