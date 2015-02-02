
/*

Input : array of integers

Output : Maximum contiguous sub array sum

*/
public class MaxSumSubarray {

	public static int maxSubArraySum(int[] arr){
	
		int max_temp = 0;
		int global_maxsum = 0;
		int i = 0; 
		int len = arr.length;
		System.out.println("Max sum at each position of array : ");
		for( i = 0; i < len; i++){
			max_temp += arr[i];
			if(max_temp < 0)
				max_temp = 0;
			if(max_temp > global_maxsum){
				global_maxsum = max_temp;
			}
			System.out.print(max_temp+" ");
		}
		System.out.println();
		return global_maxsum;
	}
	
	public static int maxSubArraySumDP(int[] arr){
		
		int max_sum = arr[0];
		int curr_max = arr[0];
		int i = 0;
		System.out.println("\n\n DP Method \nMax sum at each position of array : ");
		for(i = 0 ; i < arr.length; i++){
			
				curr_max = Math.max(arr[i], curr_max+arr[i]);
				max_sum = Math.max(max_sum, curr_max);
				System.out.print(curr_max+" ");
		}
		return max_sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_sum = maxSubArraySum(a);
		System.out.println("Max Contiguous sum is : "+max_sum);
		
		int b[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		max_sum = maxSubArraySumDP(b);
		System.out.println("\nMax Contiguous sum is : "+max_sum);
		}
	}
