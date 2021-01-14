package ksk.dp;

public class NumberOfWaysToMakeChange {


    public static int countChange(int[] denominations, int total) {

        if (denominations.length == 0) return 0;
        else if (denominations.length == 1) return denominations[0];
        int[] ways = new int[total + 1];
        ways[0] = 1;
        for (int i = 0; i < denominations.length; i++) {
            for (int amount = 0; amount < ways.length; amount++) {
                {
                    if (denominations[i] <= amount) {
                        ways[amount] += ways[amount - denominations[i]];
                    }
                }
            }
        }
        return ways[ways.length - 1];
    }


    public static void main(String[] args) {

        int[] denominations = {1, 5, 10, 25};  //4  - money is 10
        //int[] denominations = {1, 2, 3}; //5 - money is 5

        System.out.println(NumberOfWaysToMakeChange.countChange(denominations, 10)); //Ans is 4

    }
}