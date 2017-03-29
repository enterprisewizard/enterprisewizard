package ew.framework.rest;

import java.util.Map;

import org.springframework.ui.ModelMap;

public class OperationResult{
	
	/** Model Map */
	private ModelMap model;

	/** Indicates whether or not this instance has been cleared with a call to {@link #clear()} */
	private boolean cleared = false;
	
	public OperationResult(){
		this.statusCode = 200;
	}
	public OperationResult(String message){
		this.message = message;
	}
	public OperationResult(int statusCode, String message){
		this.statusCode = statusCode;
		this.message = message;
	}
	public OperationResult(int statusCode, String message, String view){
		this.statusCode = statusCode;
		this.message = message;
	}
	private String message;
	private int statusCode = 200;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	/**
	 * Add an attribute to the model.
	 * @param attributeName name of the object to add to the model
	 * @param attributeValue object to add to the model (never {@code null})
	 * @see ModelMap#addAttribute(String, Object)
	 * @see #getModelMap()
	 */
	public OperationResult addObject(String attributeName, Object attributeValue) {
		getModel().addAttribute(attributeName, attributeValue);
		return this;
	}
	
	/**
	 * Add an attribute to the model using parameter name generation.
	 * @param attributeValue the object to add to the model (never {@code null})
	 * @see ModelMap#addAttribute(Object)
	 * @see #getModelMap()
	 */
	public OperationResult addObject(Object attributeValue) {
		getModel().addAttribute(attributeValue);
		return this;
	}
	
	/**
	 * Add all attributes contained in the provided Map to the model.
	 * @param modelMap a Map of attributeName -> attributeValue pairs
	 * @see ModelMap#addAllAttributes(Map)
	 * @see #getModelMap()
	 */
	public OperationResult addAllObjects(Map<String, ?> modelMap) {
		getModel().addAllAttributes(modelMap);
		return this;
	}
	
	/**
	 * Return the underlying {@code ModelMap} instance (never {@code null}).
	 */
	public ModelMap getModel() {
		if (this.model == null) {
			this.model = new ModelMap();
		}
		return this.model;
	}
}
