package ew.framework.persistence.mapper;

import dwz.dal.BaseMapper;
import ew.framework.persistence.beans.SysUser;

import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser, Integer>{

	SysUser loadUserById(Integer id);

	Integer countByLoginId(String loginId);
	
	
}
