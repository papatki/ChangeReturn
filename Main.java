package com.changereturn;

import com.changereturn.changeReturn.Change;
import com.changereturn.ui.ConsoleUIImplem;


public class Main {
    public static void main(String[] args) {
        ConsoleUIImplem consoleUI = new ConsoleUIImplem();
        Change change = new Change();

        consoleUI.printMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        consoleUI.printMessage("Enter a cost of purchase: ");
        double cost = consoleUI.getInput();
        consoleUI.printMessage("\nEnter the amount of money you have given: ");
        double givenMoney = consoleUI.getInput();
        double yourChange = change.countChange(cost, givenMoney);

        if (cost > givenMoney) {
            while (cost > givenMoney) {
                consoleUI.printMessage("\nYou have not given enough money. Try again.");
                consoleUI.printMessage("Enter a cost of purchase: ");
                cost = consoleUI.getInput();
                consoleUI.printMessage("\nEnter the amount of money you have given: ");
                givenMoney = consoleUI.getInput();
            }
            yourChange = change.countChange(cost, givenMoney);
            consoleUI.printMessage("\nYour change is equal to " + yourChange / 100 + "$.");
            change.getChange(yourChange);
            consoleUI.printMessage("\nThank you.");
            consoleUI.printMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            consoleUI.exit();
        } else if (cost == givenMoney) {
            consoleUI.printMessage("\nThank you.");
            consoleUI.printMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            consoleUI.exit();
        } else {
            consoleUI.printMessage("\nYour change is equal to " + yourChange / 100 + "$.");
            change.getChange(yourChange);
            consoleUI.printMessage("\nThank you.");
            consoleUI.printMessage("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            consoleUI.exit();
        }
    }
}
