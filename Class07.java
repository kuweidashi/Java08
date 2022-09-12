package Java08;
class CTest {
    void test(int x) {

        if (x==0){
            System.out.println("此數為零");
        } else if (x%2==0) {
            System.out.println("此數為偶數");
        } else if (x%2==1) {
            System.out.println("此數為奇數");
        } 
    }
}

public class Class07 {
    public static void main(String[] args) {
        CTest t = new CTest();
        t.test(3);
        t.test(8);
        t.test(0);
    }
}
