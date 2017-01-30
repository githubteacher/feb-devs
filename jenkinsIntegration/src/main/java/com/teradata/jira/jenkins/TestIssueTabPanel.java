package com.teradata.jira.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.plugin.issuetabpanel.AbstractIssueTabPanel;
import com.atlassian.jira.plugin.issuetabpanel.IssueTabPanel;
//import com.atlassian.jira.issue.tabpanels.GenericMessageAction;
import com.atlassian.jira.issue.Issue;
//import com.opensymphony.user.User;
import java.util.Collections;
import java.util.List;
import com.atlassian.crowd.embedded.api.User;
public class TestIssueTabPanel extends AbstractIssueTabPanel implements IssueTabPanel
{
    private static final Logger log = LoggerFactory.getLogger(TestIssueTabPanel.class);
    
   
    public List getActions(Issue issue, User remoteUser) {
    	//return Collections.singletonList(new GenericMessageAction("This is a message brought to you by the Test Issue Tab Panel"));
        return Collections.singletonList(new ITAction("This is a message brought to you by the Test Issue Tab Panel", super.descriptor));
    }

    public boolean showPanel(Issue issue, User remoteUser)
    {
        return true;
    }
}
