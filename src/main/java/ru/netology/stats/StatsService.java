package ru.netology.stats;

public class StatsService {
    public long generalSumma(long[] sales) {
        long summa = 0;
        for (long s : sales) {
            summa = summa + s;
        }
        return summa;
    }

//    public long averageSumma(long[] sales) {
//        long summa = 0;
//        for (long s : sales) {
//            summa = summa + s;
//        }
//        return summa / sales.length;
//    }


    public long averageSumma(long[] sales) {
        long summa = generalSumma(sales);
        return summa / sales.length;
    }


    public long maxSumma(long[] sales) {
        int maxSummaMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSummaMonth]) {
                maxSummaMonth = i + 1;
            }
        }
        return maxSummaMonth;
    }

    public long minSumma(long[] sales) {
        int minSummaMonth = 0;
        int month = 0;
        for (long s : sales) {
            if (s <= sales[minSummaMonth]) {
                minSummaMonth = month;
            }
            month++;
        }
        return minSummaMonth + 1;
    }

//    public long aboveAverageSumma(long[] sales) {
//        long summa = 0;
//        for (long s : sales) {
//            summa = summa + s;
//        }
//        int numberOfMonth = 0;
//        long averageSumma = summa / sales.length;
//        for (long s : sales) {
//            if (s > averageSumma) {
//                numberOfMonth++;
//            }
//        }
//        return numberOfMonth;
//
//    }

//    public long belowAverageSumma(long[] sales) {
//        long summa = 0;
//        for (long s : sales) {
//            summa = summa + s;
//        }
//        int numberOfMonth = 0;
//        long averageSumma = summa / sales.length;
//        for (long s : sales) {
//            if (s < averageSumma) {
//                numberOfMonth++;
//            }
//        }
//        return numberOfMonth;
//
//    }

    public long belowAverageSumma(long[] sales) {
        long averageSummaSale = averageSumma(sales);
        int numberOfMonth = 0;
        for (long s : sales) {
            if (s < averageSummaSale) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;

    }

    public long aboveAverageSumma(long[] sales) {
        long averageSummaSale = averageSumma(sales);
        int numberOfMonth = 0;
        for (long s : sales) {
            if (s > averageSummaSale) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;

    }

}





