class Square{
    int side;
    public int area(){

        return side*side;
    }
    public int Perimeter(){

        return 4*side;
    }
}



public class ex8 {
    public static void main(String[] args) {
Square lvaban=new Square();
       lvaban.side=8;
        System.out.println(lvaban.area());
        System.out.println(lvaban.Perimeter());
    }
}
