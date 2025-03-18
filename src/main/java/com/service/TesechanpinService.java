package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TesechanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TesechanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TesechanpinView;


/**
 * 特色产品
 *
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface TesechanpinService extends IService<TesechanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TesechanpinVO> selectListVO(Wrapper<TesechanpinEntity> wrapper);
   	
   	TesechanpinVO selectVO(@Param("ew") Wrapper<TesechanpinEntity> wrapper);
   	
   	List<TesechanpinView> selectListView(Wrapper<TesechanpinEntity> wrapper);
   	
   	TesechanpinView selectView(@Param("ew") Wrapper<TesechanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TesechanpinEntity> wrapper);
   	
}

