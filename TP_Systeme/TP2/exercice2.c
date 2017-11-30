#include <stdio.h>
int main(int argc, char * argv){
    printf("Démarrage\n");
    switch(fork()){
        case 0:
            for (i=0;i<10;i++){
                printf("Je suis le fils\n");
            }
        default: printf("Je suis le père\n");
    }
}