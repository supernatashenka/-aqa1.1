package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

        @Test
        public void ShouldCountCashback() {

            CashbackHackService service = new CashbackHackService();

            int actual = service.remain(2000);
            int expected = 1000;
            assertEquals(expected, actual);

        }
    }


