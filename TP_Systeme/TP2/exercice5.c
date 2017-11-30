#include <stdio.h>
int main(int argc, char * argv[]){
    int i;
    while (1){
        for (i=1;i<=100;i++){
            if(!fork()){
                printf("Processus fils n°%d : PID = %d, pPID = %d\n",i ,getpid(),getppid());
                exit(0);
            }
        }
    }
    return 0;
}