package dwz.framework.sys.exception;

import java.util.Map;

import ew.framework.rest.OperationResult;

public class ServiceVLDException extends RuntimeException {
	private OperationResult operResult;
	public ServiceVLDException(){
		operResult = new OperationResult();
	}
	public ServiceVLDException(OperationResult operResult){
		this.operResult = operResult;
	}
	
	public ServiceVLDException addObject(String attributeName, Object attributeValue) {
		operResult.addObject(attributeName, attributeValue);
		return this;
	}
	public ServiceVLDException addObject(Object attributeValue) {
		return addObject("", attributeValue);
	}
	public ServiceVLDException addAllObjects(Map<String, ?> modelMap) {
		operResult.addAllObjects(modelMap);
		return this;
	}
	public OperationResult getOperResult() {
		return operResult;
	}

}
