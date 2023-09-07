public class saddle {
    public static void main(String[] args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int min=arr[i][0];
            int col=0;
            for(int j=1;j<n;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                    col=j;
                }
            }int k;
            for( k=0;k<n;k++){
                if(min<arr[k][col]){
                    break;
                }
            }
            if(n==k){
                System.out.println("saddle");

            }
        }


    }
    
}
