package ew.service.system;

import ew.persistence.system.beans.Test;


public interface TestService {
	String SERVICE_NAME = "testServiceMgr";

	Test getTestById(Integer id);

}
