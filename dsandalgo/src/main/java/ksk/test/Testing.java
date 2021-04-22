package ksk.test;

import java.util.HashSet;

public class Testing {
    static int d = 1;

    void testFun() {
        d++;
        // d=1;
        d++;
        System.out.println(d);


    }


    public int singleNonDuplicate(int[] nums) {
        if(nums.length < 2) return nums[0];
        for (int i = 0; i < nums.length - 1;) {
            int num = nums[i+1] - nums[i];
            if (num != 0) {
                return nums[i];
            }
            i = i+2;
        }
        return (nums.length)%2 == 0 ? 0: nums[nums.length-1];
    }
    public static void main(String[] args) {

        Testing t = new Testing();
        t.testFun();

    }
}
