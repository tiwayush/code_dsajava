#include<stdio.h>
void merge(int a[],int l,int mid,int h){
    int i=l;int k=0;int j=mid+1;
    int b[100];
    while(i<=mid&&j<=h){
        if(a[i]<a[j]){
            b[k++]=a[i++];
        }
        else{
            b[k++]=a[j++];
        }
    }
    for(;i<=mid;i++){
        b[k++]=a[i];
    }
    for(;j<=h;j++){
        b[k++]=a[j];
    }
    for(i=l,k=0;i<=h;i++,k++){
        a[i]=b[k];
    }
}

void mergesort(int a[],int l,int h){
    int mid;
    if(l<h){
        mid=(l+h)/2;
        mergesort(a,l,mid);
        mergesort(a,mid+1,h);
        merge(a,l,mid,h);

    }

}

int main(){
    int n;int i;
    printf("enter no.of elements");
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    mergesort(a,0,n-1);
    printf("output");
    for(i=0;i<n;i++){
        printf("%d",a[i]);
        printf("\n");}
        return 0;
        
    

    
}