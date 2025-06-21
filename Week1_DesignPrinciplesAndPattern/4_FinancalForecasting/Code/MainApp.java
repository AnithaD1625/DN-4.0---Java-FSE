import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> revenues = Arrays.asList(1000.0, 1200.0, 1100.0, 1300.0, 1250.0);
        RevenueData revenueData = new RevenueData(revenues);

        ForecastingStrategy strategy = new MovingAverageForecast();
        ForecastService service = new ForecastService(strategy);
        System.out.print("Number of months used in moving average: ");
        int k = sc.nextInt();
        System.out.print("Number of months to forecast: ");
        int n = sc.nextInt();

        List<Double> result = service.generateForecast(revenueData, k, n);
        System.out.println("Forecasted Revenues: " + result);
    }
}
