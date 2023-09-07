import java.util.*;
public class maxproductsubarr {
    public static void main(String[] args){
        int arr[]={2,3,-2,4};
        int g=0;int a=0;int b=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]*arr[i+1]>g){
                g=arr[i]*arr[i+1];
                a=arr[i];b=arr[i+1];
            }
        }
        System.out.println(a+"" +b);
    }
    
}
