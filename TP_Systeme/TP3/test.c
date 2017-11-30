#include <stdlib.h>
#include <stdio.h>
#include <readline/readline.h>
#include <readline/history.h>
#include "iterString.h"

/**
 * In order to use this file you first need to compile "iterString":
 * gcc -c iterString.c
 *
 * Then, in order to compile test.c, with readline library you need to
 * type: gcc -o test test.c iterString.o -lreadline
 *
 * If necessary, in debian/ubuntu you need to install libreadline-dev.
 * (On University computers, it is already done)
 *
 * @author C. Morvan
 * @version 0.2, 24/09/2015
 *
 */
//Variables
char * hist;
//Fonctions
// void historique(){
//   int x = where_history();
// 	int i = 0;
// 	while(i<=x){
// 		HIST_ENTRY* test = history_get(i+1);
// 		printf("Commande %d : %s\n",i+1,test->line);
// 		i++;
// 	}
// }

int main (int argc, char * argv[]){

  char * line;
  char * word;
  iter_string iter;
  rl_bind_key ('\t', rl_insert); // To disable readline original
				 // completion (based on the current
				 // directory)
  while ((line=readline(">:"))!=NULL){
    iter=new_iterator(line);
    while ((word=next(&iter))!=NULL){
      if (strcmp(word,"ls")==0){
        printf("Bonjour\n");
      }
      if (strcmp(word,"m")==0){
        printf("Bonjour2\n");
      }
      if (strcmp(word,"cd")==0){
        printf("Bonjour3\n");
      }
      if (strcmp(word,"historique")==0){
        historique();
      }
    }
      free(word); // since "next" uses malloc.
  }
  if (line && *line){ // no empty line in history
    add_history(line);
    printf("AA=%s\n",line);
  }
  free(line);
  rl_ding(); // There are other functions in readline library
  
  return 0;
}
