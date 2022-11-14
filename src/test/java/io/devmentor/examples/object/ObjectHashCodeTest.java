/*
 * Copyright (C) 2022 DevMentor.IO. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package io.devmentor.examples.object;

import io.devmentor.examples.object.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObjectHashCodeTest {

  private Book firstBook;
  private Book secondBook;
  private Book differentBook;

  @BeforeEach
  void setup() {
    firstBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    secondBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    differentBook = new Book("Data Smart2", "Foreman, John2", "data_science2", 236, "Wiley2");
  }

  /**
   * Whenever it is invoked on the same object more than once during an execution of a Java
   * application, the hashCode method must consistently return the same integer, provided no
   * information used in equals comparisons on the object is modified. This integer need not remain
   * consistent from one execution of an application to another execution of the same application.
   */
  @Test
  void testContract_1() {
    int hashCode = firstBook.hashCode();

    for (int i = 0; i < 10; i++) {
      Assertions.assertEquals(hashCode, firstBook.hashCode());
    }
  }

  /**
   * If two objects are equal according to the equals(Object) method, then calling the hashCode
   * method on each of the two objects must produce the same integer result.
   */
  @Test
  void testContract_2() {
    Assertions.assertEquals(firstBook, secondBook);
    Assertions.assertEquals(firstBook.hashCode(), secondBook.hashCode());
  }

  /**
   * It is not required that if two objects are unequal according to the equals(java.lang.Object)
   * method, then calling the hashCode method on each of the two objects must produce distinct
   * integer results. However, the programmer should be aware that producing distinct integer
   * results for unequal objects may improve the performance of hash tables.
   */
  @Test
  void testContract_3() {
    Assertions.assertNotEquals(firstBook, differentBook);
    Assertions.assertTrue(
        firstBook.hashCode() == differentBook.hashCode()
            || firstBook.hashCode() != differentBook.hashCode());
  }
}
