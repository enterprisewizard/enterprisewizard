package ew.framework.controller;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import dwz.common.util.ServerInfo;
import dwz.framework.config.AppConfiguration;
import dwz.framework.config.Constants;
import dwz.framework.sys.exception.ServiceVLDException;
import dwz.web.editor.DateEditor;
import dwz.web.editor.DoubleEditor;
import dwz.web.editor.IntegerEditor;
import dwz.web.editor.LongEditor;
import ew.framework.controller.rest.OperationResult;

public abstract class BaseController {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ResourceBundleMessageSource _res;
	
//	@Autowired
//	protected SpringContextHolder _contextHolder;

	@InitBinder
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		
		binder.registerCustomEditor(int.class, new IntegerEditor());
		binder.registerCustomEditor(long.class, new LongEditor());
		binder.registerCustomEditor(double.class, new DoubleEditor());
		binder.registerCustomEditor(Date.class, new DateEditor());
	}

	protected OperationResult ajaxDone(int statusCode, String message, String forwardUrl) {
		OperationResult mav = new OperationResult(statusCode, message, forwardUrl);
		//mav.addObject("statusCode", statusCode);
		//mav.addObject("message", message);
		//mav.addObject("forwardUrl", forwardUrl);
		return mav;
	}
	
	protected OperationResult ajaxDone(int statusCode, String message) {
		OperationResult mav = new OperationResult(statusCode, message);
		//mav.addObject("statusCode", statusCode);
		//mav.addObject("message", message);
		//mav.addObject("forwardUrl", forwardUrl);
		return mav;
	}
	
	protected OperationResult ajaxDoneSuccess(String message) {
		return ajaxDone(200, message);
	}

	protected OperationResult ajaxDoneError(String message) {
		return ajaxDone(300, message);
	}
	
	protected OperationResult ajaxDoneException(String message) {
		//OperationResult result =  ajaxDone(300, message);
		return ajaxDone(300, message);
		//return new ServiceVLDException(result);
		
	}
	protected String getMessage(String code) {
		return this.getMessage(code, new Object[] {});
	}

	protected String getMessage(String code, Object arg0) {
		return getMessage(code, new Object[] { arg0 });
	}

	protected String getMessage(String code, Object arg0, Object arg1) {
		return getMessage(code, new Object[] { arg0, arg1 });
	}

	protected String getMessage(String code, Object arg0, Object arg1,
			Object arg2) {
		return getMessage(code, new Object[] { arg0, arg1, arg2 });
	}

	protected String getMessage(String code, Object arg0, Object arg1,
			Object arg2, Object arg3) {
		return getMessage(code, new Object[] { arg0, arg1, arg2, arg3 });
	}

	protected String getMessage(String code, Object[] args) {
		//HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		//LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
		//Locale locale = localeResolver.resolveLocale(request);

		return _res.getMessage(code, args, Locale.SIMPLIFIED_CHINESE);
	}
	
	protected AppConfiguration getAppConfig() {
		return AppConfiguration.getInstance();
	}
	
	protected boolean verifyValidationCode(
			String validationCode) {

		boolean enableVerify = getAppConfig()
				.getBoolean("validation-code.validation-code-enable");

		if (enableVerify) {
			if (validationCode == null)
				return false;

			String randomCode = null;
			try {
				randomCode = (String) request.getSession().getAttribute(
						Constants.VALIDATION_CODE);
				System.out.println(randomCode + " : " + validationCode);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (randomCode == null)
				return false;
			else if (!randomCode.equalsIgnoreCase(validationCode.trim()))
				return false;
		}
		return true;
	}
	
	@ExceptionHandler(Exception.class)
	public OperationResult exception(Exception e, HttpServletRequest request) {
		e.printStackTrace();
		
		request.setAttribute("exception", e);
		
		if (ServerInfo.isAjax(request) || request.getParameter("ajax") != null) {
			return ajaxDoneError(e.getMessage());
		}
		
		OperationResult mav = new OperationResult("error");
		mav.addObject("statusCode", 300);
		mav.addObject("message", e.getMessage());
		
		return mav;
	}
}

