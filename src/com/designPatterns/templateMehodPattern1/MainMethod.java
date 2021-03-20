package com.designPatterns.templateMehodPattern1;

/**
 * Template Design Pattern
 * -----------------------
 * Problem in this way of implementation is , we found code duplication in GenerateReportask
 * TransferMoneyTask class implementation ( Here there is need to initialization of audit trial object i.e code
 * duplication in both class ) So to over come this problem we go through template pattern implementation.
 * (You can refer in templateMethodPattern2 package)
 *
 * @author Vaibhav
 */
public class MainMethod {
    public static void main(String[] args) {
        //Transfer Money...
         var transferMoney = new TransferMoneyTask(new AuditTrial());
         transferMoney.execute();
        //Generate Report...
        var generateReport = new GenerateReportTask(new AuditTrial());
        generateReport.execute();

        // The problem here is that every time we need to pass Audit trial object
        // in both class constructor
    }
}
