package Java08;

class CBox {
    int length;
    int width;
    int height;
    void volumn() {
        System.out.println("volumn="+length*width*height);
    }
    void surfaceArea() {
        System.out.println("surfaceArea="+(length*width*2+length*height*2+width*height*2));
    }
    void showData() {
        System.out.println("length="+length);
        System.out.println("width="+width);
        System.out.println("height="+height);
    }
    void showAll() {
        System.out.println("volumn="+length*width*height);
        System.out.println("surfaceArea="+(length*width*2+length*height*2+width*height*2));
        System.out.println("length="+length);
        System.out.println("width="+width);
        System.out.println("height="+height);
    }
}

public class Class05 {
    public static void main(String[] args) {
        CBox box = new CBox();

        box.length = 1;
        box.width = 1;
        box.height = 1;

        box.volumn();
        box.surfaceArea();
        box.showData();
        box.showAll();
    }
}
