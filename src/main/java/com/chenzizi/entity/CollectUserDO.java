package com.chenzizi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * app采集人员用户
 * 
 * @author chenziwu
 * @date 2020-04-23 14:48:50
 */
@TableName("app_collect_user")
@Data
public class CollectUserDO  {

    /**
     * id
     */
	@TableId(type = IdType.UUID)
	private String id;
    /**
     * 帐号
     */
	private String username;
    /**
     * 密码
     */
	private String password;
    /**
     * 昵称
     */
	private String nickname;
	/**
	 * 状态 0:停用，1启用
	 */
	private Integer state;
    /**
     * 备注
     */
	private String remark;



}
