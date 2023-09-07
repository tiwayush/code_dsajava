import java.util.*;
class stonepaper {
    public static void main(String[] args){
        //0-->stone 1--> paper 2--> scissors
        Scanner sc= new Scanner(System.in);int s1=0;int s2=0;int t=5;
        while(true){
            int user1=sc.nextInt();
            int user2=sc.nextInt();
            if(user1==0 && user2==1){
                s2++;

            }
            else if( user1==1 && user2==0){
                s1++;
            }
            else if(user1==0 && user2==2){
                s1++;
            }
            else if(user1==2 && user2==0){
                s2++;
            }
            else if(user1==1 && user2==2){
                s2++;
            }
            else if(user1==2 && user2==1){
                s1++;
            }
            if(s1 >2* s2);
            System.out.println("player1");
            
            
        }

    }
    
}
