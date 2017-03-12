package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.common.RestultFul;
import com.test.model.request.UserCon;
import com.test.request.UserApiRequest;
import com.test.server.QuestionServer;

@RequestMapping("question/")
public class QuestionController {
	private static final Logger LOG = LoggerFactory
			.getLogger(QuestionController.class);
	@Autowired
	QuestionServer questionServer;

	@RequestMapping("random")
	@ResponseBody
	public RestultFul getRandom() {
		RestultFul res = new RestultFul();
		try {
			int result = questionServer.getRanDom();
			res.setData(result);
			return res;
		} catch (Exception e) {
			LOG.error("系统异常", e.getMessage());
			res.setReturnCode("9999");
			res.setMsg("系统异常");
			return res;
		}
	}

	@RequestMapping("addUser")
	@ResponseBody
	public RestultFul add(UserCon uc) {
		RestultFul res = new RestultFul();
		try {
			UserApiRequest ua = new UserApiRequest();
			BeanUtils.copyProperties(uc, ua);
			Boolean bl = questionServer.insert(ua);
			if (bl) {
				return res;
			} else {
				res.setReturnCode("9999");
				res.setMsg("系统异常");
				return res;
			}
		} catch (Exception e) {
			LOG.error("系统异常", e.getMessage());
			res.setReturnCode("9999");
			res.setMsg("系统异常");
			return res;

		}
	}
}
