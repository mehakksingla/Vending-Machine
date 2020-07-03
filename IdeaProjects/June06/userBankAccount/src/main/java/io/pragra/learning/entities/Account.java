package io.pragra.learning.entities;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private User user;
    private double balance;
    private double fee;
    private int noOfTrxAllowed;
    private List<Transaction> transactions;
    private double minBalance;

    public Account(User user, double balance, int noOfTrxAllowed, double minBalance) {
        this.user = user;
        this.balance = balance;
        this.noOfTrxAllowed = noOfTrxAllowed;
        this.minBalance = minBalance;
        transactions = new ArrayList<>();   ////why do we create an array here? Answer is ---
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public double getFee() {
        return fee;
    }

    public int getNoOfTrxAllowed() {
        return noOfTrxAllowed;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
