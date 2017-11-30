#include <stdio.h>
int main (int argc, char * argv){
    printf("Démarrage\n");
    int pid = fork();
    if (pid == 0){
        int i;
        for (i=0;i<10;i++){
            printf("Je suis le fils\n");
        }
    }
    else{
        printf("Je suis le père\n");
    }
    return 1;
}