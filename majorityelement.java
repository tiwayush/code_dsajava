import java.util.*;
class majorityelement{
    public static void main(String[] args){
        int arr[]={1,3,3,4,3,5,7,3,7,3};int c=0;int maj=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }if(c>=arr.length/2){
                    maj=arr[i];
                }
            }c=0;
        }System.out.println(maj);
    }
}