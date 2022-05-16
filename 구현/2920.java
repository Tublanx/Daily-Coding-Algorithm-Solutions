import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numArrAsc[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int numArrDesc[] = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int nums[] = new int[8];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}

		if (Arrays.equals(nums, numArrAsc)) {
			System.out.println("ascending");
		} else if (Arrays.equals(nums, numArrDesc)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}

}