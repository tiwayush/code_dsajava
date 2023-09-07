#include<stdio.h>
void bubble(int a[],int n){
    int i=0;int j=0;int temp=0;int flag=0;
    for(i=0;i<n;i++){
        flag=0;
        for(j=0;j<n-i;j++){
            if(a[j]>a[j+1]){
                flag=1;
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        if(flag==0){//to make it adaptive as if array is already sorted loop will terminate
            break;
        }
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
    bubble(a,n);
    printf("output");
    for(i=0;i<n;i++){
        printf("%d",a[i]);
        printf("\n");}
        return 0;
    

    
}