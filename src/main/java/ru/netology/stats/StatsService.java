package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {

    public int sumAllSales(long[] sales) {
        long sum = 0; // первоначальная сумма всех продаж

        for (long sale : sales) {
            sum = sum + sale;
        }

        return (int) sum; //
    }


    public int getAverageSumSales(long[] sales) { //возвращаем сумму всех продаж
        long sum = sumAllSales(sales) / sales.length;       // вычисляем среднюю сумму продаж
        return (int) sum;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
            if (sales[i] == sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int countMonthsBelowAverage(long[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int count = 0; //количество месяцев
        int averageSales = getAverageSumSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }


    public int countMonthsAboveAverage(long[] sales) { //количество месяцев, в которых продажи были выше среднего
        int count = 0; //количество месяцев
        int averageSales = getAverageSumSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }

}
