package cs271.lab.symbolmatching;

/**
 * Exception thrown when symbols are mismatched.
 *
 * @author mbone
 */
public class SymbolMismatchException extends RuntimeException{
	public SymbolMismatchException(String message){
		super(message);
	}

}
