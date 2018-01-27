package com.whh.ssm.dao;

import com.whh.ssm.core.dao.IBaseDao;
import com.whh.ssm.model.Comment;

public interface CommentMapper extends IBaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}