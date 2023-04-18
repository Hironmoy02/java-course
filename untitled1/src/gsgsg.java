
class Cylinder{
    private int height;
    private int rad;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
}



public class gsgsg {

    public static void main(String[] args) {
        Cylinder mycy= new Cylinder();
        mycy.setHeight(12);
        System.out.println(mycy.getHeight());
        mycy.setRad(9);
        System.out.println(mycy.getRad());
    }
}
