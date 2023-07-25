import java.util.*;
public class Findintersection {

    public static void intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    // Populate the frequency hashmap with elements from the first array
        for (int num : nums1) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    int index = 0;
    // Find the intersection of the two arrays and update nums1
        for (int num : nums2) {
        if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
            nums1[index++] = num;
            frequencyMap.put(num, frequencyMap.get(num) - 1);
        }
    }

    // Trim nums1 to remove the elements that are not part of the intersection
        Arrays.fill(nums1, index, nums1.length, 0);
}
}
