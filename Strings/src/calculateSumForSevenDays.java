public class calculateSumForSevenDays {
    private static int calculateSumForSevenDays(int startingValue, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += startingValue + i;
        }
        return sum;
    }

    // Driver function to calculate the total amount of money after n days
    public static int totalMoney(int n) {
        int totalAmount = 0;
        int fullWeeks = n / 7;  // Calculate the number of full weeks
        int remainingDays = n % 7;  // Calculate the remaining days

        // Calculate the total amount for full weeks
        for (int i = 0; i < fullWeeks; i++) {
            totalAmount += calculateSumForSevenDays(1 + i, 7);
        }

        // Calculate the total amount for remaining days
        totalAmount += calculateSumForSevenDays(1 + fullWeeks, remainingDays);

        return totalAmount;
    }
}
