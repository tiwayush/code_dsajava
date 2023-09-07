import java.util.*;
class acc{
    int accno;
    String name;
    double amt;
    void insert(int a,String b,double at){
        accno=a;
        name=b;
        amt=at;

    }
    void dep(int m){
        amt=amt+m;
        System.out.println(amt);
    }
    void withd(int n){
        if(n>amt){
            System.out.println("insufficient");
        }
        else{
        amt=amt-n;
        System.out.println("after rem "+amt);
    }
    }
}
class bank{
    public static void main(String[] args) {
        acc ob=new acc();
        ob.insert(7099,"paba",50);
        ob.dep(60);
        ob.withd(70);
    }
}