package ew.framework.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dwz.framework.sys.business.AbstractBusinessObjectServiceMgr;
import ew.framework.persistence.beans.SysUser;
import ew.framework.service.UserServiceMgr;

@Transactional(rollbackFor = Exception.class)
@Service(UserServiceMgr.SERVICE_NAME)
public class UserServiceImpl extends AbstractBusinessObjectServiceMgr implements UserServiceMgr {

	@Override
	public SysUser getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
