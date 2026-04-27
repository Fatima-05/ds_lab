public class Task3 {
    static void evenOddCount(int[] nums){
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                even_count++;
            else
                odd_count++;
        }
        System.out.println("Number of even vlaues in array: "+even_count);
        System.out.println("Number of odd vlaues in array: "+odd_count);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        evenOddCount(nums);
    }
}
