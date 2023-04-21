package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void Junit() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(expected, actual);
    }

    @Test
    public void testJunitRemainLarge() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(4100);
        assertEquals(expected, actual);
    }

    @Test
    public void testJunitNull() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(expected, actual);
    }

}