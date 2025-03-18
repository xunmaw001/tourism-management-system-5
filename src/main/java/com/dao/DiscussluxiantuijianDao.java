package com.dao;

import com.entity.DiscussluxiantuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussluxiantuijianVO;
import com.entity.view.DiscussluxiantuijianView;


/**
 * 路线推荐评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface DiscussluxiantuijianDao extends BaseMapper<DiscussluxiantuijianEntity> {
	
	List<DiscussluxiantuijianVO> selectListVO(@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);
	
	DiscussluxiantuijianVO selectVO(@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);
	
	List<DiscussluxiantuijianView> selectListView(@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);

	List<DiscussluxiantuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);
	
	DiscussluxiantuijianView selectView(@Param("ew") Wrapper<DiscussluxiantuijianEntity> wrapper);
	
}
