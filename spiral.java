import java.util.*;
public class spiral {
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int s1=0;int s2=0;int s3=0;int s4=0;int s5=0;int s6=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                s1+=arr[i][j];
                s2+=arr[j][i];
                if(i==j){
                    s3+=arr[i][j];

                }
                if((i+j)==3-1){
                    s4+=arr[i][j];
                }
                if(j>=i){
                    s5+=arr[i][j];//upper
                }
                if(j<=i){
                    s6+=arr[i][j];
                }

            }
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
    
}
