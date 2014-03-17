package com.gj.web.controller;

import java.util.Map;

import org.eh.core.annotation.RequestMapping;
import org.eh.core.http.HttpSession;
import org.eh.core.model.ResultInfo;
import org.eh.core.web.controller.Controller;

/**
 * session测试
 * @author guojing
 * @date 2014-3-17
 */
@org.eh.core.annotation.Controller(name = "session", url = "/session/")
public class SessionController implements Controller {

	@RequestMapping
	public ResultInfo set(Map<String, Object> map) {
		HttpSession session = (HttpSession) map.get("session");
		session.addAttribute("name", "guojing");
		session.addAttribute("msg", "session测试");

		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setView("redirect:http://127.0.0.1:8888/session/get.do");
		return resultInfo;
	}

	@RequestMapping
	public ResultInfo get(Map<String, Object> map) {
		HttpSession session = (HttpSession) map.get("session");
		String name = session.getAttribute("name").toString();
		String msg = session.getAttribute("msg").toString();

		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setView("json:[{\"name\":\"" + name + "\",\"msg\":\"" + msg + "\"}]");
		return resultInfo;
	}
}
