import java.util.Scanner;
public class Task5 {
    static void linearSearch(int[] nums, int key){
        Boolean found=false;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==key){
                System.out.println(key+" is at index "+i);
                found=true;
            }
        }
        if(!found)
            System.out.println(key+" is not in the array");
    }
    public static void main(String[] args) {
        int[] nums={12,23,10,3,5,13,11,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Array is: ");
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the number you want to search: ");
        int key=sc.nextInt();
        linearSearch(nums, key);
    }
}
