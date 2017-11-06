import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.LinkedList;
import java.util.List;

public class Oke {

public static void main(String[] Number) {
    System.out.println(digitSumToString( 345));

}





public static int determineMaximum(int x, int y, int z) {
    if (x > y && x > z) {
        return x;

    } else if (y > x && y > z) {
        return y;

    } else {
        return z;
    }


}

public static int interval(int a, int b){
    int i = 0;
    if(a>b) {
        while (a>=b) {
            i = b + i;
            b++;

        }
    }else{
        while (b>=a) {
            i = a + i;
            a++;


        }
    }return i;

}

public static boolean isOk(int a,int b, int c){
    return (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b);





}

public static int digitSum(int a){
    int  i = 0;
    if(a<0){
        a = a * -1;
    }
    while(a>0){
        i = a % 10 +i;
        a = a / 10;

    }return i;

}


public static String digitToString(int a) {
    if(a == 0) {
        return "null";
    }
    if(a == 1) {
        return "eins";
    }
    if(a == 2) {
        return "zwei";
    }
    if(a == 3) {
        return "drei";
    }
    if(a == 4) {
        return "vier";
    }
    if(a == 5) {
        return "fünf";
    }
    if(a == 6) {
        return "sechs";
    }
    if(a == 7) {
        return "sieben";
    }
    if(a == 8) {
        return "acht";
    }
    if(a == 9) {
        return "neun";
    }
    return "fuck you";
}

public static String intToString(int a){
    //int i = 0;
    List<String> peter = new LinkedList<>();

    String x = "";
    if(a<0){
        a = a * -1;
        x = x + "-";
    }
    while (a>0){
        //x = x + digitToString(a % 10);
        peter.add(digitToString(a % 10));
        /*if(a > 9){
            x = x + "-";

        }

        */

        a = a / 10;


    }
    for(int i = peter.size() - 1; i >= 0; i-- ){
        x = x + peter.get(i);
        if (i > 0){
            x = x + "-";

        }

    }
    return x;
}

public static String digitSumToString(int a){
    a = digitSum(a);
    return intToString(a);

}

























}
