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


import com.dao.DiscussjiudianyuyueDao;
import com.entity.DiscussjiudianyuyueEntity;
import com.service.DiscussjiudianyuyueService;
import com.entity.vo.DiscussjiudianyuyueVO;
import com.entity.view.DiscussjiudianyuyueView;

@Service("discussjiudianyuyueService")
public class DiscussjiudianyuyueServiceImpl extends ServiceImpl<DiscussjiudianyuyueDao, DiscussjiudianyuyueEntity> implements DiscussjiudianyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiudianyuyueEntity> page = this.selectPage(
                new Query<DiscussjiudianyuyueEntity>(params).getPage(),
                new EntityWrapper<DiscussjiudianyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiudianyuyueEntity> wrapper) {
		  Page<DiscussjiudianyuyueView> page =new Query<DiscussjiudianyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiudianyuyueVO> selectListVO(Wrapper<DiscussjiudianyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiudianyuyueVO selectVO(Wrapper<DiscussjiudianyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiudianyuyueView> selectListView(Wrapper<DiscussjiudianyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiudianyuyueView selectView(Wrapper<DiscussjiudianyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
