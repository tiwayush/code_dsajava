import java.util.*;
class emp{
    String name;
    double salary;
    int age;
    emp(String n,double s){
        name=n;
        salary=s;
    }
    emp(String n,double s,int a){
        name=n;salary=s;age=a;
    }
    void getsal(){
        if(salary>60){
            System.out.println(salary+10);
        }
        else{
            salary=salary-10;
        }
    }
    void display(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
    }
}
class constr{
    public static void main(String[] args) {
        
    
    emp ob=new emp("aa",70.0);
    emp ob2=new emp("jj",50.0,33);
    ob.getsal();
    ob.display();
    ob2.getsal();
    ob2.display();
}}