//ALWAYS FOR SORTED ARRAYS..
//FIND MID ELEMENT AND COMPARE IT WITH KEY
//IF KEY > MID THEN L0WER INDEX= MID +1
//ELSE END =MID-1
//COMPLEXITY = O(LOG N)
public class binarysearch {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int start=0;int key=3;
        int end=arr.length-1;
        int mid=(start+end)/2;
        // mid = s+e/2 may give integer out of bound error to prevent this USE MID =S+((E-S)/2)
        while(start<=end){
            if(arr[mid]==key){
                System.out.println("found");
                
                break;

            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        if(start>end){

        
        System.out.println(" not found");}

    }
    
}
