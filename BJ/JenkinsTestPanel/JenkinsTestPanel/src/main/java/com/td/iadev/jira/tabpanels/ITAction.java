package com.td.iadev.jira.tabpanels;

import com.atlassian.jira.plugin.issuetabpanel.AbstractIssueAction;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanelModuleDescriptor;

import java.util.Date;
import java.util.Map;


public class ITAction extends AbstractIssueAction {

	String message = "";
	public ITAction(String msg, IssueTabPanelModuleDescriptor issueTabPanelModuleDescriptor){
        super(issueTabPanelModuleDescriptor);
        this.message = msg;
	}

    public Date getTimePerformed(){
        return null;
    }

    public void populateVelocityParams(Map params){
    	System.out.println("message" + " test control");
        params.put("ITVal","Issue Tab Panel"+message);
    }
}
