public class isbn {
    public static void main(String[] args){
        String s="211013213181";String a=s;
        int arr[]=new int[13];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[i]=ch-'0';
        }
       // for(int i=0;i<arr.length;i++){
            int check=10-((arr[0]*3*arr[1]*arr[2]*3*arr[3]*arr[4]*3*arr[5]*arr[6]*3*arr[7]*arr[8]*3*arr[9]*arr[10]*3*arr[11])%10);
            System.out.println(check);
            if(check==10){
                s=s+"0";
            }
            else
            System.out.println("sorry");
            System.out.println(s);
       // }
    }
    
}
