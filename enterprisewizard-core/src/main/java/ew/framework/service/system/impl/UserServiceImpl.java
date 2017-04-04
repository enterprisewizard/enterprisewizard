package ew.framework.service.system.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dwz.framework.sys.business.AbstractBusinessObjectServiceMgr;
import ew.framework.persistence.BaseConditionVO;
import ew.framework.persistence.system.beans.SysUser;
import ew.framework.persistence.system.mapper.SysUserMapper;
import ew.framework.service.system.UserServiceMgr;
import ew.framework.vo.RetrieveVO;

@Transactional(rollbackFor = Exception.class)
@Service(UserServiceMgr.SERVICE_NAME)
public class UserServiceImpl extends AbstractBusinessObjectServiceMgr implements UserServiceMgr {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public void create(SysUser obj) throws Exception {
		Integer loginIdCount = sysUserMapper.countByLoginId(obj.getLoginId());
		if(loginIdCount <= 0){
			sysUserMapper.insert(obj);
		}else{
			throw new Exception("loginId is repeat");
		}
	}

	@Override
	public RetrieveVO<SysUser> retrieve(BaseConditionVO vo) {
		RowBounds rb = new RowBounds(vo.getStartIndex(), vo.getPageSize());
		List<SysUser> dataList = sysUserMapper.findPageBreakByBaseCondition(vo, rb);
		Integer totalCount = sysUserMapper.findNumByBaseCondition(vo);
		return new RetrieveVO<SysUser>(dataList, totalCount);
	}

	@Override
	public void update(SysUser obj) throws Exception {
		sysUserMapper.update(obj);
	}

	@Override
	public void delete(Integer id) throws Exception {
		sysUserMapper.delete(id);
	}
	
	@Override
	public SysUser getUserById(Integer id) {
		return sysUserMapper.load(id);
	}

	@Override
	public void activeUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inActiveUsesr(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
