package ksk.dp;

public class MaxSubsetSumNoAdjacent {

//Ignore the below logic, which is given in the AlgoExpert
//    static int maxSum(int array[]) {
//        if (array.length < 0) return 0;
//        else if (array.length == 1) return array[0];
//        array[1] = Math.max(array[0], array[1]);
//        for (int i = 2; i < array.length; i++) {
//            array[i] = Math.max(array[i - 1], array[i - 2] + array[i]);
//        }
//        return array[array.length - 1];
//
//    }

    static int maxSubsetSum(int[] array) {
        if (array.length < 0) return 0;
        else if (array.length == 1) return array[0];
        int exclusive = 0;
        int inclusive = array[0];
        for (int i = 1; i < array.length; i++) {
            int temp = inclusive;
            inclusive = Math.max(inclusive, exclusive + array[i]);
            exclusive = temp;
        }
        return inclusive;
    }


    public static void main(String[] args) {

       // int a[] = {7, 10, 12, 7, 9, 14}; //Answer is 33
        int a[] = {4,1,2,6,10,1,12}; //Answer is 32
        //int a[] = {4, 1, 1, 4, 2, 1}; //Answer is 9
        //System.out.println(MaxSubsetSumNoAdjacent.maxSum(a));
        System.out.println(MaxSubsetSumNoAdjacent.maxSubsetSum(a));

    }


}
