package org.example;

import junit.framework.TestCase;
import org.example.BankAccount;

public class BankAccountTest extends TestCase {
    BankAccount[]accounts = new BankAccount[3];


    public void setUp() throws Exception {
        super.setUp();
        accounts[0] = new BankAccount(500, "Kalle", "Anka", 12345);
        accounts[1] = new BankAccount(700, "Nalle", "Anka", 12345);
        accounts[2] = new BankAccount(900, "Halle", "Anka", 12345);

    }

    public void tearDown() throws Exception {
        BankAccount.counter=0;
    }



    public void testDeposit() {
        int account = accounts[2].getAccountNumber();System.out.println(account);
       int total = accounts[0].deposit(50);
       int expected = 550;
       assertEquals(expected,total);
    }

    public void testWithdraw() {
        int account = accounts[2].getAccountNumber();
        System.out.println(account);
        int total = accounts[2].withdraw(50);
        int expected = 850;
        total = accounts[2].withdraw(900);
        assertEquals(expected,total);

    }

    public void testGetAccountNumber() {
        int account = accounts[2].getAccountNumber();
        int expected = 3;
        System.out.println(account);
        assertEquals(expected, account);
    }
}