package com.entity.vo;

import com.entity.JingdianjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 景点介绍
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public class JingdianjieshaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点类型
	 */
	
	private String jingdianleixing;
		
	/**
	 * 景点等级
	 */
	
	private String jingdiandengji;
		
	/**
	 * 出游季节
	 */
	
	private String chuyoujijie;
		
	/**
	 * 交通状况
	 */
	
	private String jiaotongzhuangkuang;
		
	/**
	 * 景点照片
	 */
	
	private String jingdianzhaopian;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
		
	/**
	 * 景点介绍
	 */
	
	private String jingdianjieshao;
		
	/**
	 * 景点详情
	 */
	
	private String jingdianxiangqing;
		
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
	 * 设置：景点类型
	 */
	 
	public void setJingdianleixing(String jingdianleixing) {
		this.jingdianleixing = jingdianleixing;
	}
	
	/**
	 * 获取：景点类型
	 */
	public String getJingdianleixing() {
		return jingdianleixing;
	}
				
	
	/**
	 * 设置：景点等级
	 */
	 
	public void setJingdiandengji(String jingdiandengji) {
		this.jingdiandengji = jingdiandengji;
	}
	
	/**
	 * 获取：景点等级
	 */
	public String getJingdiandengji() {
		return jingdiandengji;
	}
				
	
	/**
	 * 设置：出游季节
	 */
	 
	public void setChuyoujijie(String chuyoujijie) {
		this.chuyoujijie = chuyoujijie;
	}
	
	/**
	 * 获取：出游季节
	 */
	public String getChuyoujijie() {
		return chuyoujijie;
	}
				
	
	/**
	 * 设置：交通状况
	 */
	 
	public void setJiaotongzhuangkuang(String jiaotongzhuangkuang) {
		this.jiaotongzhuangkuang = jiaotongzhuangkuang;
	}
	
	/**
	 * 获取：交通状况
	 */
	public String getJiaotongzhuangkuang() {
		return jiaotongzhuangkuang;
	}
				
	
	/**
	 * 设置：景点照片
	 */
	 
	public void setJingdianzhaopian(String jingdianzhaopian) {
		this.jingdianzhaopian = jingdianzhaopian;
	}
	
	/**
	 * 获取：景点照片
	 */
	public String getJingdianzhaopian() {
		return jingdianzhaopian;
	}
				
	
	/**
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
				
	
	/**
	 * 设置：景点介绍
	 */
	 
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}
				
	
	/**
	 * 设置：景点详情
	 */
	 
	public void setJingdianxiangqing(String jingdianxiangqing) {
		this.jingdianxiangqing = jingdianxiangqing;
	}
	
	/**
	 * 获取：景点详情
	 */
	public String getJingdianxiangqing() {
		return jingdianxiangqing;
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
