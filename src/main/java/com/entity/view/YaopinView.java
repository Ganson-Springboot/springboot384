package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YaopinEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 药品
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yaopin")
public class YaopinView extends YaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 处方药的值
	*/
	@ColumnInfo(comment="处方药的字典表值",type="varchar(200)")
	private String chufangyaoValue;
	/**
	* 药品类型的值
	*/
	@ColumnInfo(comment="药品类型的字典表值",type="varchar(200)")
	private String yaopinValue;
	/**
	* 二级类型的值
	*/
	@ColumnInfo(comment="二级类型的字典表值",type="varchar(200)")
	private String yaopinErjiValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;




	public YaopinView() {

	}

	public YaopinView(YaopinEntity yaopinEntity) {
		try {
			BeanUtils.copyProperties(this, yaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 处方药的值
	*/
	public String getChufangyaoValue() {
		return chufangyaoValue;
	}
	/**
	* 设置： 处方药的值
	*/
	public void setChufangyaoValue(String chufangyaoValue) {
		this.chufangyaoValue = chufangyaoValue;
	}
	//当前表的
	/**
	* 获取： 药品类型的值
	*/
	public String getYaopinValue() {
		return yaopinValue;
	}
	/**
	* 设置： 药品类型的值
	*/
	public void setYaopinValue(String yaopinValue) {
		this.yaopinValue = yaopinValue;
	}
	//当前表的
	/**
	* 获取： 二级类型的值
	*/
	public String getYaopinErjiValue() {
		return yaopinErjiValue;
	}
	/**
	* 设置： 二级类型的值
	*/
	public void setYaopinErjiValue(String yaopinErjiValue) {
		this.yaopinErjiValue = yaopinErjiValue;
	}
	//当前表的
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




	@Override
	public String toString() {
		return "YaopinView{" +
			", chufangyaoValue=" + chufangyaoValue +
			", yaopinValue=" + yaopinValue +
			", yaopinErjiValue=" + yaopinErjiValue +
			", shangxiaValue=" + shangxiaValue +
			"} " + super.toString();
	}
}
