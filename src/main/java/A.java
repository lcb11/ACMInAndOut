import java.util.Scanner;

/**
 * @author 刘从彪
 * @date： 2023/7/6
 * @description：
 */
/*
 * 输入两个数相加
 * */
public class A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}

/**
 * 输入一个整数num，输入num组a ,b两个数相加
 */
class B{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 0; i < num; i++) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}

/**
 * 输入两个数相加，当a,b都等于0时结束，否则相加
 */
class C{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a ==0 && b == 0) break;
            System.out.println(a + b);
        }
    }
}

/**
 * 当n等于0时，结束输入，否则将输入的n个数相加并打印出来
 */
class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if(n == 0) break;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}

/*
 *
 * */
class E{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++){
            int n = in.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += in.nextInt();
            }
            System.out.println(sum);
        }
    }
}





