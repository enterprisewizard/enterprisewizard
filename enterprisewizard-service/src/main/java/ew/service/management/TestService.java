package ew.service.management;

import ew.persistence.management.beans.Test;


public interface TestService {
	String SERVICE_NAME = "testServiceMgr";

	Test getTestById(Integer id);

}
