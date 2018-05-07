package com.leon.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lh on 2018/4/5.
 */
@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
	}

	@SuppressWarnings("unused")
	public String hiError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
