package basiclibrary;

import java.util.*;

public class Library {
    public static void main(String[] args){

        // Contains Duplicates
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

        // Weather Data
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    System.out.println(weatherData(weeklyMonthTemperatures));


            // Tallying Election
            List<String> votes = new ArrayList<>();
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Shrub");
            votes.add("Hedge");
            votes.add("Shrub");
            votes.add("Bush");
            votes.add("Hedge");
            votes.add("Bush");
            System.out.println(tally(votes));
    
    }

    // Roll
    public static ArrayList<Integer> roll(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < num; i++){
            Random dice = new Random();
            int randomNumber = dice.nextInt(6) + 1;
            nums.add(randomNumber);
        }
        return nums;
    }

    // Contain Duplicates
    public static boolean containDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> reference = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            if(reference.contains(arr.get(i))){
                return true;
            } else {
                reference.add(arr.get(i));
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
    public static String averageArray(int[][] arr){
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
        return Arrays.toString(lowestArr);
    }

     // Weather Data
     public static String weatherData(int[][] arr) {
        int lowestTemp = Integer.MAX_VALUE;
        int highestTemp = Integer.MIN_VALUE;
        HashSet<Integer> recordedTemps = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < lowestTemp) {
                    lowestTemp = arr[i][j];
                }
                if (arr[i][j] > highestTemp) {
                    highestTemp = arr[i][j];
                }
                if (recordedTemps.contains(arr[i][j]) == false) {
                    recordedTemps.add(arr[i][j]);
                }
            }
        }
        String weatherString = "";
        weatherString += "High: " + highestTemp + "\n";
        weatherString += "Low: " + lowestTemp + "\n";
        for (int i = lowestTemp; i < highestTemp; i++) {
            if (!recordedTemps.contains(i)) {
                weatherString += "Never saw temperature: " + i + "\n";
            }
        }
        return weatherString;
    }

     // Tallying Election|
     public static String tally(List<String> arr) {
        HashMap<String, Integer> pollVotes = new HashMap<>();
        int numOfVotes = Integer.MIN_VALUE;
        String winner = "someone";
        for (String name : arr) {
            if (pollVotes.containsKey(name) == false) {
                pollVotes.put(name, 0);
            } else {
                pollVotes.put(name, pollVotes.get(name) + 1);
            }
            for (String runner : arr) {
                if (pollVotes.get(name) > numOfVotes) {
                    numOfVotes = pollVotes.get(name);
                    winner = name;
                }
            }
        }
        String announceWinner = winner + " received the most votes!";
        return announceWinner;
    }
}
