package ew.framework.service.system;

import dwz.framework.sys.business.BusinessObjectServiceMgr;
import ew.framework.persistence.BaseConditionVO;
import ew.framework.persistence.system.beans.SysUser;
import ew.framework.vo.RetrieveVO;

public interface UserServiceMgr extends BusinessObjectServiceMgr {
	String SERVICE_NAME = "userServiceMgr";
//	
//	/**
//	 * 前台用户注册
//	 * 
//	 * @param user
//	 * @throws ServiceException 
//	 */
//	void register(User user) throws ServiceException;
//
//	void sendVerifyEmail(User user) throws ServiceException;
//	
//	void verify(String verifyCode) throws ServiceException;
//
	void create(SysUser obj) throws Exception ;

	RetrieveVO<SysUser> retrieve(BaseConditionVO vo);

	void update(SysUser obj) throws Exception ;

	void delete(Integer id) throws Exception ;
	
	SysUser getUserById(Integer id);
	
	void activeUser(Integer id);
	
	void inActiveUsesr(Integer id);
}
