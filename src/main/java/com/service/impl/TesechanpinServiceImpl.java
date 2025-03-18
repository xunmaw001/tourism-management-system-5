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


import com.dao.TesechanpinDao;
import com.entity.TesechanpinEntity;
import com.service.TesechanpinService;
import com.entity.vo.TesechanpinVO;
import com.entity.view.TesechanpinView;

@Service("tesechanpinService")
public class TesechanpinServiceImpl extends ServiceImpl<TesechanpinDao, TesechanpinEntity> implements TesechanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TesechanpinEntity> page = this.selectPage(
                new Query<TesechanpinEntity>(params).getPage(),
                new EntityWrapper<TesechanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TesechanpinEntity> wrapper) {
		  Page<TesechanpinView> page =new Query<TesechanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TesechanpinVO> selectListVO(Wrapper<TesechanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TesechanpinVO selectVO(Wrapper<TesechanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TesechanpinView> selectListView(Wrapper<TesechanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TesechanpinView selectView(Wrapper<TesechanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
