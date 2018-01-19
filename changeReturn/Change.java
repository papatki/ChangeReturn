package com.changereturn.changeReturn;

import com.changereturn.api.ChangeGenerator;
import java.text.DecimalFormat;


public class Change implements ChangeGenerator {

    private final int HUNDRED = 10000;
    private final int FIFTY = 5000;
    private final int TWENTY = 2000;
    private final int TEN = 1000;
    private final int FIVE = 500;
    private final int TWO = 200;
    private final int ONE = 100;
    private final int QUARTER = 25;
    private final int DIME = 10;
    private final int NICKEL = 5;

    private DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    public double countChange(double cost, double givenMoney) {
        double change = 100 * (givenMoney - cost); //zamienione na pennies(grosze)
        return Double.valueOf(decimalFormat.format(change));
    }

    @Override
    public void getChange(double change) {

        int hundred = (int) change / HUNDRED;
        if (hundred > 0) {
            change %= HUNDRED;
            System.out.println("Amount of 100's " + hundred + ".");
        }

        int fifty = (int) (change / FIFTY);
        if (fifty > 0) {
            change %= FIFTY;
            System.out.println("Number of 50's " + fifty + ".");
        }

        int twenty = (int) (change / TWENTY);
        if (twenty > 0) {
            change %= TWENTY;
            System.out.println("Number of 20's " + twenty + ".");
        }

        int ten = (int) (change / TEN);
        if (ten > 0) {
            change %= TEN;
            System.out.println("Number of 10's " + ten + ".");
        }

        int five = (int) (change / FIVE);
        if (five > 0) {
            change %= FIVE;
            System.out.println("Number of 5's " + five + ".");
        }
        int two = (int) (change / TWO);
        if (two > 0) {
            change %= TWO;
            System.out.println("Number of 2's " + two + ".");
        }

        int one = (int) (change / ONE);
        if (one > 0) {
            change %= ONE;
            System.out.println("Number of 1's " + one + ".");
        }

        int quarter = (int) (change / QUARTER);
        if (quarter > 0) {
            change %= QUARTER;
            System.out.println("Number of quarters " + quarter + ".");
        }

        int dime = (int) (change / DIME);
        if (dime > 0) {
            change %= DIME;
            System.out.println("Number of dimes " + dime + ".");
        }

        int nickel = (int) (change / NICKEL);
        if (nickel > 0) {
            change %= NICKEL;
            System.out.println("Number of nickles " + nickel + ".");
        }

        int pennie = (int) change;
        System.out.println("Number of pennies " + pennie + ".");
    }
}
