package com.venus.Application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 等价于@controller 和@requestBody
 * @author venus
 *
 */
@RestController
public class HelloController {

	/**
	 * 这里我们使用requestmapping，建立请求映射
	 * http://127.0.0.1:8080/helloSpring
	 * @return
	 */
	@RequestMapping("/helloSpring")
	public String hello() {
		return "hello spring boot";
		
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("卷卷");
		return demo;
	}
}
