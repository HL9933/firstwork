import java.util.Scanner;

public class feibonaqi {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        System.out.println("输入n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(c);
        } else if (n == 2 || n == 3) {
            System.out.println(a);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;//求和
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
