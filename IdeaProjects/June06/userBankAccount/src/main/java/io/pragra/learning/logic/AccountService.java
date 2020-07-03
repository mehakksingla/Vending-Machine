package io.pragra.learning.logic;

import io.pragra.learning.entities.Account;
import io.pragra.learning.entities.User;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    private Map<String, Account> accountMap = new HashMap<>();

    public Account createAccount(User user, double balance, int noOfTrxAllowed, double minBalance){
Account account = new Account(user, balance, noOfTrxAllowed, minBalance);
accountMap.put(user.getName(), account);
return account;
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public Account getAccountByName(String name){
        return accountMap.get(name);
    }

    public Account withdrawAmount(String name, double amount) {



        Account ac = accountMap.get(name);

        if(amount < ac.getBalance()) {
            throw new RuntimeException("If sufficient Balance");
        }
        Transaction tx = new Transaction();
        tx.setTrxType(Type.DEBIT);
        tx.setId((int)Math.round(Math.random()*1000000));
        tx.setTransactionDate(LocalDateTime.now());

        if(ac.getTransactions().size()<ac.getAllowedTrx()) {
            tx.setCharge(0);
        }else {
            tx.setCharge(1);
        }

        ac.setBalance(ac.getBalance()-amount);
        ac.getTransactions().add(tx);
        return ac;
    }
}
