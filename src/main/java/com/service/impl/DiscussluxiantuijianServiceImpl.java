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


import com.dao.DiscussluxiantuijianDao;
import com.entity.DiscussluxiantuijianEntity;
import com.service.DiscussluxiantuijianService;
import com.entity.vo.DiscussluxiantuijianVO;
import com.entity.view.DiscussluxiantuijianView;

@Service("discussluxiantuijianService")
public class DiscussluxiantuijianServiceImpl extends ServiceImpl<DiscussluxiantuijianDao, DiscussluxiantuijianEntity> implements DiscussluxiantuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussluxiantuijianEntity> page = this.selectPage(
                new Query<DiscussluxiantuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussluxiantuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussluxiantuijianEntity> wrapper) {
		  Page<DiscussluxiantuijianView> page =new Query<DiscussluxiantuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussluxiantuijianVO> selectListVO(Wrapper<DiscussluxiantuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussluxiantuijianVO selectVO(Wrapper<DiscussluxiantuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussluxiantuijianView> selectListView(Wrapper<DiscussluxiantuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussluxiantuijianView selectView(Wrapper<DiscussluxiantuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
