package ew.framework.vo;

import java.util.List;

public class RetrieveVO<T> {
	
	public RetrieveVO(){}
	public RetrieveVO(List<T> dataList, Integer totalCount, Object data){
		this.dataList = dataList;
		this.totalCount = totalCount;
		this.data = data;
	}
	
	public RetrieveVO(List<T> dataList, Integer totalCount){
		this.dataList = dataList;
		this.totalCount = totalCount;
	}
	
	private List<T> dataList;
	private Integer totalCount;
	private Object data;
	public List<T> getDataList() {
		return dataList;
	}
	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
