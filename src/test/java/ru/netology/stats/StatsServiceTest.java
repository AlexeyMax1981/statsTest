package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void ShouldGetGeneralSumma() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        Assertions.assertEquals(180, service.generalSumma(sales));

    }

    @Test
    public void ShouldGetAverageSumma() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.averageSumma(sales);
        long expected = 15;
//        System.out.println(actual);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldGetMaxSumma() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 20};
        long actual = service.maxSumma(sales);
        long expected = 12;
//        System.out.println(actual);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void ShouldGetMinSumma() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 20};
        long actual = service.minSumma(sales);
        long expected = 9;
//        System.out.println(actual);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void ShouldGetAboveAverageSumma() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 114, 18};
        long actual = service.aboveAverageSumma(sales);
        long expected = 1;
//        System.out.println(actual);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldGetBelowAverageSumma() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 114, 18};
        long actual = service.belowAverageSumma(sales);
        long expected = 11;
//        System.out.println(actual);
        Assertions.assertEquals(expected, actual);


    }

}