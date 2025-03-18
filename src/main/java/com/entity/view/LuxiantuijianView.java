package com.entity.view;

import com.entity.LuxiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路线推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("luxiantuijian")
public class LuxiantuijianView  extends LuxiantuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuxiantuijianView(){
	}
 
 	public LuxiantuijianView(LuxiantuijianEntity luxiantuijianEntity){
 	try {
			BeanUtils.copyProperties(this, luxiantuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
