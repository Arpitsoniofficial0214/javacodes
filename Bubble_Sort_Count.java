
package Monu_Bhaiya_DSA;

public class Bubble_Sort_Count {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};

		int count = Sort(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\nSwap times kitna hai: " + count);
	}

	public static int Sort(int[] arr) {
		int count = 0;
        count++;
		for(int turn = 1; turn < arr.length; turn++) {
			count++;
			for(int i = 0; i < arr.length - turn; i++) {
				count++;

				if(arr[i] > arr[i+1]) {
					count++;
					int temp = arr[i];
					count++;
					arr[i] = arr[i+1];
					count++;
					arr[i+1] = temp;
				}
			}
		}

		return count;
	}
}