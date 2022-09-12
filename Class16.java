package Java08;

class Csphere
{
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLocation()
    {
        x = 3;
        y = 4;
        z = 5;
        radius = 1;
    }
    void surfaceArea()
    {
        System.out.println("surfaceArea:"+Math.round(4*Math.PI*Math.pow(radius,2)*100.0)/100.0);
    }
    void volumn()
    {
        System.out.println("volumn:"+Math.round(4/3*Math.PI*Math.pow(radius,3)*100.0)/100.0);
    }
    void showCenter()
    {
        System.out.println("showCenter:"+"("+x+","+y+","+z+")");
    }

}

public class Class16 {
    public static void main(String[] args) {
        Csphere a = new Csphere();
        a.setLocation();
        a.surfaceArea();
        a.volumn();
        a.showCenter();
    }
}