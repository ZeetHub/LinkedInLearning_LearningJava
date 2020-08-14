public class functionParameters {
    public static void mealPriceCalculator(double tipRate,
                                           double taxRate,
                                           double stdMealPrice){
        double tip = tipRate * stdMealPrice;
        double tax = taxRate * stdMealPrice;
        double totalMealPrice = stdMealPrice + tip + tax;

        System.out.println("Your bill for the meal is " + totalMealPrice);
    }
    public static void main(String[] args){
        mealPriceCalculator(0.15, 0.1, 75);
        mealPriceCalculator(0.1, 0.35, 345);
    }
}
