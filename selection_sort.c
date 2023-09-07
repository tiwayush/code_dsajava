#include<stdio.h>
void selection(int a[],int n){
    int i,j,k;int temp=0;
    for(i=0;i<n;i++){
        for(j=k=i;j<n;j++){
            if(a[j]<a[k]){
                k=j;
            }

        }
        temp=a[i];
        a[i]=a[k];
        a[k]=temp;
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
    selection(a,n);
    printf("output");
    for(i=0;i<n;i++){
        printf("%d",a[i]);
        printf("\n");}
        return 0;
    

    
}