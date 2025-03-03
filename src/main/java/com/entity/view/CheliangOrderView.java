package com.entity.view;

import com.entity.CheliangOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车辆订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("cheliang_order")
public class CheliangOrderView extends CheliangOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String cheliangOrderValue;
		/**
		* 支付类型的值
		*/
		private String cheliangOrderPaymentValue;



		//级联表 cheliang
			/**
			* 车辆编号
			*/
			private String cheliangUuidNumber;
			/**
			* 车辆名称
			*/
			private String cheliangName;
			/**
			* 车辆照片
			*/
			private String cheliangPhoto;
			/**
			* 车辆类型
			*/
			private Integer cheliangTypes;
				/**
				* 车辆类型的值
				*/
				private String cheliangValue;
			/**
			* 租用原价/小时
			*/
			private Double cheliangOldMoney;
			/**
			* 现价/小时
			*/
			private Double cheliangNewMoney;
			/**
			* 点击次数
			*/
			private Integer cheliangClicknum;
			/**
			* 车辆位置
			*/
			private String cheliangAddress;
			/**
			* 车辆状态
			*/
			private Integer cheziTypes;
				/**
				* 车辆状态的值
				*/
				private String cheziValue;
			/**
			* 租用状态
			*/
			private Integer zuyongTypes;
				/**
				* 租用状态的值
				*/
				private String zuyongValue;
			/**
			* 车辆详情
			*/
			private String cheliangContent;
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
			private Integer cheliangDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public CheliangOrderView() {

	}

	public CheliangOrderView(CheliangOrderEntity cheliangOrderEntity) {
		try {
			BeanUtils.copyProperties(this, cheliangOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getCheliangOrderValue() {
				return cheliangOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setCheliangOrderValue(String cheliangOrderValue) {
				this.cheliangOrderValue = cheliangOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getCheliangOrderPaymentValue() {
				return cheliangOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setCheliangOrderPaymentValue(String cheliangOrderPaymentValue) {
				this.cheliangOrderPaymentValue = cheliangOrderPaymentValue;
			}




				//级联表的get和set cheliang
					/**
					* 获取： 车辆编号
					*/
					public String getCheliangUuidNumber() {
						return cheliangUuidNumber;
					}
					/**
					* 设置： 车辆编号
					*/
					public void setCheliangUuidNumber(String cheliangUuidNumber) {
						this.cheliangUuidNumber = cheliangUuidNumber;
					}
					/**
					* 获取： 车辆名称
					*/
					public String getCheliangName() {
						return cheliangName;
					}
					/**
					* 设置： 车辆名称
					*/
					public void setCheliangName(String cheliangName) {
						this.cheliangName = cheliangName;
					}
					/**
					* 获取： 车辆照片
					*/
					public String getCheliangPhoto() {
						return cheliangPhoto;
					}
					/**
					* 设置： 车辆照片
					*/
					public void setCheliangPhoto(String cheliangPhoto) {
						this.cheliangPhoto = cheliangPhoto;
					}
					/**
					* 获取： 车辆类型
					*/
					public Integer getCheliangTypes() {
						return cheliangTypes;
					}
					/**
					* 设置： 车辆类型
					*/
					public void setCheliangTypes(Integer cheliangTypes) {
						this.cheliangTypes = cheliangTypes;
					}


						/**
						* 获取： 车辆类型的值
						*/
						public String getCheliangValue() {
							return cheliangValue;
						}
						/**
						* 设置： 车辆类型的值
						*/
						public void setCheliangValue(String cheliangValue) {
							this.cheliangValue = cheliangValue;
						}
					/**
					* 获取： 租用原价/小时
					*/
					public Double getCheliangOldMoney() {
						return cheliangOldMoney;
					}
					/**
					* 设置： 租用原价/小时
					*/
					public void setCheliangOldMoney(Double cheliangOldMoney) {
						this.cheliangOldMoney = cheliangOldMoney;
					}
					/**
					* 获取： 现价/小时
					*/
					public Double getCheliangNewMoney() {
						return cheliangNewMoney;
					}
					/**
					* 设置： 现价/小时
					*/
					public void setCheliangNewMoney(Double cheliangNewMoney) {
						this.cheliangNewMoney = cheliangNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getCheliangClicknum() {
						return cheliangClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setCheliangClicknum(Integer cheliangClicknum) {
						this.cheliangClicknum = cheliangClicknum;
					}
					/**
					* 获取： 车辆位置
					*/
					public String getCheliangAddress() {
						return cheliangAddress;
					}
					/**
					* 设置： 车辆位置
					*/
					public void setCheliangAddress(String cheliangAddress) {
						this.cheliangAddress = cheliangAddress;
					}
					/**
					* 获取： 车辆状态
					*/
					public Integer getCheziTypes() {
						return cheziTypes;
					}
					/**
					* 设置： 车辆状态
					*/
					public void setCheziTypes(Integer cheziTypes) {
						this.cheziTypes = cheziTypes;
					}


						/**
						* 获取： 车辆状态的值
						*/
						public String getCheziValue() {
							return cheziValue;
						}
						/**
						* 设置： 车辆状态的值
						*/
						public void setCheziValue(String cheziValue) {
							this.cheziValue = cheziValue;
						}
					/**
					* 获取： 租用状态
					*/
					public Integer getZuyongTypes() {
						return zuyongTypes;
					}
					/**
					* 设置： 租用状态
					*/
					public void setZuyongTypes(Integer zuyongTypes) {
						this.zuyongTypes = zuyongTypes;
					}


						/**
						* 获取： 租用状态的值
						*/
						public String getZuyongValue() {
							return zuyongValue;
						}
						/**
						* 设置： 租用状态的值
						*/
						public void setZuyongValue(String zuyongValue) {
							this.zuyongValue = zuyongValue;
						}
					/**
					* 获取： 车辆详情
					*/
					public String getCheliangContent() {
						return cheliangContent;
					}
					/**
					* 设置： 车辆详情
					*/
					public void setCheliangContent(String cheliangContent) {
						this.cheliangContent = cheliangContent;
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
					public Integer getCheliangDelete() {
						return cheliangDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setCheliangDelete(Integer cheliangDelete) {
						this.cheliangDelete = cheliangDelete;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
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



}
