public class RemoveDuplicateElement {
public int removeDuplicate(int []nums) {
	int count=0;
	for(int i=0;i<nums.length;i++) {
		if(i<nums.length-1 && nums[i]==nums[i+1]) {
			continue;
		}
		else {
			nums[count]=nums[i];
			count++;
		}
	}
	return count;
}
public static void main(String args[]) {
	 RemoveDuplicateElement  remove=new  RemoveDuplicateElement ();
	 int nums[]= {0,0,1,1,1,2,2,3,3,4};
	 int newLength=remove.removeDuplicate(nums);
	 for(int i=0;i<newLength;i++) {
		 System.out.print(nums[i]+" ");
	 }
}
}
