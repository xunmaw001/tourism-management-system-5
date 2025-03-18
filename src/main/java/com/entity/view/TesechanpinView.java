package com.entity.view;

import com.entity.TesechanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特色产品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("tesechanpin")
public class TesechanpinView  extends TesechanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TesechanpinView(){
	}
 
 	public TesechanpinView(TesechanpinEntity tesechanpinEntity){
 	try {
			BeanUtils.copyProperties(this, tesechanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
