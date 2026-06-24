package DSA;

public class InvestmentCalculator {

    // Recursive method to calculate future value
    public static double forecastValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return currentValue;
        }

        // Recursive case
        return forecastValue(currentValue * (1 + growthRate),
                             growthRate,
                             years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000.0; // Initial investment
        double growthRate = 0.08;      // 8% annual growth
        int years = 5;

        double futureValue = forecastValue(
                presentValue,
                growthRate,
                years);

        System.out.printf("Future Value after %d years = %.2f",
                          years,
                          futureValue);
    }
} 
