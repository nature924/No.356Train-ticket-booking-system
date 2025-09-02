package com.entity.model;

import com.entity.CheciEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 车次信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CheciModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer checiDelete;


    /**
     * 经停站、到达时间详情
     */
    private String checiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：车次标题
	 */
    public String getCheciName() {
        return checiName;
    }


    /**
	 * 设置：车次标题
	 */
    public void setCheciName(String checiName) {
        this.checiName = checiName;
    }
    /**
	 * 获取：火车照片
	 */
    public String getCheciPhoto() {
        return checiPhoto;
    }


    /**
	 * 设置：火车照片
	 */
    public void setCheciPhoto(String checiPhoto) {
        this.checiPhoto = checiPhoto;
    }
    /**
	 * 获取：火车类型
	 */
    public Integer getCheciTypes() {
        return checiTypes;
    }


    /**
	 * 设置：火车类型
	 */
    public void setCheciTypes(Integer checiTypes) {
        this.checiTypes = checiTypes;
    }
    /**
	 * 获取：现价
	 */
    public Double getCheciNewMoney() {
        return checiNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setCheciNewMoney(Double checiNewMoney) {
        this.checiNewMoney = checiNewMoney;
    }
    /**
	 * 获取：出发地
	 */
    public String getCheciChufadi() {
        return checiChufadi;
    }


    /**
	 * 设置：出发地
	 */
    public void setCheciChufadi(String checiChufadi) {
        this.checiChufadi = checiChufadi;
    }
    /**
	 * 获取：目的地
	 */
    public String getCheciMudidi() {
        return checiMudidi;
    }


    /**
	 * 设置：目的地
	 */
    public void setCheciMudidi(String checiMudidi) {
        this.checiMudidi = checiMudidi;
    }
    /**
	 * 获取：出发时间
	 */
    public Date getCheciTime() {
        return checiTime;
    }


    /**
	 * 设置：出发时间
	 */
    public void setCheciTime(Date checiTime) {
        this.checiTime = checiTime;
    }
    /**
	 * 获取：车厢
	 */
    public Integer getSectionNumber() {
        return sectionNumber;
    }


    /**
	 * 设置：车厢
	 */
    public void setSectionNumber(Integer sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
    /**
	 * 获取：座位
	 */
    public Integer getZuoweiNumber() {
        return zuoweiNumber;
    }


    /**
	 * 设置：座位
	 */
    public void setZuoweiNumber(Integer zuoweiNumber) {
        this.zuoweiNumber = zuoweiNumber;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getCheciDelete() {
        return checiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setCheciDelete(Integer checiDelete) {
        this.checiDelete = checiDelete;
    }
    /**
	 * 获取：经停站、到达时间详情
	 */
    public String getCheciContent() {
        return checiContent;
    }


    /**
	 * 设置：经停站、到达时间详情
	 */
    public void setCheciContent(String checiContent) {
        this.checiContent = checiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
