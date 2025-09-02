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
 * 车次信息
 *
 * @author 
 * @email
 */
@TableName("checi")
public class CheciEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CheciEntity() {

	}

	public CheciEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 车次标题
     */
    @TableField(value = "checi_name")

    private String checiName;


    /**
     * 火车照片
     */
    @TableField(value = "checi_photo")

    private String checiPhoto;


    /**
     * 火车类型
     */
    @TableField(value = "checi_types")

    private Integer checiTypes;


    /**
     * 现价
     */
    @TableField(value = "checi_new_money")

    private Double checiNewMoney;


    /**
     * 出发地
     */
    @TableField(value = "checi_chufadi")

    private String checiChufadi;


    /**
     * 目的地
     */
    @TableField(value = "checi_mudidi")

    private String checiMudidi;


    /**
     * 出发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "checi_time")

    private Date checiTime;


    /**
     * 车厢
     */
    @TableField(value = "section_number")

    private Integer sectionNumber;


    /**
     * 座位
     */
    @TableField(value = "zuowei_number")

    private Integer zuoweiNumber;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "checi_delete")

    private Integer checiDelete;


    /**
     * 经停站、到达时间详情
     */
    @TableField(value = "checi_content")

    private String checiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：车次标题
	 */
    public String getCheciName() {
        return checiName;
    }
    /**
	 * 获取：车次标题
	 */

    public void setCheciName(String checiName) {
        this.checiName = checiName;
    }
    /**
	 * 设置：火车照片
	 */
    public String getCheciPhoto() {
        return checiPhoto;
    }
    /**
	 * 获取：火车照片
	 */

    public void setCheciPhoto(String checiPhoto) {
        this.checiPhoto = checiPhoto;
    }
    /**
	 * 设置：火车类型
	 */
    public Integer getCheciTypes() {
        return checiTypes;
    }
    /**
	 * 获取：火车类型
	 */

    public void setCheciTypes(Integer checiTypes) {
        this.checiTypes = checiTypes;
    }
    /**
	 * 设置：现价
	 */
    public Double getCheciNewMoney() {
        return checiNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setCheciNewMoney(Double checiNewMoney) {
        this.checiNewMoney = checiNewMoney;
    }
    /**
	 * 设置：出发地
	 */
    public String getCheciChufadi() {
        return checiChufadi;
    }
    /**
	 * 获取：出发地
	 */

    public void setCheciChufadi(String checiChufadi) {
        this.checiChufadi = checiChufadi;
    }
    /**
	 * 设置：目的地
	 */
    public String getCheciMudidi() {
        return checiMudidi;
    }
    /**
	 * 获取：目的地
	 */

    public void setCheciMudidi(String checiMudidi) {
        this.checiMudidi = checiMudidi;
    }
    /**
	 * 设置：出发时间
	 */
    public Date getCheciTime() {
        return checiTime;
    }
    /**
	 * 获取：出发时间
	 */

    public void setCheciTime(Date checiTime) {
        this.checiTime = checiTime;
    }
    /**
	 * 设置：车厢
	 */
    public Integer getSectionNumber() {
        return sectionNumber;
    }
    /**
	 * 获取：车厢
	 */

    public void setSectionNumber(Integer sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
    /**
	 * 设置：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }
    /**
	 * 获取：座位
	 */

    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getCheciDelete() {
        return checiDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setCheciDelete(Integer checiDelete) {
        this.checiDelete = checiDelete;
    }
    /**
	 * 设置：经停站、到达时间详情
	 */
    public String getCheciContent() {
        return checiContent;
    }
    /**
	 * 获取：经停站、到达时间详情
	 */

    public void setCheciContent(String checiContent) {
        this.checiContent = checiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Checi{" +
            "id=" + id +
            ", checiName=" + checiName +
            ", checiPhoto=" + checiPhoto +
            ", checiTypes=" + checiTypes +
            ", checiNewMoney=" + checiNewMoney +
            ", checiChufadi=" + checiChufadi +
            ", checiMudidi=" + checiMudidi +
            ", checiTime=" + checiTime +
            ", sectionNumber=" + sectionNumber +
            ", zuoweiNumber=" + zuoweiNumber +
            ", shangxiaTypes=" + shangxiaTypes +
            ", checiDelete=" + checiDelete +
            ", checiContent=" + checiContent +
            ", createTime=" + createTime +
        "}";
    }
}
