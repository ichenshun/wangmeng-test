import java.util.ArrayList;
import java.util.List;


/**
 * @author wangmeng
 * @date 17/7/11
 */
public class Test50s {
    public static void main(String[] args) {

//        isPrime_number();
//        isShuiXianHua_number();
//        departInt(12);
//        departInt(7);
//        departInt(18);
//        score(20);
//        score(98);
//        score(78);
//        System.out.println(max_CommonDivisor(7,2));
//        System.out.println(max_CommonDivisor(30,10));
//        System.out.println(max_CommonDivisor(15,3));
//        System.out.println(min_CommonMultiple(15,3));
//        System.out.println(min_CommonMultiple(7,3));
//        System.out.println(min_CommonMultiple(2,3));
//        System.out.println(sum(1,3));
//        System.out.println(sum(2,2));
//        System.out.println(wanShu(6));
//        System.out.println(wanShu(7));
//        System.out.println(wanShu(20));
//        fullPermutation("abc");
//        fullPermutation("abcd");
//        fullPermutation("abce");
//        compare(2,3,4);
//        compare(5,2,4);
//        compare(3,3,1);
//        multiplication_table();
//        System.out.println(sum(3));
//        factorial2(3);
//          age(3);
//        subString("abc123456",3);
//        System.out.println(huiwen("12321"));
//        System.out.println(huiwen("123321"));
//        list(4);
//        list(2);
        yanghui_Triangel(7);
        //yanghui_Triangel(4);
        //dd();

    }


    // TODO:   2. 判断101-200之间有多少个素数，并输出所有素数
    public static void isPrime_number() {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                //符合条件的，如何把整个循环走完，再计数和添加呢？？？？
                count++;
                list.add(i);
            }
        }
        System.out.println(list);
        System.out.println(count);

    }

    // TODO:  3. 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
    public static void isShuiXianHua_number() {
        List<Integer> list = new ArrayList<>();
        for (int i = 100; i < 999; i++) {
            int gewei = i % 100;
            int shiwei = i / 100 % 10;
            int baiwei = i / 100 / 10;
            //怎么表示几次幂啊？？？？
            if (i == gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei) {
                list.add(i);
            }

        }
        System.out.println(list);
    }

    // TODO: 17/7/11 4.  将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
    public static void departInt(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num = num / i;
                list.add(i);
                i = 2;
            }
        }
        list.add(num);
        System.out.println(list);
        //todo
        // 怎么拼接起来呢，用*号
    }

    // TODO: 17/7/12    5.  利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
    public static void score(int score) {
        String result = score >= 90 ? ("A") : (score >= 60 && score <= 89 ? ("B") : ("C"));
        System.out.println(result);
    }

    // TODO: 17/7/12   6.  输入两个正整数m和n，求其最大公约数和最小公倍数
//    public static int compare(int num1,int num2){
//        if(num1 < num2){
//            int temp =0;
//            temp = num2;
//            num2 = num1;
//            num1 = temp;
//        }
//        return (num1,num2);
//    }
    // TODO: 17/7/12 传入多个参数，想要返回多个数值，如何返回？？？？？
    public static int max_CommonDivisor(int num1, int num2) {
        if (num1 < num2) {
            int temp = 0;
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        for (int j = num2; j >= 1; j--) {
            if (num2 % j == 0 && num1 % j == 0) {
                return j;
            }
        }
        return 1;
    }

    public static int min_CommonMultiple(int num1, int num2) {
        int result = 1;
        if (num1 < num2) {
            int temp = 0;
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        for (int j = 2; j <= num2; j++) {
            if (num2 % j == 0 && num1 % j == 0) {
                result = result * j;
                num1 = num1 / j;
                num2 = num2 / j;
                j = 2;
            }
        }
        return result * num1 * num2;
    }

    // TODO: 17/7/12    7. 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
    //怎么比较呢，如何区分是字母和数字或其他的字符呢？
    //某一个字符是否在一个数组里面：1.如何生成一个有序的数组 2.该字符是否在该数组里面，怎么做判断？


    // TODO: 17/7/12   8.  求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)
    public static int sum(int a, int num) {
        int result = 0;
        for (int i = 0; i <= num; i++) {
            result += (a * Math.pow(10, num - i - 1)) * (i + 1);
        }
        return result;
    }

    // TODO: 17/7/12  9. 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。
    public static boolean wanShu(int num) {
        int result = 0;
        int expect = num;
        for (int j = 1; j < num; j++) {
            if (num % j == 0) {
                result += j;
                num = num / j;
                j = 2;
            }
        }
        if (result == expect) {
            return true;
        }
        return false;
    }

    // TODO: 17/7/13    11. 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    //全排列写的还是有问题！！！！！！---解决啦啦啦啦啦 :)
    public static List<String> fullPermutation(String str) {
        List<String> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        if (str.length() == 1) {
            list.add(str);
        }
        for (int i = 0; i < str.length(); i++) {
            temp = fullPermutation(subString(str, i));
            for (int j = 0; j < temp.size(); j++) {
                list.add(str.charAt(i) + temp.get(j));
            }
        }
        System.out.println(list);
        return list;
    }

    public static String subString(String str, int i) {
        String result = "";
        result = str.substring(0, i) + str.substring(i + 1, str.length());
        System.out.println(result);
        return result;
    }

    // TODO: 17/7/18  15.  输入三个整数x,y,z，请把这三个数由小到大输出。
    public static void compare(int x, int y, int z) {
        int temp = 0;
        if (x > y) {
            temp = y;
            y = x;
            x = temp;
            System.out.println(x + "+" + y);
        }
        if (x > z) {
            temp = x;
            x = z;
            z = temp;
            System.out.println(x + "+" + z);
        } else if (x < z && y > z) {
            temp = y;
            y = z;
            z = temp;
            System.out.println(x + "+" + y + "+" + z);
        } else {
            System.out.println(x + "+" + y + "+" + z);
        }
        System.out.println(x + "+" + y + "+" + z);
    }
//     TODO: 17/7/18  冒泡排序
    //1. compareTo 不会用
    //2. 饮用类型的怎么比较大小，交换位置？？
    //3. 多个数如何进行排序？？
//    public static void bubbleSort(String str){
//        List <String> list = new ArrayList<>();
//        char temp;
//        for(int i=0;i<str.length();i++){
//            for(int j= i+1;j<str.length();j++){
//
//                if(str.charAt(i) < str.charAt(j)){
//                    str.replace(str.charAt(j),max);
//                    temp = str.charAt(j);
//
//                    char max = str.charAt(i);
//                    str.charAt(i) = temp ;
//
//                }
//
//            }

//        }

//    }
    // TODO: 17/7/18  13.  一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
    //如何判断一个数开平方出来是一个整数？？？


    // TODO: 17/7/18   14. 输入某年某月某日，判断这一天是这一年的第几天？
    /*
    [1,3,5,7,8,10,12]={31}
    [2]={28}
    [4,6,9]={30}

    //四年一闰，百年不闰,2000年是闰年，2100年则是平年----能被4整除但是不能被100整除
    //闰月，闰哪个月啊？？
     */
// TODO: 17/7/18  16.  输出9*9口诀
    public static void multiplication_table() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }

    }
    // TODO: 17/7/18  17. 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩
//    下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下
//    的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。

    // TODO: 17/7/18   18.  两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向
//    队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。

// TODO: 17/7/18    19.  打印出如下图案（菱形）
    /*
*
***
******
********
******
***
*
     */

    // TODO: 17/7/18   20.  有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
    //分数怎么存起来？？


    // TODO: 17/7/18   21.   求1+2!+3!+...+20!的和
    public static int sum(int j) {
        int sum = 0;
        for (int k = 1; k <= j; k++) {
            sum += factorial(k);
            System.out.println(sum);
        }
        return sum;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }

    // TODO: 17/7/18    22. 利用递归方法求5!
    public static int factorial2(int n) {
        int result = 1;
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            result = n * factorial2(n - 1);
        }
        System.out.println(result);
        return result;
    }

    // TODO: 17/7/18   23.  有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问
//    第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个
//    人多大？
    public static int age(int n) {
        int result = 0;
        if (n == 1) {
            return 10;
        }
        for (int i = 2; i <= n; i++) {
            result = 2 + age(n - 1);
        }
        System.out.println(result);
        return result;
    }

    // TODO: 17/7/18    25.  一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同
    public static boolean huiwen(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
// TODO: 17/7/18    26.  请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。

// TODO: 17/7/18   30.  有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
    //for 循环往后逐个挪位子，问题是怎么表现一个已经排序好的数组呢？？


    // TODO: 17/7/18     31. 将一个数组逆序输出
    //怎么定义一个n个数的数组，还可以作为参数传进去？？
//    public static int[] revertArr(int n[]){
//        for(int i=n;i>){}
//    }

    // TODO: 17/7/18   32.  取一个整数a从右端开始的4～7位。


    // TODO: 17/7/19   33.  打印出杨辉三角形（要求打印出10行如下图）
    /*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

     */
    //为什么这个复杂度很高呢？？要如何优化呢？？？
    public static void yanghui_Triangel(int n) {

        for (int j = 0; j < n; n++) {
            List<Integer> list = list(j);

//            for (int k = 0; k < list.size(); k++) {
//                int value = list.get(k);
//                System.out.print(value + " ");
//            }
            for (Integer value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
    public static void dd() {
        List<Integer> list = list(1);
        System.out.println(list);
    }

    public static List<Integer> list(int n) {
        List<Integer> list = new ArrayList<>();
        if (n == 0) {
            list.add(1);
            return list;
        }
        if (n == 1) {
            list.add(1);
            list.add(1);
            return list;
        }
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n) {
                list.add(1);
            } else {
                list.add(list(n - 1).get(i - 1) + list(n - 1).get(i));
            }
        }
        return list;
    }


}

// TODO: 17/7/19   35. 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。


// TODO: 17/7/19   36.有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
//怎么扩展这个数组呢？一个固定长度的数组怎么扩？？

// TODO: 17/7/19  37. 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下
//的是原来第几号的那位。

// TODO: 17/7/20   39.  编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n
//1. 分数怎么存？？
//2. n/2存为k，然后遍历加和


// TODO: 17/7/20   40. 字符串排序
//题目都没有看懂

// TODO: 17/7/20   49.  计算字符串中子串出现的次数


// TODO: 17/7/20  50. 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。





