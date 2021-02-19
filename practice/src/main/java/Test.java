import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    int x=0;

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        StringBuilder
        arrayList.add("k");
        arrayList.remove("k");
        String ss = "";
        char[] charArray  = ss.toCharArray();
        //charArray.

        Test test= new Test();
        method1(test);
        System.out.println(test.x);  //5
        method2(test.x);
        System.out.println(test.x); //5
    }
    public static void method1(Test t){
        t.x=5;
    }

    public static void method2(int x){
        x=10;
    }
}





