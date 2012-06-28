package com.mycompany.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import junit.framework.TestCase;

// Test for equality or for object reference?
// mvn -e test for error details

public class CustomerTest extends TestCase {
  public void testEquals() {
    Customer theCustomer = new Customer(1, 1);
    Customer myCustomer = new Customer(1, 1);
    assertThat (theCustomer, is(equalTo(myCustomer)));
  }

  public void testSameInstance() {
    Customer theCustomer = new Customer(1, 1);
    Customer refCustomer = theCustomer;
    assertThat (theCustomer, sameInstance(refCustomer));
  }

}
