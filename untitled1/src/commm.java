import java.util.Scanner;
public class commm {
    public static void main(String[] args){
    int age;
    System.out.println("enter the age");
    Scanner sc= new Scanner(System.in);
    age=sc.nextInt();
    switch(age){
        case 18:
            System.out.println("adult");
            break;
        case 10:
            System.out.println("bacha mama");
            break;
        default:
            System.out.println("masti crow");
    }
    }
}
