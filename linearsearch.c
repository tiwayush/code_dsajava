#include<stdio.h>
void linear(int a[],int n,int s){
    int i,flag=0;
    for(i=0;i<n;i++){
        if(a[i]==s){
            printf("element found at index %d",i);
            flag=1;
            break;
            }
        }
        if(flag==0){
            printf("not found");
        }
        
}
int main(){
    int n;int i;int s;
    printf("enter no.of elements");printf("\n");
    scanf("%d",&n);
    scanf("%d",&s);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    linear(a,n,s);
    
        return 0;
    

    
}