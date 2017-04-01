package ew.controller.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import ew.controller.BaseController;
import ew.framework.persistence.beans.SysUser;
import ew.framework.service.UserServiceMgr;

@Controller("ew.management.userController")
@RequestMapping(value="/management/user")
public class UserController extends BaseController{
	
	@Autowired
	private UserServiceMgr userService;
	
	@RequestMapping(value="/load/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据id获取User对象", httpMethod = "GET", response = SysUser.class, notes = "根据id获取User对象")
	public SysUser getUserById(@ApiParam(required = true, name = "id", value = "用户名内部id") @PathVariable Integer id){
	    return userService.getUserById(id);
	}
}
