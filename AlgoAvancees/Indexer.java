import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 
 * The aim of this class is to traversal a whole file system sub-tree,
 * and to index the files in it. 
 *
 * It also enables to find particular files using the index (and not
 * performing further traversals).
 * 
 * Date: 7th Oct. 2015
 * @author Christophe Morvan
 */
public class Indexer {

	Map<String, List<File>> index;
        // Once again we could avoid using root.
	File root;
	
	/**
	 * Constructor from a File
	 * 
	 * @param directory
	 * @throws IOException
	 */
	public Indexer(File directory) throws IOException{
	    this.root = directory;
	}
	
	/**
	 * Constructor from a String
	 * 
	 * @param directory
	 * @throws IOException
	 */
	public Indexer (String directory) throws IOException{
	    this(new File(directory));
	}
	
	/**
	 * Auxiliary function which performs a traversal of root
	 * folder and construct an index.
	 *
	 * It is used by the constructor.
	 * 
	 * @throws IOException
	 */
	private void indexation() throws IOException{
	    
	}
	
	/**
	 * Add, in this.index, the folder dir to the list associated
	 * to the File file.
	 *
	 * We use the simple name of the file, hence without the path.
	 * This function is used by *indexation*.
	 * 
	 * @param dir  current folder
	 * @param file  a file in dir
	 */
	private void add (File dir, File file){
	    
	}
	
	/**
	 * Finds Files whose name matches exactly name.
	 * @param name 
	 * @return  The List of Files whose name is name
	 */
	public List<File> lookUp(String name){
	    
	}

	/**
	 * Finds Files whose name _contains_ the String *name* or
	 * matches the regular expression *name*.
	 * 
	 * Whenever *pat* is true, then *name* is a regular expression.
	 *
	 * @param name  String or regular expression
	 * @param pat      true whenever name is a regular expression
	 * @return             List of Files matching name
	 */
	public List<File> extLookUp(String name, boolean pat){
	    
	}

	/**
	 * Modifies the List *res* if *locName* matches regular
	 * expression *pat*.
	 *
	 * Used by *extLookUp*.
	 * 
	 * @param res           List to modify
	 * @param pat           Pattern that locName should match
	 * @param locName  Name of the current file
	 */
	private void regCheck (List<File> res, Pattern pat, String locName){
	    
	}
	
	/**
	 * Modifies the List *res* if *locName* contains *name*.
	 *
	 * Used by *extLookUp*.
	 * 
	 * @param res           List to modify
	 * @param name       String to find in *locname*
	 * @param locName  Name of the current file
	 */
	private void contains (List<File> res, String name, String locName){

	}
	
	/**
	 * Displays the matches on a lookup.  If *pat* is true, then
	 * *name* is interpreted as a regular expression pattern,
	 * otherwise it is an ordinary String.
	 *
	 * This methode uses *extLookUp*.
	 * 
	 * @param name
	 * @param pat
	 */
	public void displayMatch(String name, boolean pat){
	    
	}
    
	/**
	 * You may and _should_ use this function to test the methods
	 * of class Indexer.
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
	    
	}

}
