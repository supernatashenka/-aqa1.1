package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

        @Test
        public void ShouldRemain1000IfAmountIs0() {

            CashbackHackService service = new CashbackHackService();

            int actual = service.remain(0);
            int expected = 1000;
            assertEquals(expected, actual);

        }
    @Test
    public void ShouldRemain1IfAmountIs999() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldRemain0IfAmountIs1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test
    public void ShouldRemain999IfAmountIs1001() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);

    }
    }


