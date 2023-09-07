import java.util.Scanner;

public class word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();n=n+" ";
        String s="";
        for(int i=0;i<n.length();i++){char ch=n.charAt(i);
            if(ch!=' '){
                s=s+ch;

            }
            else{
                System.out.println(s);s="";
            }
        }
    }
    
}
