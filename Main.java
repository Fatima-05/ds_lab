import java.util.Scanner;
class Date{
    int day;
    int month;
    int year;

    public Date(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
}

public class Main{
    public static void main(String[] args){
        int day;
        int month;
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the date:");
        day=sc.nextInt();
        System.out.print("Enter the month in number (1 for January, ...): ");
        month=sc.nextInt();
        System.out.print("Enter the year: ");
        year=sc.nextInt();

        Date date1=new Date(day, month, year);
        System.out.println("Date is: "+date1.day+"-"+date1.month+"-"+date1.year);

        sc.close();
    }

}