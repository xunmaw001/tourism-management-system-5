package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussluxiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussluxiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussluxiantuijianView;


/**
 * 路线推荐评论表
 *
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface DiscussluxiantuijianService extends IService<DiscussluxiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussluxiantuijianVO> selectListVO(Wrapper<DiscussluxiantuijianEntity> wrapper);
   	
   	DiscussluxiantuijianVO selectVO(@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);
   	
   	List<DiscussluxiantuijianView> selectListView(Wrapper<DiscussluxiantuijianEntity> wrapper);
   	
   	DiscussluxiantuijianView selectView(@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussluxiantuijianEntity> wrapper);
   	
}

