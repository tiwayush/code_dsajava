import java.util.*;
public class replacewith {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";String w="";String n="";
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c!=' '){
                w=w+c;
            }
            else{
                if(w.equalsIgnoreCase("the")){
                    w="bigg";
                    
                }
            n=n+w+" "; w="";}
        }
        System.out.println(n);
    }
    
}
