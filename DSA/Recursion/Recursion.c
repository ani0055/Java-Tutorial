#include<stdio.h>

int sum(int i){
    if(i==1) return i;

    return i+sum(i-1);
}

int main(){
int i = 5;
printf("%d",sum(i));
}