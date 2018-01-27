package com.whh.ssm.service;

import com.whh.ssm.model.Comment;

/**
 * Created by IntelliJ IDEA.
 * Author: wanghh
 * Date: 2018/1/25 0025 下午 5:23
 * version: 1.0.0
 * description:
 */
public interface CommentService {

    Comment selectByPrimaryKey(Integer id);

}
