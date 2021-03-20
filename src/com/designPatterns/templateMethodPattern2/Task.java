package com.designPatterns.templateMethodPattern2;

public abstract class Task {

    private AuditTrial auditTrial;

    public Task() {
        this.auditTrial = new AuditTrial();
    }

    public Task(AuditTrial auditTrial) {
        this.auditTrial = auditTrial;
    }

    public void execute() {
        auditTrial.record();
        doExecute();
    }

    protected abstract void doExecute();
}
