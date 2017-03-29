package ew.persistence.management.beans;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import dwz.dal.object.AbstractDO;

public class Test extends AbstractDO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2549770144649770858L;
	private Integer id;
	private String name;
	private Date updtim;
	private String updman;

	public Test(){
	}

	public Test(Integer id){
		this.id = id;
	}

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdtim() {
		return updtim;
	}

	public void setUpdtim(Date updtim) {
		this.updtim = updtim;
	}

	public String getUpdman() {
		return updman;
	}

	public void setUpdman(String updman) {
		this.updman = updman;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.append(getName())
			.append(getUpdtim())
			.append(getUpdman())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Test == false) return false;
		if(this == obj) return true;
		Test other = (Test)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

