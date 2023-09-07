#include<stdio.h>
#include<string.h>
int i;int top=-1;int flag=0;char arr[100];char a;
void push(char ele){
    

    top=top+1;
    arr[top]=ele;

}

void display(int len,char str[]){
for(i=0;i<len;i++){
    if(str[i]==arr[top-i]){
        flag=1;

    }
    else{
        flag=0;break;
    }
}

if(flag==1){printf("palindrome");

}}

    
int main(){
    char str[100];
    scanf("%s",&str);
    int len=strlen(str);
    int arr[len];
    for(i=0;i<len;i++){char ele;
    ele=str[i];
        push(ele);
        
    }
    
    display(len,str);

    return 0;
}