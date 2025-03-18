package com.dao;

import com.entity.LuxiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuxiantuijianVO;
import com.entity.view.LuxiantuijianView;


/**
 * 路线推荐
 * 
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface LuxiantuijianDao extends BaseMapper<LuxiantuijianEntity> {
	
	List<LuxiantuijianVO> selectListVO(@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);
	
	LuxiantuijianVO selectVO(@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);
	
	List<LuxiantuijianView> selectListView(@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);

	List<LuxiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);
	
	LuxiantuijianView selectView(@Param("ew") Wrapper<LuxiantuijianEntity> wrapper);
	
}
