package com.entity.view;

import com.entity.DiscusstesechanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特色产品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("discusstesechanpin")
public class DiscusstesechanpinView  extends DiscusstesechanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstesechanpinView(){
	}
 
 	public DiscusstesechanpinView(DiscusstesechanpinEntity discusstesechanpinEntity){
 	try {
			BeanUtils.copyProperties(this, discusstesechanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
