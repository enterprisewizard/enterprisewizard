package ew.framework.persistence.mapper;

import java.util.List;

import dwz.dal.BaseMapper;
import ew.framework.persistence.BaseConditionVO;
import ew.framework.persistence.beans.SysUser;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser, Integer>{

	SysUser loadUserById(Integer id);

	Integer countByLoginId(String loginId);

	List<SysUser> findPageBreakByBaseCondition(BaseConditionVO vo, RowBounds rb);

	Integer findNumByBaseCondition(BaseConditionVO vo);
	
	
}
