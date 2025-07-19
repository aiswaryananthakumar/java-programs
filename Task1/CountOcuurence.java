package Task1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOcuurence {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int n = sc.nextInt();           
		        int[] arr = new int[n];

		        for (int i = 0; i < n; i++)        
		            arr[i] = sc.nextInt();

		        Map<Integer, Integer> map = new LinkedHashMap<>();

		        for (int num : arr)             
		            map.put(num, map.getOrDefault(num, 0) + 1);

		        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		            System.out.print(entry.getKey() + "-" + entry.getValue());
		            System.out.println(entry.getValue() > 1 ? " Occurrences" : " Occurrence");
		            sc.close();
		        }
	}

}
