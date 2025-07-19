package Task1;

public class SumOfAdjacent {
	 public static int findTotalDistance(int n, int[] arr) {
	        int totalDistance = 0;
	        for (int i = 0; i < n - 1; i++) {
	            totalDistance += Math.abs(arr[i] - arr[i + 1]);
	        }
	        return totalDistance;
	    }
	public static void main(String[] args) {
		
		        int[] arr = {10, 11, 7, 12, 14};
		        int result = findTotalDistance(5, arr);
		        System.out.println(result);
		    }
}
