package com.designPatterns.templateMethodPattern2;

/**
 * Template Design Pattern
 * -----------------------
 * @author Vaibhav
 */
public class MainMethod {
    public static void main(String[] args) {
        //Transfer Money...
        //Generate Report...

        var task1 = new TransferMoneyTask();
       // task.doExecute();
        task1.execute();

        var task2 = new GenerateReportTask();
        task2.execute();


    }
}
