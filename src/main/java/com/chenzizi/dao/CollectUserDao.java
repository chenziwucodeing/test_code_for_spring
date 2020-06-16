package com.chenzizi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenzizi.entity.CollectUserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * app采集人员用户
 * 
 * @author chenziwu
 * @date 2020-04-23 14:48:50
 */
@Mapper
public interface CollectUserDao extends BaseMapper<CollectUserDO> {

    List<String> f1();

    List<String> f2();
	
}
