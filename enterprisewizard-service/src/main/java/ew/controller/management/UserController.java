package ew.controller.management;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import ew.common.util.StringUtils;
import ew.framework.controller.BaseController;
import ew.framework.persistence.BaseConditionVO;
import ew.framework.persistence.beans.SysUser;
import ew.framework.controller.rest.OperationResult;
import ew.framework.service.UserServiceMgr;
import ew.framework.vo.RetrieveVO;

@Controller("ew.management.userController")
@RequestMapping(value="/management/user")
public class UserController extends BaseController{
	
	@Autowired
	private UserServiceMgr userService;
	
	@RequestMapping(value="/load/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据id获取SysUser对象", httpMethod = "GET", response = SysUser.class, notes = "根据id获取SysUser对象")
	public SysUser getUserById(@ApiParam(required = true, name = "id", value = "用户名内部id") @PathVariable Integer id){
	    return userService.getUserById(id);
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "创建SysUser对象", httpMethod = "POST", response = OperationResult.class, notes = "创建SysUser对象")
	public OperationResult create(@RequestBody SysUser obj){
		if(obj != null)
		{
			try
			{
				String loginId = obj.getLoginId();
				if(StringUtils.isNotBlank(loginId))
				{
					userService.create(obj);
					return ajaxDoneSuccess(getMessage("msg.operation.success"));
				}
				else
				{
					return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", "loginId is null or empty");
				}
			}catch(Exception ex)
			{
				return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", ex.toString());
			}
		}
		else
		{
			return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", "SysUser is null");
		}
	}
	
	@RequestMapping(value="/retrieve", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "分页查询SysUser列表", httpMethod = "POST", response = RetrieveVO.class, notes = "分页查询SysUser列表")
	public RetrieveVO<SysUser> retrieve(@RequestBody BaseConditionVO vo){
		
		RetrieveVO<SysUser> result = userService.retrieve(vo);
		
		return result;
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "更新SysUser对象", httpMethod = "POST", response = OperationResult.class, notes = "更新SysUser对象")
	public OperationResult update(@RequestBody SysUser obj){
		if(obj != null)
		{
			try
			{
				Integer id = obj.getId();
				if(id != null)
				{
					userService.update(obj);
					return ajaxDoneSuccess(getMessage("msg.operation.success"));
				}
				else
				{
					return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", "id is null");
				}
			}catch(Exception ex)
			{
				return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", ex.toString());
			}
		}
		else
		{
			return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", "SysUser is null");
		}
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据id获取SysUser对象", httpMethod = "GET", response = SysUser.class, notes = "根据id获取SysUser对象")
	public OperationResult delete(@ApiParam(required = true, name = "id", value = "用户名内部id") @PathVariable Integer id){
		if(id != null)
		{
			try
			{
				userService.delete(id);
				return ajaxDoneSuccess(getMessage("msg.operation.success"));
			}catch(Exception ex)
			{
				return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", ex.toString());
			}
		}
		else
		{
			return ajaxDoneException(getMessage("msg.operation.failure")).addObject("errormsg", "id is null");
		}
	}
}
