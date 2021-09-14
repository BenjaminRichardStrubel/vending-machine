package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;

public class SubMenu extends Menu{
    public SubMenu(InputStream input, OutputStream output) {
        super(input, output);
    }


    public Object getChoiceFromOptions(Object[] options, double balance) {
        Object choice = null;
        // display menu options until a choice is made
        while (choice == null) {
            displayMenuOptions(options, balance);
            choice = getChoiceFromUserInput(options);
        }
        return choice;
    }

    public void displayMenuOptions(Object[] options, double balance) {
        out.println();
        for (int i = 0; i < options.length; i++) {
            int optionNum = i + 1;
            out.println(optionNum + ") " + options[i]);
        }
        out.printf("\nCurrent Money Provided: %.2f\n", balance);

        out.print(System.lineSeparator() + "Please choose an option >>> ");
        out.flush();
    }
}
