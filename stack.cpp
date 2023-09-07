//LAST IN FIRST OUT LIFO
//INSERTION = PUSH 
//POP=NIKALNA
//PEEK= TOP ELEMENT KYA HAI 
#include<iostream>
using namespace std;
int top=-1;int stack[5];
void push(int val){
    if(top>5){
        cout<<"overflow";
    }
    else{
        top++;
        stack[top]=val;
    }
}
void pop(){
    if(top==-1){
        cout<<"underflow";
    }
    else{
        top--;
    }}
    void display(){int i;
        for(i=0;i<5;i++){
            cout<<stack[i]<<endl;
        }
    }
    int main(){
        int val;
        cin>>val;
        push(val);
        display();
        return 0;
    }
