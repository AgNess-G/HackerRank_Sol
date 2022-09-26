class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
        System.out.println(Math.round(meal_cost + (tip_percent*meal_cost)/100 + (tax_percent*meal_cost)/100));

    }
}
