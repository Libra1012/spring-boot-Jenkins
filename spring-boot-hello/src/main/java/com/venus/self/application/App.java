package com.venus.self.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 * 在这里，我们使用@SpringBootApplication指定一个spring boot的应用程序
 *
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ){
    	/*
    	 * 在main方法中启动应用程序
    	 */
    	SpringApplication.run(App.class, args);
    }
}
