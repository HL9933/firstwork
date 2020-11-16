import java.util.Scanner;
public class level1 {
    public static void main(String[] args) {
        System.out.println("please input a number:");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println("累加和为："+sum);
    }
}
