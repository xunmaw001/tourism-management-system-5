package com.entity.model;

import com.entity.TesechanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 特色产品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public class TesechanpinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 特产类型
	 */
	
	private String techanleixing;
		
	/**
	 * 特产规格
	 */
	
	private String techanguige;
		
	/**
	 * 特产照片
	 */
	
	private String techanzhaopian;
		
	/**
	 * 特产介绍
	 */
	
	private String techanjieshao;
		
	/**
	 * 详情内容
	 */
	
	private String xiangqingneirong;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：特产类型
	 */
	 
	public void setTechanleixing(String techanleixing) {
		this.techanleixing = techanleixing;
	}
	
	/**
	 * 获取：特产类型
	 */
	public String getTechanleixing() {
		return techanleixing;
	}
				
	
	/**
	 * 设置：特产规格
	 */
	 
	public void setTechanguige(String techanguige) {
		this.techanguige = techanguige;
	}
	
	/**
	 * 获取：特产规格
	 */
	public String getTechanguige() {
		return techanguige;
	}
				
	
	/**
	 * 设置：特产照片
	 */
	 
	public void setTechanzhaopian(String techanzhaopian) {
		this.techanzhaopian = techanzhaopian;
	}
	
	/**
	 * 获取：特产照片
	 */
	public String getTechanzhaopian() {
		return techanzhaopian;
	}
				
	
	/**
	 * 设置：特产介绍
	 */
	 
	public void setTechanjieshao(String techanjieshao) {
		this.techanjieshao = techanjieshao;
	}
	
	/**
	 * 获取：特产介绍
	 */
	public String getTechanjieshao() {
		return techanjieshao;
	}
				
	
	/**
	 * 设置：详情内容
	 */
	 
	public void setXiangqingneirong(String xiangqingneirong) {
		this.xiangqingneirong = xiangqingneirong;
	}
	
	/**
	 * 获取：详情内容
	 */
	public String getXiangqingneirong() {
		return xiangqingneirong;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
