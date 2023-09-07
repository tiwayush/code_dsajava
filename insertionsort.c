#include<stdio.h>
void insertion(int a[],int n){
    int i,j,x;
    for(i=1;i<n;i++){
        j=i-1;
        x=a[i];
        while(j>-1 && a[j]>x){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=x;
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
    insertion(a,n);
    printf("output");
    for(i=0;i<n;i++){
        printf("%d",a[i]);
        printf("\n");}
        return 0;
    

    
}
