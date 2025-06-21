import java.util.List;

public class ForecastService {
    private final ForecastingStrategy strategy;

    public ForecastService(ForecastingStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Double> generateForecast(RevenueData revenueData, int k, int n) {
        return strategy.forecast(revenueData.getRevenueList(), k, n);
    }
}
