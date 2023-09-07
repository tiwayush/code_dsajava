import java.util.*;
class reversearr{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=0;
        int start=arr[0];int end=arr[n-1];
        for(int i=1;i<n-2;i++){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            arr[n-1]=start;
            arr[0]=end;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}