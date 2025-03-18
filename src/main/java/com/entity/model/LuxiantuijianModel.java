package com.entity.model;

import com.entity.LuxiantuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 路线推荐
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-09 12:04:08
 */
public class LuxiantuijianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 景点名称
	 */
	
	private String jingdianmingcheng;
		
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
	 * 出发城市
	 */
	
	private String chufachengshi;
		
	/**
	 * 出现方式
	 */
	
	private String chuxianfangshi;
		
	/**
	 * 行程天数
	 */
	
	private Integer xingchengtianshu;
		
	/**
	 * 攻略封面
	 */
	
	private String gonglvefengmian;
		
	/**
	 * 行程路线
	 */
	
	private String xingchengluxian;
		
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
	 * 设置：景点名称
	 */
	 
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
				
	
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
	 * 设置：出发城市
	 */
	 
	public void setChufachengshi(String chufachengshi) {
		this.chufachengshi = chufachengshi;
	}
	
	/**
	 * 获取：出发城市
	 */
	public String getChufachengshi() {
		return chufachengshi;
	}
				
	
	/**
	 * 设置：出现方式
	 */
	 
	public void setChuxianfangshi(String chuxianfangshi) {
		this.chuxianfangshi = chuxianfangshi;
	}
	
	/**
	 * 获取：出现方式
	 */
	public String getChuxianfangshi() {
		return chuxianfangshi;
	}
				
	
	/**
	 * 设置：行程天数
	 */
	 
	public void setXingchengtianshu(Integer xingchengtianshu) {
		this.xingchengtianshu = xingchengtianshu;
	}
	
	/**
	 * 获取：行程天数
	 */
	public Integer getXingchengtianshu() {
		return xingchengtianshu;
	}
				
	
	/**
	 * 设置：攻略封面
	 */
	 
	public void setGonglvefengmian(String gonglvefengmian) {
		this.gonglvefengmian = gonglvefengmian;
	}
	
	/**
	 * 获取：攻略封面
	 */
	public String getGonglvefengmian() {
		return gonglvefengmian;
	}
				
	
	/**
	 * 设置：行程路线
	 */
	 
	public void setXingchengluxian(String xingchengluxian) {
		this.xingchengluxian = xingchengluxian;
	}
	
	/**
	 * 获取：行程路线
	 */
	public String getXingchengluxian() {
		return xingchengluxian;
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
