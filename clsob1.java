import java.util.*;
class add{
    int a,b;
    void getdata(){
        Scanner sc=new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
    }
    void print(){
        System.out.println(a+b);
    }
}
class clsob1{
    public static void main(String[] args) {
        add ob=new add();
        ob.getdata();
        ob.print();
    }
}