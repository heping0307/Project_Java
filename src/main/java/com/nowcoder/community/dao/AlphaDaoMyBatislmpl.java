package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository  //需要Repository注解才能被扫描到
@Primary    //Primary注解，表示会被优先扫描到
public class AlphaDaoMyBatislmpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
