public class arrays2 {
    public static void main(String[] args){
        float[] marks={44.2f,44.3f,9.2f,4.0f,65.f};
        float num=23.f;
        boolean isinarray=false;
        for(float element:marks){
            if(num==element){
                isinarray=true;
                break;
            }
        }
        if(isinarray){
            System.out.println("int the array");
        }
        else {System.out.println("not in the array");}

    }
}
