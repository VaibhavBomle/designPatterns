package com.designPatterns.templateMethodPattern2;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generate Report....");
    }
}
