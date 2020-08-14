public class returnFunction {
    public static double mealPriceCalculator(double tipRate,
                                           double taxRate,
                                           double stdMealPrice) {
        double tip = tipRate * stdMealPrice;
        double tax = taxRate * stdMealPrice;
        double totalMealPrice = stdMealPrice + tip + tax;

        return totalMealPrice;
    }

    public static void main(String[] args) {
        int friends = 5;
        double totalMealPrice = mealPriceCalculator(.1, .15,220);
        double perPersonPrice = totalMealPrice/friends;

        System.out.println(totalMealPrice);
        System.out.println(perPersonPrice);
    }
}