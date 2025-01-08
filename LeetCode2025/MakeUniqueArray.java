import java.util.*;
public class MakeUniqueArray {
public static int minElementToRemove(int arr[]) {
	HashSet<Integer> uniqueElement=new HashSet<>();
	int DuplicateCounter=0;
	for(int num:arr) {
		if(!uniqueElement.add(num)) {
			DuplicateCounter++;
		}
	}
	return DuplicateCounter;
}
public static void main(String args[]) {
	int array[]= {1,2,1,2};
	int result=minElementToRemove(array);
	System.out.println("Minimum element to remove to make array distinct"+" " +result);
}
}
