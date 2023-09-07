#include<stdio.h>
int findmax(int a[],int n){
    int max=0;
    int i;
    for(i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    return max;
}

void countsort(int a[],int n){
    int i,j;
    int m=findmax(a,n);
    int c[m+1];
    for(i=0;i<m+1;i++){
        c[i]=0;
    }
    for(i=0;i<n;i++){
        c[a[i]]++;
    }
    i=0;j=0; 
    while(j<m+1){
        if(c[j]>0){
            a[i]=j;
            i=i+1;
            c[j]--;
        }
        else
        j=j+1;
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
    countsort(a,n);
    printf("output");
    for(i=0;i<n;i++){
        printf("%d",a[i]);
        printf("\n");}
        return 0;
    

    
}