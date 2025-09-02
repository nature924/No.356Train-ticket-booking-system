package com.entity.view;

import com.entity.CheciEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 车次信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("checi")
public class CheciView extends CheciEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 火车类型的值
		*/
		private String checiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public CheciView() {

	}

	public CheciView(CheciEntity checiEntity) {
		try {
			BeanUtils.copyProperties(this, checiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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








}
