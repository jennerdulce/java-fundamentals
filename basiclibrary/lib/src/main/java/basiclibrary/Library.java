package basiclibrary;

import java.util.ArrayList;
import java.util.Random;

public class Library {
    public static void main(String[] args){
        // Test 1
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        System.out.println(containDuplicates((listOne)));

        // Test 2
        ArrayList<Integer> listTwo = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(1);
        System.out.println(containDuplicates((listTwo)));

        // Calculate Average
        int[] average = {1, 2, 3};
        System.out.println(calculateAverage(average));

        // Array of arrays
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 1, 1}
        };
        System.out.println(averageArray(numbers));
    }

    // Roll
    public static ArrayList<Integer> roll(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < num; i++){
            Random dice = new Random();
            // Rolls 0 - 5 and + 1 to make values 1 - 6
            int randomNumber = dice.nextInt(6) + 1;
            nums.add(randomNumber);
        }
        return nums;
    }

    // Contain Duplicates
    public static boolean containDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> reference = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            if(reference.contains(arr.get(0))){
                return true;
            } else {
                reference.add(arr.get(0));
            }
        }
        return false;
    }

    // Calculating Averages
    public static int calculateAverage(int[] arr){
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        return avg / arr.length;
    }

    // Array of Arrays
    // How to properly return and display an array
        // Should I have used an array list within the array?
    public static int[] averageArray(int[][] arr){
        double lowestAvg = Double.POSITIVE_INFINITY;
        int[] lowestArr = new int[5];
        for(int i = 0; i < arr.length; i++){
            int[] currentArr = arr[i];
            int sum = calculateAverage(currentArr);
            if(sum < lowestAvg){
                lowestArr = arr[i];
                lowestAvg = sum;
            }
        }
        return lowestArr;
    }
}
