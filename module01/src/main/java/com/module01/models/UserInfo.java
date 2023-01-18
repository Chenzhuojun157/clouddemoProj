package com.module01.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserInfo {

    @ApiModelProperty(value = "人员ID 新增传0")
    @TableId(type = IdType.AUTO)
    private long id;
    @ApiModelProperty(value = "用户编号")
    private String userCode;
    @ApiModelProperty(value = "用户姓名")
    private String userName;
    @ApiModelProperty(value = "所属组织机构ID")
    private long userDept;
    @ApiModelProperty(value = "性别")
    private String userSex;
    @ApiModelProperty(value = "证件类型")
    private String userIdType;
    @ApiModelProperty(value = "证件号码")
    private String userIdNo;
    @ApiModelProperty(value = "身份类别ID")
    private String userRole;
    @ApiModelProperty(value = "人员状态")
    private String userState;
    @ApiModelProperty(value = "离校时间")
    private String userLeaveTime;
    @ApiModelProperty(value = "用户电话")
    private String userTel;
    @ApiModelProperty(value = "通信地址")
    private String userAddress;
    @ApiModelProperty(value = "是否住校（字典：DICT_TYPE=SYS_BOOL_STRING）")
    private String userIsBoarders;
    @ApiModelProperty(value = "银行卡号")
    private String userBankNo;
    @ApiModelProperty(value = "交易密码")
    private String userTransPwd;
    @ApiModelProperty(value = "用户状态（字典：DICT_TYPE=SYS_ENABLE）")
    private String userAccountState;
    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String userBirthday;
    @ApiModelProperty(value = "用户照片")
    private String userPhoto;
    @ApiModelProperty(value = "备注")
    private String userRemark;
    @ApiModelProperty(value = "数据来源（字典数据：DICT_TYPE=SYS_DATA_SOURCE）")
    private String userSource;
    @ApiModelProperty(value = "组织机构名称")
    private String deptName;
    @ApiModelProperty(value = "身份类别")
    private String roleName;

}
