package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LuxiantuijianDao;
import com.entity.LuxiantuijianEntity;
import com.service.LuxiantuijianService;
import com.entity.vo.LuxiantuijianVO;
import com.entity.view.LuxiantuijianView;

@Service("luxiantuijianService")
public class LuxiantuijianServiceImpl extends ServiceImpl<LuxiantuijianDao, LuxiantuijianEntity> implements LuxiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuxiantuijianEntity> page = this.selectPage(
                new Query<LuxiantuijianEntity>(params).getPage(),
                new EntityWrapper<LuxiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuxiantuijianEntity> wrapper) {
		  Page<LuxiantuijianView> page =new Query<LuxiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuxiantuijianVO> selectListVO(Wrapper<LuxiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuxiantuijianVO selectVO(Wrapper<LuxiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuxiantuijianView> selectListView(Wrapper<LuxiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuxiantuijianView selectView(Wrapper<LuxiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
