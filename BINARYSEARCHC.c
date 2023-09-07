#include<stdio.h>
int main(){
    int n;int x;
    int start=0;int mid;
    scanf("%d",&n);
    scanf("%d",&x);
    int arr[n];
    int end=n-1;int i;
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);

    }
    while(start<=end){
        mid=(start+end)/2;
        if(arr[mid]==x){
            printf("found");
            break;
        }
        else if(arr[mid]<x){
            start=mid+1;
        }
        else if(arr[mid]>x){
            end=mid-1;
        }
    }
    if(start>end){
        printf("not found");
    }
    return 0;
}