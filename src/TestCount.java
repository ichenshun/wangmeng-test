import java.util.ArrayList;
import java.util.List;

public class TestCount {
    public static void main(String[] args) {
        System.out.println("rev num 2=" + revNum(2));
        System.out.println("rev num 25=" + revNum(25));
        System.out.println("rev num 256=" + revNum(256));
        System.out.println("count of 256 = " + count(256));
        System.out.println("count of 0 = " + count(0));
        System.out.println("count of 1 = " + count(1));

    }

    //给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
    /**
    public static int count(int num) {
        if (num / 10000 != 0) {

            return 5;
        }
        if (num / 1000 != 0) {
            return 4;
        }
        if (num / 100 != 0) {
            int i = num/100;
            int k = (num-100)/10;
            int j = (num-i*100-k*10)%10;
            System.out.println(j+k+i);
            return 3;
        }
        if (num / 10 != 0) {
            int k = num%10;
            int j = num/10;
            System.out.println(k+j);
            return 2;
        } else {
            return 1;
        }
    }
     */
    public static int count(int num){
        if (num == 0) {
            return 1;
        }
        int count = 0;
        for(int t = num; t != 0; t = t/10){
            count++;
        }
        return count;
    }

    public static List<Integer> revNum(int num) {
        List<Integer> result = new ArrayList<>();
        for (int t = num; t != 0 ; t = t/10) {
            int temp = t%10;
            result.add(temp);
        }
        return result;
    }
}