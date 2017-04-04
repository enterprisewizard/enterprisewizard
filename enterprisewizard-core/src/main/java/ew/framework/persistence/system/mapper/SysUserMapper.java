package ew.framework.persistence.system.mapper;

import java.util.List;

import dwz.dal.BaseMapper;
import ew.framework.persistence.BaseConditionVO;
import ew.framework.persistence.system.beans.SysUser;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser, Integer>{

	List<SysUser> findPageBreakByBaseCondition(BaseConditionVO vo, RowBounds rb);

	Integer findNumByBaseCondition(BaseConditionVO vo);
	
	Integer countByLoginId(String loginId);
	
	void updateStatus(SysUser sysUser);
	
	List<SysUser> findByName(String name);
}
