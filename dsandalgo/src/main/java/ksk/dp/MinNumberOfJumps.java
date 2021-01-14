package ksk.dp;

public class MinNumberOfJumps {


    static int minJumps(int[] jumpsArray) {

        if (jumpsArray.length == 0) {
            return 0;
        }
        int jumps = 0;
        int maxReach = jumpsArray[0];
        int steps = jumpsArray[0];
        for (int i = 1; i < jumpsArray.length - 1; i++) {
            int temp = maxReach;
            maxReach = Math.max(maxReach, jumpsArray[i] + i);
            System.out.println("when i = "+i+ " -- Max of["+temp +","+ (jumpsArray[i] + i)+"]"+"-->MaxReach "+maxReach);

            steps -= 1;
            System.out.println("Steps "+steps);
            if (steps == 0) {
                jumps += 1;
                steps = maxReach - i;
                System.out.println("Steps incerment "+ steps);
            }
        }
        return jumps + 1;
    }


    public static void main(String[] args) {

        int[] jumpsArray = {3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3};
        int[] juInts = {2,3,1,1,2,1,4,2,0,1,1};
        //System.out.println(MinNumberOfJumps.minJumps(jumpsArray));
        System.out.println(MinNumberOfJumps.minJumps(juInts));
    }

}