import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long maxprd=0;
            for(int i=0;i<n;i++){
                long prd=1;
                for(int j=0;j<n;j++){
                    if(i==j){
                        prd*=(a[j]+1);
                    }
                    else{
                        prd*=a[j];
                    }
                }
                    maxprd=Math.max(maxprd,prd);
            }
                System.out.println(maxprd);
        }
        
    }
}