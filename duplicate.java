public class duplicate {
    public static void main(String[] args){
        int arr[]={1,7,4,8,7,4,0,4};
        int l=arr.length; int arrr[]=new int[l];int temp=0;int k=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
        for(int i=0;i<l-1;i++){
            
                if(arr[i]!=arr[i+1]){
                    arrr[k]=arr[i];
                    k++;
                }
            }
        
        for(int i=0;i<k;i++){
          //  if(arrr[0]==0 && arrr[i]!=0) 
            System.out.println(arrr[i]);
        }
    }
    
}
