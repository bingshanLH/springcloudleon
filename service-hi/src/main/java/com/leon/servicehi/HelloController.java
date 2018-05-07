package com.leon.servicehi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lh on 2018/4/5.
 */
@RestController
@SuppressWarnings("unused")
public class HelloController {
	@RequestMapping(value = "/sdf")
	public void sdf(){
		System.out.println("sdf");
	}
}
