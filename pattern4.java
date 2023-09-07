import java.util.*;
public class pattern4 {
    public static void main(String[] args){int i=1;
        
        for( i=1;i<=4;i++){int space=4-i;
            for(int j=space;j>=1;j--){
                System.out.print(" ");
                
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}