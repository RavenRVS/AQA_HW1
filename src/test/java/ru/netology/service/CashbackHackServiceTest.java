package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainLess1000() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(750);
        int expected = 250;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testRemainMore1000() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1650);
        int expected = 350;

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testRemainEqual1000() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);

    }
}