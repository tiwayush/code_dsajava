import java.util.*;
class add{
    int arr[]=new int[13];
    int sum;
    add(int arr[],int sum){
        this.arr=arr;
        this.sum=sum;
    }
    void arrayadd(String n){
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
    System.out.println(n);}

    void arrayadd(String n,int a){
        System.out.println(n+""+a);
    }
}

class constrr2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int a=sc.nextInt();
        int arr[]=new int[13];
        for(int i=0;i<13;i++){
            arr[i]=sc.nextInt();
        }

        add ob=new add(arr,0);
        ob.arrayadd(n);
        ob.arrayadd(n, a);

    }
}