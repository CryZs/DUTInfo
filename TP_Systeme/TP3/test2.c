#include <stdlib.h>
#include <stdio.h>
#include <readline/readline.h>
#include <readline/history.h>
#include <string.h>
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
 * @author C. Morvan, SIMON-FINE Thibaut, PHET Romain
 * @version 0.3, 07/10/2015
 *
 */

// Variables globales
const int nb_command=4;
static char *command[] =	{
							"histo",
							"exit",
							"auteur",
							"pwd"
							};
int flag_exit=0,flag_histo=0,flag_help=0,flag_auteur=0,flag_pwd=0;

// Fonctions
int isCommand(char * word){
	int i;
	for(i=0;i<nb_command;i++){
		if(strcmp(word,command[i])==0){
			if(strcmp(command[i],"histo")==0) flag_histo=1;
			if(strcmp(command[i],"exit")==0) flag_exit=1;
			if(strcmp(command[i],"auteur")==0) flag_auteur=1;
			if(strcmp(command[i],"pwd")==0) flag_pwd=1;
			return 1;
		}
	}
	return 0;
}

void histo(){
	int x = where_history();
	int i = 0;
	while(i<=x){
		HIST_ENTRY* test = history_get(i+1);
		printf("Commande %d : %s\n",i+1,test->line);
		i++;
	}
}

void pwd(){

}

// Main
int main (int argc, char * argv[]){

  char * line;
  char * word;
  iter_string iter;

  rl_bind_key ('\t', rl_insert); // To disable readline original
				 // completion (based on the current
				 // directory)
  while ((line=readline("Prompt->"))!=NULL){
    iter=new_iterator(line);
    while ((word =next(&iter))!=NULL){
      //printf("->%s<-\n",word);
      if(isCommand(word)==0){
      	printf("Unknown command\n");
      	break;
      }
      free(word); // since "next" uses malloc.
    }
    if (line && *line) // no empty line in history
      add_history(line);
    if(flag_exit){
    	exit(1);
    }
    if(flag_histo){
    	histo();
    	flag_histo = 0;
    }
     if(flag_auteur){
    	printf("SHELL v1.0 by tristan\n");
    	flag_auteur = 0;
    }
    if(flag_pwd){
    	// /bin/pwd
    	// whereis -b ping > test
    	flag_pwd=0;
    }
    free(line);
    rl_ding(); // There are other functions in readline library
  }
}