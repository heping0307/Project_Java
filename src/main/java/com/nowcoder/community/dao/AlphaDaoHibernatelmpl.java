package com.nowcoder.community.dao;


import org.springframework.stereotype.Repository;

@Repository("alphaHiberbate") //需要Reposity注解才能被扫描到，给容器命名alphaHiberbate
public class AlphaDaoHibernatelmpl implements AlphaDao{

    @Override
    public String select() {
        return "Hiberbate";
    }
}
