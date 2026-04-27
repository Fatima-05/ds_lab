public class Task6{
    static void ascendingSort(int[] nums){
         for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }   
    }
    public static void main(String[] args){
        int[] nums={12,23,10,3,5,13,11,0,26,9};
        System.out.println("Array before sorting: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        ascendingSort(nums);
    }
}
