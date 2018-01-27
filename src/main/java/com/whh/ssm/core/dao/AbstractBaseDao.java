package com.whh.ssm.core.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * Author: wanghh
 * Date: 2018/1/25 0025 下午 2:12
 * version: 1.0.0
 * description:
 */
public abstract class AbstractBaseDao extends SqlSessionDaoSupport implements IBaseDao {
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}