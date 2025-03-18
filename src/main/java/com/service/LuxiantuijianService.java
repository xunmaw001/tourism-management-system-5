package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuxiantuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuxiantuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuxiantuijianView;


/**
 * 路线推荐
 *
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface LuxiantuijianService extends IService<LuxiantuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuxiantuijianVO> selectListVO(Wrapper<LuxiantuijianEntity> wrapper);
   	
   	LuxiantuijianVO selectVO(@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);
   	
   	List<LuxiantuijianView> selectListView(Wrapper<LuxiantuijianEntity> wrapper);
   	
   	LuxiantuijianView selectView(@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuxiantuijianEntity> wrapper);
   	
}

