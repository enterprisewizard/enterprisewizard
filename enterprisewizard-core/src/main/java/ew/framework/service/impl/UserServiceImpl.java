package ew.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dwz.framework.sys.business.AbstractBusinessObjectServiceMgr;
import ew.framework.persistence.beans.SysUser;
import ew.framework.persistence.mapper.SysUserMapper;
import ew.framework.service.UserServiceMgr;

@Transactional(rollbackFor = Exception.class)
@Service(UserServiceMgr.SERVICE_NAME)
public class UserServiceImpl extends AbstractBusinessObjectServiceMgr implements UserServiceMgr {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser getUserById(Integer id) {
		// TODO Auto-generated method stub
		
		return sysUserMapper.loadUserById(id);
	}
}
