import java.util.*;
public class reveachword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s+" ";
        String w="";
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c!=' '){
                w=w+c;
            }
            else{
                int p=w.length();
                String e="";
                for(int j=p-1;j>=0;j--){
                    e=e+w.charAt(j);

                }
                System.out.println(e);
                w="";

            }
        }
    }
    
}
