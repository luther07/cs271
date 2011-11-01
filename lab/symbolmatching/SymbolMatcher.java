package cs271.lab.symbolmatching;

import java.util.*;

/**
 * Used to check strings for proper symbol matching i.e. [()] is valid,
 * [(]) is not.
 */
public class SymbolMatcher {
	
	List<Character> openCharacters = new ArrayList<Character>();
	List<Character> closeCharacters = new ArrayList<Character>();
	
	
	
    public SymbolMatcher() {
    	openCharacters.add('('); closeCharacters.add(')');
    	openCharacters.add('['); closeCharacters.add(']');
    	openCharacters.add('{'); closeCharacters.add('}');

    }
    
    /**
     * Checks the specified string to make sure that all symbols match 
     * appropriately.  Returns if the string is ok, otherwise throws a 
     * SymbolMismatchException.
     */
    public void checkString(String input) {
    	Stack <Character> stack = new Stack<Character>();
    	
    	for(char character: input.toCharArray()){
    		if(isOpenCharacter(character)){
    			stack.push(character);
    		
    		}
    		else if(isCloseCharacter(character)){
    			if(stack.isEmpty()){
    				throw new SymbolMismatchException("Mismatch at character: " + character + "close character without matching open");
    			}
    			char open = getOpenCharacter(character);
    			char top = stack.peek();
    			
    			if(top != open){
    				throw new SymbolMismatchException("Mismatch at character: " + character + "open character without matching close");
    			}else {
    				stack.pop();
    			
    			
    		}
    		}
    		
    		
    	if(!stack.isEmpty())
    		throw new SymbolMismatchException("Unmatched open mismatch");
    		
    }
}
    private boolean isOpenCharacter(char i){
    	return openCharacters.contains(i);
    	
    }
    
    private boolean isCloseCharacter(char i){
    	return closeCharacters.contains(i);
    }
    
    
    
    private char getOpenCharacter(char close){
    	return openCharacters.get(closeCharacters.indexOf(close));
    }
    private char getCloseCharacter(char open){
    	return closeCharacters.get(openCharacters.indexOf(open));
    }



public static void main(String[] args) {
	SymbolMatcher m = new SymbolMatcher();
	m.checkString("([)]");
	
	
}
}