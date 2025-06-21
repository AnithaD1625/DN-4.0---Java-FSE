import java.util.*;

public class RevenueData {
    private final List<Double> revenueList;

    public RevenueData(List<Double> revenues) {
        this.revenueList = new ArrayList<>(revenues);
    }

    public List<Double> getRevenueList() {
        return new ArrayList<>(revenueList); // Return a copy
    }

    public void addRevenue(Double value) {
        revenueList.add(value);
    }
}
