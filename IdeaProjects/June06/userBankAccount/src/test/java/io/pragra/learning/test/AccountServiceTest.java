package io.pragra.learning.test;

import io.pragra.learning.entities.Account;
import io.pragra.learning.entities.User;
import io.pragra.learning.logic.AccountService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountServiceTest {

    private static AccountService service;

   @BeforeClass
    public static void createService(){

       //10.00001
       //10.00000

        service = new AccountService();
        User user = new User("Mehak", "Canada", 525);

       Account account= service.createAccount(user, 5000, 10, 1000);

    }

    @Test
    public void createAccountTest(){
        Assert.assertEquals(1, service.getAccountMap().size());

    }

    @Test
    public void checkDetails(){
       Account account = service.getAccountByName("Mehak");

       Assert.assertEquals(1000, account.getMinBalance(), 0);
       Assert.assertEquals(10, account.getNoOfTrxAllowed());
    }

    @Test
    public void checkTransactions(){

    }
}
