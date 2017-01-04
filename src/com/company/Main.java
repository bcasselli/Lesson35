package com.company;

public class Main {

    public static void main(String[] args) {

        SavingsAccount myAccount = new SavingsAccount(200, 5);

        myAccount.deposit(132.14);

        myAccount.addInterest();

        System.out.println("Final balance is: " + myAccount.getBalance());
    }
}
