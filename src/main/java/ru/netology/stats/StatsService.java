package ru.netology.stats;

public class StatsService {
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }


        return totalSales;
    }

    public long calculateAverageSales(long[] sales) {
        long totalSales = calculateTotalSales(sales);
        return totalSales / 12;
    }

    public int calculateMonthMaxSales(long[] sales) {
        int monthMax = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }

        return monthMax + 1;

    }

    public int calculateMonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }

        return monthMin + 1;
    }

    public int calculateSalesBelowAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int caunter = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                caunter++;


            }
        }
        return caunter;
    }

    public int calculateSalesAboveAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int caunter = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                caunter++;

            }
        }
        return caunter;
    }
}







