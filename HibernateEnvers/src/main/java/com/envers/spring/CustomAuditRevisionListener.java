package com.envers.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.context.SecurityContextHolder;

public class CustomAuditRevisionListener implements RevisionListener {
	  private static Log log = LogFactory.getLog(CustomAuditRevisionListener.class.getName());

	  @Override
	  public void newRevision(Object revisionEntity) {
	    CustomRevisionEntity revEntity = (CustomRevisionEntity) revisionEntity;
	    String userName = null;//SecurityContextHolder.getContext().getAuthentication().getName();
	    if(userName == null)
	    {
	    	userName = "Unknown";
	    }
	    revEntity.setHistUserId(userName);
	  }

	}