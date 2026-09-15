package bitmanipulationmathsconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int n : nums1)
			map.merge(n, 1, Integer::sum);
		List<Integer> res = new ArrayList<>();
		for (int n : nums2)
			if (map.getOrDefault(n, 0) > 0) {
				res.add(n);
				map.merge(n, -1, Integer::sum);
			}
		return res.stream().mapToInt(Integer::intValue).toArray();

	}

	public static void main(String[] args) {
		IntersectionArraysII sol = new IntersectionArraysII();
		int[] res = sol.intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
		for (int x : res)
			System.out.print(x + " "); // 2 2
	}
}
