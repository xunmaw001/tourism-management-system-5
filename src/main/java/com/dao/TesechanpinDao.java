package com.dao;

import com.entity.TesechanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TesechanpinVO;
import com.entity.view.TesechanpinView;


/**
 * 特色产品
 * 
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface TesechanpinDao extends BaseMapper<TesechanpinEntity> {
	
	List<TesechanpinVO> selectListVO(@Param("ew") Wrapper<TesechanpinEntity> wrapper);
	
	TesechanpinVO selectVO(@Param("ew") Wrapper<TesechanpinEntity> wrapper);
	
	List<TesechanpinView> selectListView(@Param("ew") Wrapper<TesechanpinEntity> wrapper);

	List<TesechanpinView> selectListView(Pagination page,@Param("ew") Wrapper<TesechanpinEntity> wrapper);
	
	TesechanpinView selectView(@Param("ew") Wrapper<TesechanpinEntity> wrapper);
	
}
