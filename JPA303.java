import java.util.*;
public class JPA303 {
    static Scanner sc=new Scanner(System.in);
    
public static void main(String[] args) {
    int total=0;
    int s=0;
    int count=0;
    double averages;

    System.out.println("please enter meal dollars or enter -1 to stop:");
    s=sc.nextInt();

    while (s!=-1) {
        total +=s;
        count++;
        System.out.println("please enter meal dollars or enter -1 to stop:");
        s=sc.nextInt();
    }
    averages=(double)total/count;
    System.out.println("餐點總費用:"+total);
    System.out.printf("%d道餐點平均費用為:%.2f %n",count,averages);
}
}
