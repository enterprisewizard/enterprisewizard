package ew.persistence.system.mapper;

import dwz.dal.BaseMapper;
import ew.persistence.system.beans.Test;

import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper extends BaseMapper<Test, Integer>{
	
}
