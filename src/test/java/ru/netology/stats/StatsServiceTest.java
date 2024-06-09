package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void theSumOfAllSales() { // сумма всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 180;
        long actualMonth = service.sumAllSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void averageSalesPerMonth() { // средняя сумма продаж в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 15;
        long actualMonth = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void monthWithMaxSales() { // месяц с максимальными продажами
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthWithMinimalSales() { // месяц с минимальными продажами
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void numberMonthsSalesBelowAverage() { // количество месяцев с продажами ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.countMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void numberMonthsSalesAboveAverage() { // количество месяцев с продажами выше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 5;
        long actualMonth = service.countMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
