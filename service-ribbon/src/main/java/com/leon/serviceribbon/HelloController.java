package com.leon.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lh on 2018/4/5.
 */
@RestController
@SuppressWarnings("unused")
public class HelloController {
	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}

}
