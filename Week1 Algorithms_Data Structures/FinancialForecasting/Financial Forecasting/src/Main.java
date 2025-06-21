public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;

        // Recursive
        double result1 = FinancialForecast.futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value (Recursive): %.2f%n", result1);

        // Memoized
        Double[] memo = new Double[years + 1];
        double result2 = FinancialForecast.futureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future Value (Memoized): %.2f%n", result2);

        // Iterative
        double result3 = FinancialForecast.futureValueIterative(presentValue, growthRate, years);
        System.out.printf("Future Value (Iterative): %.2f%n", result3);
    }
}

