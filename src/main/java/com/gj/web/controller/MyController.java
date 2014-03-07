package com.gj.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.eh.core.model.ResultInfo;
import org.eh.core.web.controller.Controller;

/**
 *
 * @author guojing
 * @date 2014-3-4
 */
@org.eh.core.annotation.Controller(name = "my", url = "/test/list")
public class MyController implements Controller {

	public ResultInfo process(Map<String, Object> parms) {
		ResultInfo resultInfo = new ResultInfo();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", parms.get("name"));
		map.put("msg", parms.get("msg"));

		resultInfo.setResultMap(map);
		resultInfo.setView("json:[{\"name\":\"aaa\"},{\"value\":\"bbb\"},{\"msg\":\"ttt\"}]");
		return resultInfo;
	}

}
