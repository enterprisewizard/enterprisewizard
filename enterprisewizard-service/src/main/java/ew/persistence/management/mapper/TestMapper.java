package ew.persistence.management.mapper;

import dwz.dal.BaseMapper;
import ew.persistence.management.beans.Test;

import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper extends BaseMapper<Test, Integer>{
	
}
