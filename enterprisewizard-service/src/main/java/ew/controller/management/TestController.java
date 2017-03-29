package ew.controller.management;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import ew.controller.BaseController;
import ew.persistence.management.beans.Test;
import ew.service.management.TestService;

@Controller
@RequestMapping(value="/testapi")
public class TestController extends BaseController{
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/test/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据id获取Test对象", httpMethod = "GET", response = Test.class, notes = "根据id获取Test对象")
	public Map<String, Object> getUserByName(@ApiParam(required = true, name = "id", value = "用户名") @PathVariable Integer id) throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
	    Test test = testService.getTestById(id);

	    if(test != null) {
	        result.put("test", test);
	    } else {
	        throw new Exception("根据{id=" + id + "}获取不到Test对象");
	    }
	    return result;
	}
}
