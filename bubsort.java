 import java.util.*;
 class bubsort {

    public static void main(String[] args){
        int arr[]={1,4,2,3,5,20,6,8,9,10};int l=arr.length;
        for(int i=0;i<l;i++){
            for(int j=1+i;j<l;j++){// IMPORTANT STEP--> j=i+1
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
    
}
