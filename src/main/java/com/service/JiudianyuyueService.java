package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiudianyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiudianyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianyuyueView;


/**
 * 酒店预约
 *
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface JiudianyuyueService extends IService<JiudianyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudianyuyueVO> selectListVO(Wrapper<JiudianyuyueEntity> wrapper);
   	
   	JiudianyuyueVO selectVO(@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);
   	
   	List<JiudianyuyueView> selectListView(Wrapper<JiudianyuyueEntity> wrapper);
   	
   	JiudianyuyueView selectView(@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudianyuyueEntity> wrapper);
   	
}

