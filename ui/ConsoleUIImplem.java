package com.changereturn.ui;

import com.changereturn.api.ConsoleUI;

import java.util.Scanner;


public class ConsoleUIImplem implements ConsoleUI {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public double getInput() {
        Scanner keyboard = new Scanner(System.in);
        double input = keyboard.nextDouble();
        return input;
    }

    @Override
    public void exit() {

    }
}
