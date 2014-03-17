package com.gj.web.controller;

import java.util.Map;

import org.eh.core.annotation.RequestMapping;
import org.eh.core.http.ApplicationContext;
import org.eh.core.model.ResultInfo;
import org.eh.core.web.controller.Controller;

/**
 *
 * @author guojing
 * @date 2014-3-17
 */
@org.eh.core.annotation.Controller(name = "application", url = "/application/")
public class ApplicationConroller implements Controller {

	@RequestMapping
	public ResultInfo set(Map<String, Object> map) {
		ApplicationContext.getApplicationContext().addAttribute("name", "guojing");
		ApplicationContext.getApplicationContext().addAttribute("msg", "session测试");

		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setView("用其他浏览器打开：http://127.0.0.1:8888/application/get.do");
		return resultInfo;
	}

	@RequestMapping
	public ResultInfo get(Map<String, Object> map) {
		String name = ApplicationContext.getApplicationContext().getAttribute("name").toString();
		String msg = ApplicationContext.getApplicationContext().getAttribute("msg").toString();

		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setView("json:[{\"name\":\"" + name + "\",\"msg\":\"" + msg + "\"}]");
		return resultInfo;
	}
}
