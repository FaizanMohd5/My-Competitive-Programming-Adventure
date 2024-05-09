import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Solution {
	static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		
		Collections.sort(arr);

		ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();

		int i = 0;
		int j = n - 1;
		while(i < j){
			int sum = arr.get(i) + arr.get(j);
			if(sum == target){
				Pair<Integer, Integer> pair = new Pair<>(arr.get(i), arr.get(j));
				list.add(pair);
				i++;
				j--;
			}

			else if(sum < target){
				i++;
			}
			else{
				j--;
			}

		}

		if(list.size() == 0){
			list.add(new Pair<>(-1, -1));
		}

		return list;

	}
}
