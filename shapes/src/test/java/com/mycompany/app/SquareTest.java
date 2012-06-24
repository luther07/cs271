package com.mycompany.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import junit.framework.TestCase;

// Test for equality or for object reference?
// mvn -e test for error details

public class SquareTest extends TestCase {
  public void testEquals() {
    SquareImpl theSquare = new SquareImpl(2.0);
    SquareImpl mySquare = new SquareImpl(2.0);
    assertThat (theSquare, is(equalTo(mySquare)));
  }

  public void testSameInstance() {
    SquareImpl theSquare = new SquareImpl(2.0);
    SquareImpl refSquare = theSquare;
    assertThat (theSquare, sameInstance(refSquare));
  }

}
