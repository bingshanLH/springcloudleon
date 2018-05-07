package com.leon.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lh on 2018/4/12.
 */
@RestController
@SuppressWarnings("unused")
public class HiController {

	@Autowired
	ScheduleServiceHi scheduleServiceHi;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		return scheduleServiceHi.sayHiFromClientOne(name);
	}
}
