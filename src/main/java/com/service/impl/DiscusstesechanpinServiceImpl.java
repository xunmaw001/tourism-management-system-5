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


import com.dao.DiscusstesechanpinDao;
import com.entity.DiscusstesechanpinEntity;
import com.service.DiscusstesechanpinService;
import com.entity.vo.DiscusstesechanpinVO;
import com.entity.view.DiscusstesechanpinView;

@Service("discusstesechanpinService")
public class DiscusstesechanpinServiceImpl extends ServiceImpl<DiscusstesechanpinDao, DiscusstesechanpinEntity> implements DiscusstesechanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstesechanpinEntity> page = this.selectPage(
                new Query<DiscusstesechanpinEntity>(params).getPage(),
                new EntityWrapper<DiscusstesechanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstesechanpinEntity> wrapper) {
		  Page<DiscusstesechanpinView> page =new Query<DiscusstesechanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstesechanpinVO> selectListVO(Wrapper<DiscusstesechanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstesechanpinVO selectVO(Wrapper<DiscusstesechanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstesechanpinView> selectListView(Wrapper<DiscusstesechanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstesechanpinView selectView(Wrapper<DiscusstesechanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
