public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0; // Pointer to place the next valid element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index; // New length of the array
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;

        int newLength = removeElement(nums, val);
        System.out.println("New Length: " + newLength);

        // Print the modified array
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}