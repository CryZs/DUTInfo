import java.io.File;
import java.io.IOException;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * The aim is to perform a traversal of some part of the file trees,
 * following two possible traversal schemes.
 *
 * Each call to next returns a java.io.file which is a
 * folder/directory (and thus possesses a lit of files.
 * 
 * Note 1: we implement Iterator<File> but we do not implement the
 * remove method.
 * 
 * Note 2: hidden files and folders are ignored by our iterator.
 * 
 * Date: 7th Oct. 2015
 * @author Christophe Morvan
 */
public abstract class TreeCrawler implements Iterator<File>{

	/**
	 * Both a Queue and a Stack
	 * (Deque)
	 */
	protected Deque<File> toDo;

        /**
	 * root is not really useful (but might have some use in some
	 * further developpement).
	 *current is really useful.
         */
	protected File root, current;

        /**
	 * Initializing fields. Throws an exception whenever the folder does not exist.
	 * toDo list is initialized with root folder.
	 *
	 */
	public TreeCrawler(File directory) throws IOException{
		Deque<File> toDo = new Deque<File>(directory);
	}

        /**
	 * Second constructor. Initialize from a String.
	 *
         */
	public TreeCrawler(String directory) throws IOException{
		this(new File(directory));
	}

        /**
	 * Iterator<File> method.
	 *
	 * Returns true when there are other folders to visit.
	 *
         */
       @Override
	public boolean hasNext() {
		return toDo.isEmpty();
    }
	
        /**
	 * Iterator<File> method.
	 * 
	 * **Not implemented**
	 * 
         */
	@Override
	public void remove() {
	}


        /**
	 * Iterator<File> method.
	 *
	 * Returns the next File in the traversal. null reference
	 * whenever there is no such File.
         */
       @Override
	public File next(){
		File file = myGet();
		List<File> list = subReps();
		for (File dir:list){
			this.myAdd(file);
		}
		return current;
	}

       //  Implemented in inherited classes. **Used by next**.
       protected abstract void myAdd(File file);
	
       //  Implemented in inherited classes. **Used by next**.
	protected abstract File myGet();


        /**
	 * Auxiliary function for next: returns a List of *non-hidden*
	 * Files in current folder.
         */    
	private List<File> subReps(){
	    File[] file = current.listFiles();
	    List<File> list = new LinkedList<File>();
	    for(File a:file){
	    	list.add(a);
	    }
	    return list;
	}

	/**
	 * Used for tests. You may... and _should_ use this function
	 * to test the functions of this abstract class.
	 * 
	 * Observe that since it is an abstract class you may not
	 * create objects of class TreeCrawler. You need first to
	 * create a class BreadthFirst, *then* you may create object
	 * of this class, and test the code in TreeCrawler.
	 * @param args
	 */
	public static void main(String[] args) throws IOException {


	}

}
