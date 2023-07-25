import java.util.*;
public class Findunique {
    public static int findUnique(int[] arr){
        //Your code goes here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and populate the frequency hashmap
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the unique element with frequency 1
        for (int num : arr) {
            if (frequencyMap.get(num) >1) {
                return num;
            }
        }

        // If no unique element is found, return a default value (you may handle this differently based on your requirement)
        return -1;
    }
}
