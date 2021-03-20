package com.designPatterns.templateMehodPattern1;

public class GenerateReportTask {

    private AuditTrial auditTrial;

    public GenerateReportTask(AuditTrial auditTrial) {
        this.auditTrial = auditTrial;
    }

    public void execute(){
        auditTrial.record();
        System.out.println("Generate Report....");
    }
}
