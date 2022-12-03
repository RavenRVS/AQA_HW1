package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainLess1000() {
    CashbackHackService cash = new CashbackHackService();

    int actual = cash.remain(750);
    int expected = 250;

    org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainMore1000() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1650);
        int expected = 350;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemainEqual1000() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);

    }
    
}