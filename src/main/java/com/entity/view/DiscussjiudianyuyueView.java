package com.entity.view;

import com.entity.DiscussjiudianyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒店预约评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("discussjiudianyuyue")
public class DiscussjiudianyuyueView  extends DiscussjiudianyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiudianyuyueView(){
	}
 
 	public DiscussjiudianyuyueView(DiscussjiudianyuyueEntity discussjiudianyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiudianyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
