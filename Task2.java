public class Task2 {
    static void reverseArray(int[] nums){
        int first=0;
        int last=nums.length-1;
        while(first<last){
            int temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        System.out.println("Original array:");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        reverseArray(nums);
        System.out.println();
        System.out.println("Reversed array:");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
