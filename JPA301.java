import java.util.*;
/**
 * JPA301
 */
public class JPA301 {
    public static void main(String[] args) {
        System.out.println("Input:");
        int n=new Scanner(System.in).nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("1+...+"+n+"="+sum);
    }
}