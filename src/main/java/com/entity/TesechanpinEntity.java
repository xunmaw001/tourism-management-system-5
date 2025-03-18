package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 特色产品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("tesechanpin")
public class TesechanpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TesechanpinEntity() {
		
	}
	
	public TesechanpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 特产名称
	 */
					
	private String techanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：特产名称
	 */
	public void setTechanmingcheng(String techanmingcheng) {
		this.techanmingcheng = techanmingcheng;
	}
	/**
	 * 获取：特产名称
	 */
	public String getTechanmingcheng() {
		return techanmingcheng;
	}
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
