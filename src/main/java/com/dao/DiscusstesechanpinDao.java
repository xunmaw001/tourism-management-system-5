package com.dao;

import com.entity.DiscusstesechanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstesechanpinVO;
import com.entity.view.DiscusstesechanpinView;


/**
 * 特色产品评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface DiscusstesechanpinDao extends BaseMapper<DiscusstesechanpinEntity> {
	
	List<DiscusstesechanpinVO> selectListVO(@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);
	
	DiscusstesechanpinVO selectVO(@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);
	
	List<DiscusstesechanpinView> selectListView(@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);

	List<DiscusstesechanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);
	
	DiscusstesechanpinView selectView(@Param("ew") Wrapper<DiscusstesechanpinEntity> wrapper);
	
}
