package org.example;

/**
 *
 **SpringBoot的启动类通常放在二级包中，
 * 比如:com.yjl.SpringBootDemo1Application*因为SpringBoot项目在做包扫描，
 * 会扫描启动类所在的包及其子包下的所有内容
 */
@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}
