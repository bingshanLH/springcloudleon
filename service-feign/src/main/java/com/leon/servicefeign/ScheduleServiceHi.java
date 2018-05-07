package com.leon.servicefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lh on 2018/4/12.
 */
@FeignClient(value = "service-hi")
public interface ScheduleServiceHi {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
