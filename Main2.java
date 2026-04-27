import java.util.Scanner;
import java.util.Date;

class Person{
    private String name;
    private int age;
    private Date date_of_birth;


    public Person(){
        this.name=" ";
        this.age=0;
        this.date_of_birth=null;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setDOB(Date date_of_birth){
        this.date_of_birth=date_of_birth;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Date getDOB(){
        return date_of_birth;
    }

    public Person(String name, int age, Date date_of_birth){
        this.name=name;
        this.age=age;
        this.date_of_birth=date_of_birth;
    }

    public void displayInfo(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nDate of birth: "+date_of_birth.toString());
    }
}

public class Main2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Date dob1=new Date(2005, 10, 03);
        Person p1=new Person("Fatu",20,dob1);
        Person p2=new Person();
        p2.setName("Badami");
        p2.setAge(25);
        p2.setDOB(new Date(2000,12,23));

        p1.displayInfo();
        p2.displayInfo();

        sc.close();
    }
}
