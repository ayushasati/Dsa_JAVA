import java.util.*;
public class Combination {
    public List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), combinations);
        return combinations;
    }

    private void backtrack(int start, int k, int n, List<Integer> currentCombination, List<List<Integer>> combinations) {
        if (currentCombination.size() == k) {
            combinations.add(new ArrayList<>(currentCombination)); // Make a copy of the combination to store
            return;
        }

        // Optimize the loop range to reduce unnecessary iterations
        for (int i = start; i <= n - (k - currentCombination.size()) + 1; i++) {
            currentCombination.add(i);
            backtrack(i + 1, k, n, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1); // Backtrack by removing the last element
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Combination generator = new Combination();
        List<List<Integer>> result = generator.generateCombinations(n, k);

        // Print the result
        System.out.println("All possible combinations of " + k + " numbers chosen from the range [1, " + n + "] are:");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        scanner.close();
    }
}
