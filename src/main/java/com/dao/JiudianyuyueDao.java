package com.dao;

import com.entity.JiudianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudianyuyueVO;
import com.entity.view.JiudianyuyueView;


/**
 * 酒店预约
 * 
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public interface JiudianyuyueDao extends BaseMapper<JiudianyuyueEntity> {
	
	List<JiudianyuyueVO> selectListVO(@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);
	
	JiudianyuyueVO selectVO(@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);
	
	List<JiudianyuyueView> selectListView(@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);

	List<JiudianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);
	
	JiudianyuyueView selectView(@Param("ew") Wrapper<JiudianyuyueEntity> wrapper);
	
}
