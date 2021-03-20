package com.designPatterns.commandPattern1;

import com.designPatterns.commandPattern1.fx.Button;

/**
 * Command Design Pattern
 * @author Vaibhav
 */
public class MainMethod {

    public static void main(String[] args) {
        //Button
        //CheckBox
        //TextBox

        //Single Command Executed
      /*  var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();*/

        // Multiple Command Executed
        var compositCommand = new CompositeCommand();
        compositCommand.addCommand(new ReSizeCommand());
        compositCommand.addCommand(new BlackAndWhiteCommand());
        compositCommand.execute();

    }
}
