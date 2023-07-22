import java.util.*;

public class Sortbyfreq {
    public String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        pq.addAll(frequencyMap.keySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int frequency = frequencyMap.get(c);
            for (int i = 0; i < frequency; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}