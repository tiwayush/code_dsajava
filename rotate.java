public class rotate {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};int k=3;int temp[]={1,2,3,4,5,6,7};
        int l=arr.length;
        for(int i=0;i<l;i++){
            temp[(i+k)%l]=arr[i];
        }
        for(int i=0;i<l;i++){
            System.out.println(temp[i]);
        }

    }
    
}
