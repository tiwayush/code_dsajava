import java.util.*;
class insertelement{//leetcode prob 27
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        int v=sc.nextInt();int arr[]=new int[n];int k=0;int l=0;
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(num[i]==v){
                num[i]=0;
                k++;

            }
            

        }
        for(int i=0;i<n;i++){
            if(num[i]!=0){
                arr[l]=num[i];
                l++;

            }
        
            }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            

        }
        System.out.println(k);
        
    }
}
