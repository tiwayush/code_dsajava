import java.util.*;
public class pattern5 {
    public static void main(String[] args){int i=1;
        
        for( i=1;i<=4;i++){int space=4-i;
            for(int j=space;j>=1;j--){
                System.out.print(" ");
                
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            int start=i-1;
            for(int l=start;start>=1;start--){
                System.out.print(start+" ");
            }
            System.out.println();
        }
    }
    
}