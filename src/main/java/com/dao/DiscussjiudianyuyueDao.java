package com.dao;

import com.entity.DiscussjiudianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiudianyuyueVO;
import com.entity.view.DiscussjiudianyuyueView;


/**
 * 酒店预约评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface DiscussjiudianyuyueDao extends BaseMapper<DiscussjiudianyuyueEntity> {
	
	List<DiscussjiudianyuyueVO> selectListVO(@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);
	
	DiscussjiudianyuyueVO selectVO(@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);
	
	List<DiscussjiudianyuyueView> selectListView(@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);

	List<DiscussjiudianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);
	
	DiscussjiudianyuyueView selectView(@Param("ew") Wrapper<DiscussjiudianyuyueEntity> wrapper);
	
}
