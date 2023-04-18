import java.util.*;

public class sdsd {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine(); sc.close();
int space=0;
int letter=0;
for (int i=0;i<str.length();i++){
    if(Character.isLetter(str.charAt(i)))
        letter++;
    else space++;
}
        System.out.println("space"+space);
        System.out.println("letter"+letter);
    }
}
