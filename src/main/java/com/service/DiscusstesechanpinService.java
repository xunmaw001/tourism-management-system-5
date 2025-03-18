package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstesechanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstesechanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstesechanpinView;


/**
 * 特色产品评论表
 *
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface DiscusstesechanpinService extends IService<DiscusstesechanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstesechanpinVO> selectListVO(Wrapper<DiscusstesechanpinEntity> wrapper);
   	
   	DiscusstesechanpinVO selectVO(@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);
   	
   	List<DiscusstesechanpinView> selectListView(Wrapper<DiscusstesechanpinEntity> wrapper);
   	
   	DiscusstesechanpinView selectView(@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstesechanpinEntity> wrapper);
   	
}

