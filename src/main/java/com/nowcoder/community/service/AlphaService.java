package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("singleton")    //每次访问Bean只创建一个实例,默认是单例

public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;  //当我们想调用AlphaDao时，将AlphaDao注入到AlphaService中即可；

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct  //初始化方法，在构造器之后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy     //销毁对象之后调用
    public void destory(){
        System.out.println("销毁AlphaService");
    }

    public String find(){
        return alphaDao.select();
    };
}
