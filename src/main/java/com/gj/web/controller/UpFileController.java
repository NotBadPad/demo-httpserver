package com.gj.web.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.eh.core.annotation.RequestMapping;
import org.eh.core.model.FileInfo;
import org.eh.core.model.ResultInfo;
import org.eh.core.web.controller.Controller;

/**
 * 文件上传示例
 * @author guojing
 * @date 2014-3-10
 */
@org.eh.core.annotation.Controller(name = "file", url = "/upfile/")
public class UpFileController implements Controller {

	@RequestMapping
	public ResultInfo upload(Map<String, Object> parms) {
		ResultInfo re = new ResultInfo();

		FileInfo fileInfo = (FileInfo) parms.get("myfile");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(System.getProperty("user.dir") + "\\temp\\"
					+ fileInfo.getFilename());
			fos.write(fileInfo.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		re.setView("json:[{\"success\":\"true\",\"msg\":\"文件上传成功\"}]");
		return re;
	}

}
