package cs271.lab.symbolmatching;

public class SymbolMatcherTest extends junit.framework.TestCase {
    
    public static final String OK_1 = "[[({}[]())]]";
    public static final String OK_2 = "[(hello world)[(()[])]]";
    public static final String OK_3 = "hi()([t]h{e}r[]e)";
    public static final String OK_4 = "(){hi there [chief]}({[]})";
    
    public static final String FAIL_1 = "{([(({}))]{(([[]))})}";
    public static final String FAIL_2 = "{(([[[]]])){}}[";    
    public static final String FAIL_3 = "()()[]{}(()))";
    public static final String FAIL_4 = "}";
    
    SymbolMatcher matcher = new SymbolMatcher();

    public void testSymbols() {
       matcher.checkString(OK_1);
       matcher.checkString(OK_2);
       matcher.checkString(OK_3);
       
       try {
           matcher.checkString(FAIL_1);
           fail("Fail String 1 passed");
       } catch(SymbolMismatchException e) {}
       
       try {
           matcher.checkString(FAIL_2);
           fail("Fail String 2 passed");
       } catch(SymbolMismatchException e) {}
       
       try {
           matcher.checkString(FAIL_3);
           fail("Fail String 3 passed");
       } catch(SymbolMismatchException e) {}
    
    }
    
    public void testSymbolsWithBrackets() {
       matcher.checkString(OK_4);
       
       try {
           matcher.checkString(FAIL_4);
           fail("Fail String 3 passed");
       } catch(SymbolMismatchException e) {}
    }
}
