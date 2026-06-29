class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[n + 1];
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = n; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result.add(num);
                    if (result.size() == k) break;
                }
            }
        }

        return result.stream().mapToInt(x -> x).toArray();

    }
}



void main() {
    
}