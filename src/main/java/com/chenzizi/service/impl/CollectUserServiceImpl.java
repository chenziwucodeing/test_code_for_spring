package com.chenzizi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenzizi.dao.CollectUserDao;
import com.chenzizi.entity.CollectUserDO;
import com.chenzizi.service.ICollectUserService;
import org.springframework.stereotype.Service;

@Service
public class CollectUserServiceImpl extends ServiceImpl<CollectUserDao, CollectUserDO> implements ICollectUserService {
    @Override
    public void f1() {
        this.baseMapper.f1();
    }

    @Override
    public void f2() {
        this.baseMapper.f2();
    }
}
