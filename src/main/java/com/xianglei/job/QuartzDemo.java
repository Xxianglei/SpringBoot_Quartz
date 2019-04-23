package com.xianglei.job;

import com.xianglei.service.UsersService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 定义定时任务
 */
public class QuartzDemo implements Job {
    @Autowired
    UsersService usersService;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时任务在执行："+new Date());
        usersService.addUsers();
    }
}
