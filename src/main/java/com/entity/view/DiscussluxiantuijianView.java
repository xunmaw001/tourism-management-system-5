package com.entity.view;

import com.entity.DiscussluxiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路线推荐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("discussluxiantuijian")
public class DiscussluxiantuijianView  extends DiscussluxiantuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussluxiantuijianView(){
	}
 
 	public DiscussluxiantuijianView(DiscussluxiantuijianEntity discussluxiantuijianEntity){
 	try {
			BeanUtils.copyProperties(this, discussluxiantuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
