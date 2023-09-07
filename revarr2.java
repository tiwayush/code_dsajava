import java.util.*;
public class revarr2 {
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length/2;i++){
            int j=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=j;



        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
