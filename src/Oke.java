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


    public static int sumUpNegatives(int[] pArray){
        int sum = 0;
        for(int i = 0; i <= pArray.length -1; i++){
            if(pArray[i] < 0){
                sum = sum + pArray[i];
            }
        }
        return sum;
    }
    public static int maximum(int[] pArray){
        int biggy = pArray[0];
        for(int i = 1; i <= pArray.length -1; i++){
            if(pArray[i]>biggy){
                biggy = pArray[i];
            }
        }
        return biggy;
    }
    public static int countMaximum(int[] pArray){
        int sumOfBiggies = 0;
        int biggy = maximum(pArray);

        for(int i = 0; i<= pArray.length -1; i++){
            if(biggy == pArray[i]){
                sumOfBiggies++;
            }
        }
        return sumOfBiggies;
    }
    public static boolean sorted(int[] cavid){
        int x = cavid[0];
        for(int i = 1; i <= cavid.length -1; i++){
            if(x<=cavid[i]){
                x = cavid[i];

            }else return false;
        }
        return true;
    }
    public static boolean checkArray(int[] cavid){
        int x = cavid.length -1;
        for(int i = 0; i <= cavid.length -1;i++){
            if(cavid[i] == cavid[x]){
                x--;
            }else return false;
        }
        return true;
    }
    public static int[] increaseArray(int[] cavid,int x){
        for(int i = 0; i < cavid.length; i++){
            cavid[i] = cavid[i] + x;
        }
        return cavid;
    }
    public static int[] doubleIfContainsPositive(int[] cavid){
        for(int i = 0; i < cavid.length; i++){
            if(cavid[i] > 0){
                for(int x = 0;x < cavid.length; x++){
                    cavid[x] = cavid[x] + cavid[x];
                }
                break;
            }
        }
        return cavid;
    }
    public static String toString(int[] cavid){
        String zahlen = "";
        for(int i = 0; i < cavid.length; i++ ){
            if(i == 0){
                zahlen = "" + cavid[i];
            }else
                zahlen = zahlen + "," + cavid[i];
        }
        return zahlen;
    }
    public static int[] copyStartingValues(int[] pArray){
        int[] nArray = new int[3];
        if(pArray.length < 3){
            nArray = pArray;
        }else{
            for(int i = 0; i <= 2; i++){
                nArray[i] = pArray[i];
            }
        }
        return nArray;
    }
    public static int countNegatives(int[] pArray){
        int x = 0;
        for(int i = 0; i < pArray.length; i++){
            if(pArray[i] < 0){
                x++;
            }
        }
        return x;
    }
    public static int[] selectNegatives(int[] pArray){
        int[] nArray = new int[countNegatives(pArray)];
        int x = 0;
        for(int i = 0; i < pArray.length; i++){
            if(pArray[i] < 0){
                nArray[x] = pArray[i];
                x++;
            }
        }
        return nArray;
    }
    public static boolean twoTimes(int [] arr){
        if(arr.length < 2){
            return false;
        }else{
            for(int i = 0; i < arr.length; i++){
                int y = 0;
                for(int j = 0; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        y++;
                    }
                }
                if(y != 2){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] addArrays(int[] arr, int[] ay){
        int[] cavid = new int[arr.length];
        if(arr.length == ay.length){
            for(int i = 0; i < arr.length; i++){
                cavid[i] = arr[i] + ay[i];
            }
        }else{cavid = new int[0];}
        return cavid;
    }






















}
