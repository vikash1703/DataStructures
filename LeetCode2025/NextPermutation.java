import java.util.*;
class NextPermutation{
	public void nextPermutation(int []nums) {
		int n=nums.length;
		//comment
		// Step-1: Find first decreasing element from end (mark as pivot)
		int i=n-2;
		while(i>=0 && nums[i]>=nums[i+1]) {
			i--;
		}
		// Step 2: if a decreasing element are found
		if(i>=0) {
			// Step 3: Find the element to swap (just larger than pivot)
			int j=n-1;
			while(nums[j]<=nums[i]) {
				j--;
			}
			// Step 4: Swap the element pivot and the largest tha pivot.
			swap(nums,i,j);
		}
		// Step 5: reverse the subarray (pivot and the larger element than pivot.
		reverse(nums,i+1,n-1);
	
	}
	// Helper function to swap element
	private void swap (int []nums,int i,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	// Helper function to reverse the array from index start to end
	private void reverseElement(int nums[],int start,int end) {
		while(start<end) {
			swap(nums,start,end);
			start++;
			end--;
		}
	}
	// Main method to test solution
	public static void main(String args[]) {
		nextPermutation nextpermutation= new nextPermutation();
		int nums[]= {1,2,3,6,5,4};
		System.out.println("Before next permutation:"+Arrays.toString(nums));
		nextpermutation.nextPermutation(nums);
		System.out.println("After next permutation:"+Arrays.toString(nums));
	}
}