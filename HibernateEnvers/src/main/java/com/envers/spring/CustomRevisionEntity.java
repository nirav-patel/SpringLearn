package com.envers.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;
@Entity
@Table(name="REVINFO")
@RevisionEntity(CustomAuditRevisionListener.class)
public class CustomRevisionEntity extends DefaultRevisionEntity 
{
	private static final long serialVersionUID = 1L;
	@Column(name = "HIST_USER_ID")
	private String histUserId;

	public String getHistUserId() {
		return histUserId;
	}

	public void setHistUserId(String histUserId) {
		this.histUserId = histUserId;
	}

}
