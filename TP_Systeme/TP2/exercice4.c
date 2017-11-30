/* Créer 5 processus fils, chacun devra afficher : son numéro de PID (getpid()), et celui de son père (getppid()). 
Entre chaque création, le père attendra 5 secondes (sleep())*/
#include <stdio.h>
int main(int argc, char * argv[]){
    int i=1;
    while (i<=5){
        if(i){
            sleep();
        }
        if(!fork()){
            printf("PID : %d, pPID : %d\n",getpid(),getppid());
            i=7;
        }
        i++;
    }
    i=0;
    while (i<5){
        wait pid(-1,NULL,0);
        i++;
    }
}