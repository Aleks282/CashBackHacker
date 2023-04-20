package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldAmountEqual1000() {
        int amount = 1000;

        int expected = 500;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountAbove1000() {
        int amount = 1500;

        int expected = 900;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountBelow1000() {
        int amount = 900;

        int expected = 300;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }
}