package ksk.Array;

import java.util.*;


// Given an array, check what will the largest range. here the largest range will be - 20 to 30

public class LargestRange {

//    static List<Integer> largestRangeInArray(int[] array) {
//        Map<Integer, Boolean> arrayMap = new HashMap<>();
//        List<Integer> arrayRange = new ArrayList<>();
//        for (int value : array) {
//            arrayMap.put(value, true);
//        }
//        List<Integer> range = new ArrayList<>();
//        for (int value : array) {
//
//            checkLeft(int val){
//
//                if(arrayMap.containsKey(val-1) && arrayMap.get(val-1)){
//                    arrayMap.put(val-1,false);
//                }
//
//
//
//            }
//
//            checkRight(){
//
//            }
//
//
//            for (int j = value; j + 1 > j; j++) {
//                if (arrayMap.containsKey(j) && arrayMap.get(j)) {
//                    range.add(j);
//                    arrayMap.put(j, false);
//                } else {
//                    arrayRange = arrayRange.size() > range.size() ? arrayRange : range;
//                    range = new ArrayList<>();
//                    j = 0;
//                }
//            }
//        }
//        return arrayRange;
//    }


    //Sorted range
    static void largestRange(int[] array) {
        //Arrays.sort(array);
        Map<Integer, Boolean> arrayMap = new HashMap<Integer, Boolean>();
        for (int value : array) {
            arrayMap.put(value, true);
        }
        int tempCounter = 1;
        int counter = 0;
        List<Integer> tempRangeArrayList = new ArrayList<>();
        List<Integer> rangeArrayList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            tempRangeArrayList.add(array[i]);
            if (arrayMap.containsKey(array[i]) && arrayMap.containsKey(array[i] + 1)) {
                tempCounter++;
            } else {
                if (tempCounter > counter) {
                    counter = tempCounter;
                }
                if (tempRangeArrayList.size() > rangeArrayList.size()) {
                    rangeArrayList.clear();
                    rangeArrayList.addAll(tempRangeArrayList);
                }
                tempRangeArrayList.clear();
                tempCounter = 1;
            }

        }
        System.out.println(Arrays.toString(rangeArrayList.toArray()));
    }


    public static void main(String[] args) {

        // int[] array = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int[] array = {1, 22, 33, 2, 6, 5, 6, 7, 3, 4};
        //int[] array = {1,2,3,4,5,6,15, 16, 17, 19, 20, 21, 51, 52, 53, 54,70,71,72,73,74,75,76,77,78,79};
        //System.out.println(LargestRange.largestRangeInArray(array));
        LargestRange.largestRange(array);

    }

}