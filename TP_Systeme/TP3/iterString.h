/**
 *
 * A very simple library that provides simple iterators on strings. It
 * uses blank space and tabulations as separators.
 *
 * @author C. Morvan
 * @version 0.2, 24/09/2015
 *
 */

/**
 * Iterator type which should only be manipulated by this library's
 * functions.
 */
typedef struct _iter_string{
  char * buff;
  int buff_pos;
}iter_string;

/**
 * Creates an iterator on string my_buff. It does not duplicate
 * my_buff, hence any modification on my_buff will affect the
 * iterator. However, the iterator itself does not modify the content
 * of my_buff.
 *
 * @param my_buff   the string on which the iterator is built
 * @return                  the iterator
 */
iter_string new_iterator(char * my_buff);

/**
 * Builds the next string segment from the buffer. This pointer is
 * allocated by a call to malloc. Once the '\0' character is reached,
 * it returns NULL, and does not move anymore.
 *
 * @param iterator    an iterator pointer
 * @return                  the next string segment (NULL on '\0')
 */
char * next(iter_string * iterator);
