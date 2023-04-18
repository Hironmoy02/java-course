import java.util.*;


    public class gg{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String ans= scanner.nextLine();
            ans=ans.toLowerCase();

            String res="";
            for(int i=ans.length()-1;i>=0;i--){
                res+=ans.charAt(i);
            }
            System.out.println(res);
        }
    }


