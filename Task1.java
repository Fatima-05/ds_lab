import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[10];
        System.out.println("Enter 10 numbers for the array one by one:");
        for(int i=0; i<nums.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            nums[i]=sc.nextInt();
        }
        int min=nums[0];
        int max=nums[0];
        for(int i=0; i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);       
    }
}
