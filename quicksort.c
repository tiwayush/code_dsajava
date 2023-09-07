#include<stdio.h>
int partition(int a[],int l,int h){
    int pivot=a[l];
    int i=l;int j=h;int temp=0;
    do{
        do{
            i++;
        }
        while(a[i]<=pivot);
        do{
            j--;
        }
        while(a[j]>pivot);
    
    if(i<j){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }}while(i<j);
    temp=a[l];
    a[l]=a[j];
    a[j]=temp;

    return j;
    }

    void quicksort(int a[],int l,int h){
        int j;
        if(l<h){
            j=partition(a,l,h);
            quicksort(a,l,j);
            quicksort(a,j+1,h);
        }
    }

    int main(){
        int a[]={11,13,7,12,16,9,24,5,10,3,__INT32_MAX__};
        int i;
        quicksort(a,0,10);
        for(i=0;i<10;i++){
            printf("%d",a[i]);
            printf("\n");
            
        }return 0;

    }
