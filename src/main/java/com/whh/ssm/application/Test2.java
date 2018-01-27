package com.whh.ssm.application;

import com.whh.ssm.model.Comment;
import com.whh.ssm.model.User;
import com.whh.ssm.service.CommentService;
import com.whh.ssm.service.UserService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Author: wanghh
 * Date: 2018/1/25 0025 下午 3:14
 * version: 1.0.0
 * description:
 */
public class Test2 {

    private UserService userService;

    private CommentService commentService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("classpath:spring/spring-bean.xml");
        Test2 teacher1= (Test2) context.getBean("test");
        teacher1.doWork();
    }

    private void doWork() {
        List<User> users = userService.getAllUser();
//        Comment comment = commentService.selectByPrimaryKey(1586315);
        System.out.println();
    }
}
