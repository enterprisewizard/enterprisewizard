package ew.service.management.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ew.persistence.system.beans.Test;
import ew.persistence.system.mapper.TestMapper;
import ew.service.system.TestService;

@Transactional(rollbackFor = Exception.class)
@Service(TestService.SERVICE_NAME)
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public Test getTestById(Integer id) {
		return testMapper.load(id);
	}
}
