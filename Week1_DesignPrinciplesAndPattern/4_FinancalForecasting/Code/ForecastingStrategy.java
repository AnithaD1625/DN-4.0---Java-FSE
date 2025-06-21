import java.util.List;

public interface ForecastingStrategy {
    List<Double> forecast(List<Double> historicalData, int k, int n);
}
