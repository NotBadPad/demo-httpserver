package com.gj.web.controller;

import java.util.Map;

import org.eh.core.annotation.RequestMapping;
import org.eh.core.common.ReturnType;
import org.eh.core.model.ResultInfo;
import org.eh.core.web.controller.Controller;

/**
 * redirect跳转测试
 * @author guojing
 * @date 2014-3-17
 */
@org.eh.core.annotation.Controller(name = "redirect", url = "/redirect/")
public class RedirectController implements Controller {

	@RequestMapping
	public ResultInfo baidu(Map<String, Object> map) {
		ResultInfo resultInfo = new ResultInfo();
		resultInfo.setView(ReturnType.redirect.name() + ":http://www.baidu.com/");
		return resultInfo;
	}
}
