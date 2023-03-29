import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long x = service.generalSumma(sales);
        System.out.println(x);
    }

    public static void mainAverage(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long x = service.averageSumma(sales);
        System.out.println(x);
    }



}
