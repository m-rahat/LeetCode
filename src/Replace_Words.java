import java.util.*;

public class Replace_Words {

    public static String replaceWords(List<String> dictionary, String sentence) {
        
    	String returnString = "";
    	List<String> words = new ArrayList<>();
    	String w = "";
    	for (int i = 0; i < sentence.length(); i++) {
    		if (sentence.charAt(i) == ' ') {
    			words.add(w);
    			w = "";
    		}//if
    		else {
    			w = w + sentence.charAt(i);
    		}//else
    		
    	}//for
    	words.add(w);
    	
    	boolean changed = false;
    	Iterator it = words.iterator();
    	for (int i = 0; i < words.size(); i++) {
    		w = words.get(i);
    		for (int j = 0; j < dictionary.size(); j++) {
    			String dictWord = dictionary.get(j);
    			if (w.contains(dictWord)) {
    				returnString = returnString + dictWord;
    				changed = true;
    				continue;
    			}//if
    		}//for
    		if (changed) {
    			returnString = returnString + " ";
    			changed = false;
    			continue;
    		}
    		returnString = returnString + w + " ";
    	}//for
    	
    	System.out.println(returnString);
    	System.out.println(words);
    	returnString = returnString.substring(0, returnString.length() - 1);
    	return returnString;
    }//replaceWords
	
	public static void main(String [] args) {
		
		List<String> dictionary = new ArrayList<String>();
		dictionary.add("cat");
		dictionary.add("bat");
		dictionary.add("rat");
		
		replaceWords(dictionary, "the cattle was rattled by the battery");
		
	}//main
	
}//Replace_Words
