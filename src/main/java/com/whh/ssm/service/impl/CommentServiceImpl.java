package com.whh.ssm.service.impl;

import com.whh.ssm.core.dao.AbstractBaseDao;
import com.whh.ssm.dao.CommentMapper;
import com.whh.ssm.model.Comment;
import com.whh.ssm.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * Author: wanghh
 * Date: 2018/1/25 0025 下午 5:24
 * version: 1.0.0
 * description:
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class CommentServiceImpl extends AbstractBaseDao implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public Comment selectByPrimaryKey(Integer id) {
        return commentMapper.selectByPrimaryKey(id);
    }
}
