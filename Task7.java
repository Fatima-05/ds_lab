public class Task7 {
    static void dupliValues(int[] nums){
        System.out.print("Duplicate values are: ");
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    System.out.print(nums[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={3,5,23,12,0,23,13,12,3};
        System.out.print("Array is:");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        dupliValues(nums);
    }
}
