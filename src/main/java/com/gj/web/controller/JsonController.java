package com.gj.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.eh.core.annotation.RequestMapping;
import org.eh.core.common.ReturnType;
import org.eh.core.model.ResultInfo;
import org.eh.core.web.controller.Controller;

/**
 * Json使用示例
 * @author guojing
 * @date 2014-3-4
 */
@org.eh.core.annotation.Controller(name = "my", url = "/json/")
public class JsonController implements Controller {

	@RequestMapping
	public ResultInfo show(Map<String, Object> parms) {
		ResultInfo resultInfo = new ResultInfo();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", parms.get("name"));
		map.put("msg", parms.get("msg"));

		resultInfo.setResultMap(map);
		resultInfo.setView(ReturnType.json.name()
				+ ":[{\"name\":\"aaa\"},{\"value\":\"bbb\"},{\"msg\":\"ttt\"}]");
		return resultInfo;
	}

}
