package com.chenzizi.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallFilter;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *描述: 自定义的 DruidDataSource 在结合  shardingsphere 使用的时候， 数据库连接池不好配置，可以用这种方法配置DruidDataSource
 * @author chenziwu
 * @date 2020/5/9 16:18
*/
public class MyDruidDataSource extends DruidDataSource {


    public MyDruidDataSource() throws SQLException {
        StatFilter filter = new StatFilter();
        filter.setSlowSqlMillis(1);
        filter.setLogSlowSql(true);
        filter.setMergeSql(true);

        WallFilter wallFilter=new WallFilter();
        WallConfig wallConfig=new WallConfig();
        wallConfig.setMultiStatementAllow(true);
        wallFilter.setConfig(wallConfig);

        List<Filter> list = new ArrayList<>();
        list.add(filter);
        list.add(wallFilter);
        setProxyFilters(list);
    }

}
