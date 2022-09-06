package com.nowcoder.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    controller调用service，service调用dao；
    因此在开发上面一般先是开发dao，再开发service，然后开发controller
    先开发数据访问层，再开发业务层，然后开发视图层；0
 */
@SpringBootApplication
public class CommunityApplication {

	public static void main(String[] args) {
		/*
		SpringApplication底层自动创建Spring容器，然后自动扫描bin目录下的文件
		 */
		SpringApplication.run(CommunityApplication.class, args);
	}

}
