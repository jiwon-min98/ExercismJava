public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        if (daysSkipped <= 5) return 1;
        else return 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        if (productsSold <= 20) return 10;
        else return 13;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        return Math.min(1000 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold), 2000);
    } 
}
