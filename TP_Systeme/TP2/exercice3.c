#include <stdio.h>
int main(int argc, char * argv[]){
    int i=1;
    while (i<=10){
        if (!fork()){
            printf("Je suis le fils %d\n",i);
            exit(0);
        }
        i++
    }
}