package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldCountCashback() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2000);
        int expected = 1000;
        assertEquals( actual, expected);

    }

}