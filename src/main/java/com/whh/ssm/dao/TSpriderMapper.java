package com.whh.ssm.dao;

import com.whh.ssm.core.dao.IBaseDao;
import com.whh.ssm.model.TSprider;

public interface TSpriderMapper extends IBaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TSprider record);

    int insertSelective(TSprider record);

    TSprider selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSprider record);

    int updateByPrimaryKey(TSprider record);
}