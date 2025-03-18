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


import com.dao.JiudianyuyueDao;
import com.entity.JiudianyuyueEntity;
import com.service.JiudianyuyueService;
import com.entity.vo.JiudianyuyueVO;
import com.entity.view.JiudianyuyueView;

@Service("jiudianyuyueService")
public class JiudianyuyueServiceImpl extends ServiceImpl<JiudianyuyueDao, JiudianyuyueEntity> implements JiudianyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudianyuyueEntity> page = this.selectPage(
                new Query<JiudianyuyueEntity>(params).getPage(),
                new EntityWrapper<JiudianyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudianyuyueEntity> wrapper) {
		  Page<JiudianyuyueView> page =new Query<JiudianyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiudianyuyueVO> selectListVO(Wrapper<JiudianyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiudianyuyueVO selectVO(Wrapper<JiudianyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiudianyuyueView> selectListView(Wrapper<JiudianyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudianyuyueView selectView(Wrapper<JiudianyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
