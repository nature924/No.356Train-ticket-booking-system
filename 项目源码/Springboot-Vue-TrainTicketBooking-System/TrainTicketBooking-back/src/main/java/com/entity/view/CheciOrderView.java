package com.entity.view;

import com.entity.CheciOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购票订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("checi_order")
public class CheciOrderView extends CheciOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String checiOrderValue;



		//级联表 checi
			/**
			* 车次标题
			*/
			private String checiName;
			/**
			* 火车照片
			*/
			private String checiPhoto;
			/**
			* 火车类型
			*/
			private Integer checiTypes;
				/**
				* 火车类型的值
				*/
				private String checiValue;
			/**
			* 现价
			*/
			private Double checiNewMoney;
			/**
			* 出发地
			*/
			private String checiChufadi;
			/**
			* 目的地
			*/
			private String checiMudidi;
			/**
			* 出发时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date checiTime;
			/**
			* 车厢
			*/
			private Integer sectionNumber;
			/**
			* 座位
			*/
			private Integer zuoweiNumber;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer checiDelete;
			/**
			* 经停站、到达时间详情
			*/
			private String checiContent;

		//级联表 yonghu
			/**
			* 会员姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 会员手机号
			*/
			private String yonghuPhone;
			/**
			* 会员身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public CheciOrderView() {

	}

	public CheciOrderView(CheciOrderEntity checiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, checiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getCheciOrderValue() {
				return checiOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setCheciOrderValue(String checiOrderValue) {
				this.checiOrderValue = checiOrderValue;
			}




				//级联表的get和set checi

					/**
					* 获取： 车次标题
					*/
					public String getCheciName() {
						return checiName;
					}
					/**
					* 设置： 车次标题
					*/
					public void setCheciName(String checiName) {
						this.checiName = checiName;
					}

					/**
					* 获取： 火车照片
					*/
					public String getCheciPhoto() {
						return checiPhoto;
					}
					/**
					* 设置： 火车照片
					*/
					public void setCheciPhoto(String checiPhoto) {
						this.checiPhoto = checiPhoto;
					}

					/**
					* 获取： 火车类型
					*/
					public Integer getCheciTypes() {
						return checiTypes;
					}
					/**
					* 设置： 火车类型
					*/
					public void setCheciTypes(Integer checiTypes) {
						this.checiTypes = checiTypes;
					}


						/**
						* 获取： 火车类型的值
						*/
						public String getCheciValue() {
							return checiValue;
						}
						/**
						* 设置： 火车类型的值
						*/
						public void setCheciValue(String checiValue) {
							this.checiValue = checiValue;
						}

					/**
					* 获取： 现价
					*/
					public Double getCheciNewMoney() {
						return checiNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setCheciNewMoney(Double checiNewMoney) {
						this.checiNewMoney = checiNewMoney;
					}

					/**
					* 获取： 出发地
					*/
					public String getCheciChufadi() {
						return checiChufadi;
					}
					/**
					* 设置： 出发地
					*/
					public void setCheciChufadi(String checiChufadi) {
						this.checiChufadi = checiChufadi;
					}

					/**
					* 获取： 目的地
					*/
					public String getCheciMudidi() {
						return checiMudidi;
					}
					/**
					* 设置： 目的地
					*/
					public void setCheciMudidi(String checiMudidi) {
						this.checiMudidi = checiMudidi;
					}

					/**
					* 获取： 出发时间
					*/
					public Date getCheciTime() {
						return checiTime;
					}
					/**
					* 设置： 出发时间
					*/
					public void setCheciTime(Date checiTime) {
						this.checiTime = checiTime;
					}

					/**
					* 获取： 车厢
					*/
					public Integer getSectionNumber() {
						return sectionNumber;
					}
					/**
					* 设置： 车厢
					*/
					public void setSectionNumber(Integer sectionNumber) {
						this.sectionNumber = sectionNumber;
					}

					/**
					* 获取： 座位
					*/
					public Integer getZuoweiNumber() {
						return zuoweiNumber;
					}
					/**
					* 设置： 座位
					*/
					public void setZuoweiNumber(Integer zuoweiNumber) {
						this.zuoweiNumber = zuoweiNumber;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getCheciDelete() {
						return checiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setCheciDelete(Integer checiDelete) {
						this.checiDelete = checiDelete;
					}

					/**
					* 获取： 经停站、到达时间详情
					*/
					public String getCheciContent() {
						return checiContent;
					}
					/**
					* 设置： 经停站、到达时间详情
					*/
					public void setCheciContent(String checiContent) {
						this.checiContent = checiContent;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 会员姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 会员姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 会员手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 会员手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 会员身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 会员身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
