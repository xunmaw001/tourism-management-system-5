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
 * 酒店预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
@TableName("jiudianyuyue")
public class JiudianyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiudianyuyueEntity() {
		
	}
	
	public JiudianyuyueEntity(T t) {
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
	 * 酒店名称
	 */
					
	private String jiudianmingcheng;
	
	/**
	 * 酒店星级
	 */
					
	private String jiudianxingji;
	
	/**
	 * 酒店位置
	 */
					
	private String jiudianweizhi;
	
	/**
	 * 周边景点
	 */
					
	private String zhoubianjingdian;
	
	/**
	 * 客房类型
	 */
					
	private String kefangleixing;
	
	/**
	 * 客房面积
	 */
					
	private String kefangmianji;
	
	/**
	 * 免费宽带
	 */
					
	private String mianfeikuandai;
	
	/**
	 * 酒店照片
	 */
					
	private String jiudianzhaopian;
	
	/**
	 * 酒店介绍
	 */
					
	private String jiudianjieshao;
	
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
	 * 设置：酒店名称
	 */
	public void setJiudianmingcheng(String jiudianmingcheng) {
		this.jiudianmingcheng = jiudianmingcheng;
	}
	/**
	 * 获取：酒店名称
	 */
	public String getJiudianmingcheng() {
		return jiudianmingcheng;
	}
	/**
	 * 设置：酒店星级
	 */
	public void setJiudianxingji(String jiudianxingji) {
		this.jiudianxingji = jiudianxingji;
	}
	/**
	 * 获取：酒店星级
	 */
	public String getJiudianxingji() {
		return jiudianxingji;
	}
	/**
	 * 设置：酒店位置
	 */
	public void setJiudianweizhi(String jiudianweizhi) {
		this.jiudianweizhi = jiudianweizhi;
	}
	/**
	 * 获取：酒店位置
	 */
	public String getJiudianweizhi() {
		return jiudianweizhi;
	}
	/**
	 * 设置：周边景点
	 */
	public void setZhoubianjingdian(String zhoubianjingdian) {
		this.zhoubianjingdian = zhoubianjingdian;
	}
	/**
	 * 获取：周边景点
	 */
	public String getZhoubianjingdian() {
		return zhoubianjingdian;
	}
	/**
	 * 设置：客房类型
	 */
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
	/**
	 * 设置：客房面积
	 */
	public void setKefangmianji(String kefangmianji) {
		this.kefangmianji = kefangmianji;
	}
	/**
	 * 获取：客房面积
	 */
	public String getKefangmianji() {
		return kefangmianji;
	}
	/**
	 * 设置：免费宽带
	 */
	public void setMianfeikuandai(String mianfeikuandai) {
		this.mianfeikuandai = mianfeikuandai;
	}
	/**
	 * 获取：免费宽带
	 */
	public String getMianfeikuandai() {
		return mianfeikuandai;
	}
	/**
	 * 设置：酒店照片
	 */
	public void setJiudianzhaopian(String jiudianzhaopian) {
		this.jiudianzhaopian = jiudianzhaopian;
	}
	/**
	 * 获取：酒店照片
	 */
	public String getJiudianzhaopian() {
		return jiudianzhaopian;
	}
	/**
	 * 设置：酒店介绍
	 */
	public void setJiudianjieshao(String jiudianjieshao) {
		this.jiudianjieshao = jiudianjieshao;
	}
	/**
	 * 获取：酒店介绍
	 */
	public String getJiudianjieshao() {
		return jiudianjieshao;
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
