import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
	public String[] findSumNum(String[] nums) {
		String[] result = new String[2];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
		
		int result_num = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length(); j++) {
				char cur_alphabet = nums[i].charAt(j);
				if((cur_alphabet == 'I' || cur_alphabet == 'X' || cur_alphabet == 'C') && j < nums[i].length() - 1) {
					String temp = Character.toString(cur_alphabet) + Character.toString(nums[i].charAt(j + 1));
					if(map.containsKey(temp)) {
						result_num += map.get(temp);
						j++;
						continue;
					}
				}
				result_num += map.get(Character.toString(cur_alphabet));
			}
		}
		result[0] = Integer.toString(result_num);
		
		String result_str = "";
		ArrayList<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue(Collections.reverseOrder()));
		while(result_num != 0) {
			int temp = 0;
			for(Entry<String, Integer> e : list) {
				temp = result_num / e.getValue();
				if(temp != 0) {
					for(int i = 0; i < temp; i++) {
						result_str += e.getKey();
					}
					result_num = result_num % e.getValue();
					break;
				}
			}
		}
		result[1] = result_str;
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nums = new String[2];
		for(int i = 0; i < 2; i++) {
			nums[i] = br.readLine();
		}
		br.close();
		Main m = new Main();
		String[] result = m.findSumNum(nums);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}