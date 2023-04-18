public class arrrsys1
{
    public static void main(String[] args){
        float
                [] marks={50.5f,20.3f,90.3f,14.0f,9.4f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println(sum);
    }
}
