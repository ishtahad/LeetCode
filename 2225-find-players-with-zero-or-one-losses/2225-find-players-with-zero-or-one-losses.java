import java.util.*;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> winnersSet = new HashSet<>();
        Map<Integer, Integer> lossersCountMap = new HashMap<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        for (int[] match : matches) {
            int loser = match[1];
            winnersSet.add(match[0]);
            lossersCountMap.put(loser, lossersCountMap.getOrDefault(loser, 0) + 1);
        }

        for (int winner : winnersSet) {
            if (!lossersCountMap.containsKey(winner)) {
                one.add(winner);
            }
        }

        for (Map.Entry<Integer, Integer> entry : lossersCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                two.add(entry.getKey());
            }
        }

        Collections.sort(one);
        Collections.sort(two);

        result.add(one);
        result.add(two);

        return result;
    }
}
