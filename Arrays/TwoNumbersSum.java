/*
Input : An array of sorted numbers and a needed sum. 

Output : All pairs of numbers summing up to the given sum. 

*/
public class TwoNumberSum {

	
public static void FindTwoNumberSum(int[] arr, int needed_sum){
		
	int i,j; 
	i = 0;
	j = arr.length - 1;
	int elements_sum;
	
	
	while(i < j){
		elements_sum = arr[i] + arr[j]; 
		if(elements_sum > needed_sum)
			j--;
		else if(elements_sum < needed_sum)
				i++;
		else{
			System.out.print(arr[i] + " " + arr[j] + "\n");
			i++; j--;
		}
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,7,27,29,32,46,64,71,93,98};
		int sum = 100;
		FindTwoNumberSum(arr,sum);
		
	}

}
