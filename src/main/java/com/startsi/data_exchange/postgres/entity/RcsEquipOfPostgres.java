package com.startsi.data_exchange.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 设备配置管理对象 rcs_equip
 *
 * @author ruoyi
 * @date 2024-01-31
 */
@Data
@Entity
@Table( name = "rcs_equip")
public class RcsEquipOfPostgres implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 设备ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String equipId;
    /**
     * 设备分组ID
     */
    private Long equipGroupId;
    /**
     * 设备名称
     */
    private String equipName;
    /**
     * 设备别名
     */
    private String equipAlias;
    /**
     * 设备状态，关联设备状态表
     */
    private String equipStateId;
    /**
     * 设备启停状态
     */
    private String equipOnoff;
    /**
     * 设备型号
     */
    private String equipModel;
    /**
     * 设备序列号
     */
    private String equipSeq;
    /**
     * 接口地址
     */
    private String url;
    /**
     * 所属道口;字典表:channel
     */
    private String channel;
    /**
     * 连接协议
     */
    private String connectProtocol;
    /**
     * 设备位置
     */
    private String equipPlace;
    /**
     * 备注说明
     */
    private String remark;
    /**
     * 坐标
     */
    private String extent;

    private String equipType;

    private String equipLongitude;

    private String equipLatitude;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;


}
