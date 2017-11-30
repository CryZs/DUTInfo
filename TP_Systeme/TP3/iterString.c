#include <stdlib.h>
#include "iterString.h"
/**
 *
 * iterString is a very simple library that provides simple iterators
 * on strings. 
 *
 * @author C. Morvan
 * @version 0.2, 24/09/2015
 * @see iterString.h for documentation
 */

iter_string new_iterator(char * my_buff){
  iter_string res;
  res.buff=my_buff;
  res.buff_pos=0;
  return res;
}

char * next(iter_string * iterator){
  int tmp,cpt=0;
  char * res;
  while (iterator->buff[iterator->buff_pos]==' '||iterator->buff[iterator->buff_pos]=='\t')iterator->buff_pos++;
  tmp=iterator->buff_pos;
  while (iterator->buff[iterator->buff_pos]!=' '&&iterator->buff[iterator->buff_pos]!='\t'&&iterator->buff[iterator->buff_pos]!='\0'){
    iterator->buff_pos++;
  }
  if (iterator->buff_pos-tmp>0){
    res=(char*)malloc(((iterator->buff_pos-tmp)+1)* sizeof(char));
  }
  else return NULL;
  while (tmp<iterator->buff_pos){
    res[cpt++]=iterator->buff[tmp++];
  }
  res[cpt]='\0';
  return res;
}
