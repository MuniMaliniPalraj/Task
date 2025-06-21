public class FinancialForecast {

    // Recursive method to compute future value
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized version using memoization
    public static double futureValueMemo(double presentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = futureValueMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    // Iterative version
    public static double futureValueIterative(double presentValue, double growthRate, int years) {
        double result = presentValue;
        for (int i = 1; i <= years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}

