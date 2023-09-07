#include<stdio.h>
#include<stdlib.h>
int top=-1;int n=100;
int arr[100];
void push();
void pop();
void display();
void push(){
    int x;
    if(top==n-1){
        printf("overflow");
    }
    else{
        scanf("%d",&x);
        top=top+1;
        arr[top]=x;
    }
}

void pop(){
    if(top==-1){
        printf("underflow");
    }
    else{
        printf("%d",arr[top]);
        top--;
    }
}

void display(){
    if(top==-1){
        printf("no elements");
    }
    else{
        int i;
        for(i=top;i>=0;i--){
            printf("%d",arr[i]);
        }
    }
}

int main(){
    int choice;
    while(1){
        scanf("%d",&choice);
        switch(choice){
            case 1:
            push();
            break;
            case 2:
            pop();
            break;
            case 3:
            display();
            case 4:
            exit(0);
            
            default:
            printf("invalid");
        }

    }
    return 0;
}