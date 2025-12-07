
public class Largest {

	public static int findLargest (int[] list) {
		int index = 0;
		int max = Integer.MAX_VALUE;
				
		for (index = 0; index < list.length; index++) {
			if (list[index] > max) {
				max = list[index];
			}
		}

		return max;
	}
}



