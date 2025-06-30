import java.util.*;

public class MovingAverageForecast implements ForecastingStrategy {

    @Override
    public List<Double> forecast(List<Double> historicalData, int k, int n) {
        List<Double> forecast = new ArrayList<>();
        List<Double> dataCopy = new ArrayList<>(historicalData);

        for (int i = 0; i < n; i++) {
            if (dataCopy.size() < k) break;

            double sum = 0;
            for (int j = dataCopy.size() - k; j < dataCopy.size(); j++) {
                sum += dataCopy.get(j);
            }

            double avg = Math.round((sum / k) * 100.0) / 100.0;
            forecast.add(avg);
            dataCopy.add(avg);
        }

        return forecast;
    }
}
