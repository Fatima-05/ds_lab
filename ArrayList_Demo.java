import java.util.Scanner;
class arraylist{
    int arr[];
    int maxSize;
    int listSize;
    int curr_loc;

    arraylist(){
        maxSize=10;
        arr=new int[10];
        curr_loc=0;
    }
    arraylist(int maxSize){
        this.maxSize=maxSize;
        arr=new int[maxSize];
        curr_loc=0;
    }

    public void insert(int loc, int val){
        if(curr_loc>=maxSize){
            System.out.println("Out of bound");
        }
        else{
            if(loc>=curr_loc){
                arr[curr_loc]=val;
            }
            else{
                for(int i=curr_loc;i>loc;i++){
                    arr[i]=arr[i-1];
                }
                arr[loc]=val;
            }
            curr_loc++;
            System.out.println("Inserted successfully!");
        }
    }

    public int search(int val){
        int loc=0;
        boolean found=false;
        for(int i=0;i<curr_loc;i++){
            if(val==arr[i]){
                loc=i;
                found=true;
                break;
            }

        }
        if(found){
            System.out.println("Value found at loc "+loc);
            return loc;
        }
        else{
            System.out.println("Value is not in the list");
            return -1;
        }
    }


    public void delete(int val){
        int loc=search(val);
        if (loc!=-1){
            for(int i=loc;i<curr_loc-1;i++){
                arr[i]=arr[i+1];
            }
            curr_loc--;
            System.out.println("Deleted successfully!");
        }
        else{
            System.out.println("List already empty");
        }
    }

    public void display(){
        for(int i=0;i<curr_loc;i++){  
            System.out.println(arr[i]); 
        } 
    }

}

public class ArrayList_Demo {
     public static void main(String[] args) { 
        arraylist a1=new arraylist(10); 
        int opt; 
        Scanner input = new Scanner(System.in); 
        do { 
            System.out.println("1.Insert"); 
            System.out.println("2.Delete");     
            System.out.println("3.Search"); 
            System.out.println("4.Display"); 
            System.out.println("5.Quit"); 
            System.out.println("Select an operation : ");
            
            opt = input.nextInt(); 

            switch (opt) { 
            case 1: 
                System.out.println("Enter number to be inserted: "); 
                int val = input.nextInt(); 
                System.out.println("Enter location/index at which you want to insert: "); 
                int loc = input.nextInt(); 
                a1.insert(loc, val); 
                break; 
            case 2: 
                System.out.println("Enter number to be deleted: "); 
                val = input.nextInt(); 
                a1.delete(val); 
                break; 
            case 3: 
                System.out.println("Enter number to be searched: "); 
                val = input.nextInt(); 
                a1.search(val); 
                break; 
            case 4: 
                a1.display(); 
                break; 
            case 5: 
                System.exit(0); 
            default: 
                System.out.println("Wrong choice\n"); 
            } 
        }
        while(opt!=5);
        input.close();         
    }
}
