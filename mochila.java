import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;

        Knapsack knapsack = new Knapsack();
        Result result = knapsack.knapsack01(values, weights, capacity);

        System.out.println("Valor máximo da mochila: " + result.maxValue);
        System.out.println("Itens selecionados: " + result.selectedItems);
    }

    public Result knapsack01(int[] values, int[] weights, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<Integer> selectedItems = new ArrayList<>();
        int w = capacity;
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                selectedItems.add(i - 1);
                w -= weights[i - 1];
            }
        }

        return new Result(dp[n][capacity], selectedItems);
    }

    public static class Result {
        public int maxValue;
        public List<Integer> selectedItems;

        public Result(int maxValue, List<Integer> selectedItems) {
            this.maxValue = maxValue;
            this.selectedItems = selectedItems;
        }
    }
}
