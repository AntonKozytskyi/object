package io.devmentor.examples.object;

import io.devmentor.examples.object.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ObjectEqualsTest {

  private Book firstBook;
  private Book secondBook;
  private Book thirdBook;

  @BeforeEach
  void setup() {
    firstBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    secondBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    thirdBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
  }

  /** It is reflexive: for any non-null reference value x, x.equals(x) should return true. */
  @Test
  void testReflexive() {
    Assertions.assertEquals(firstBook, firstBook);
  }

  /**
   * It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if
   * and only if y.equals(x) returns true.
   */
  @Test
  void testSymmetric() {
    Assertions.assertEquals(firstBook, secondBook);
    Assertions.assertEquals(secondBook, firstBook);
  }

  /**
   * It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true
   * and y.equals(z) returns true, then x.equals(z) should return true.
   */
  @Test
  void testTransitive() {
    Assertions.assertEquals(firstBook, secondBook);
    Assertions.assertEquals(secondBook, thirdBook);
    Assertions.assertEquals(thirdBook, firstBook);
  }

  /** For any non-null reference value x, x.equals(null) should return false. */
  @Test
  void testNullComparison() {
    Assertions.assertNotEquals(null, firstBook);
  }

  /**
   * It is consistent: for any non-null reference values x and y, multiple invocations of
   * x.equals(y) consistently return true or consistently return false, provided no information used
   * in equals comparisons on the objects is modified.
   */
  @Nested
  class ConsistentTest {
    @Test
    void testConsistent() {
      for (int i = 0; i < 10; i++) {
        Assertions.assertEquals(firstBook, secondBook);
      }
    }

    @Test
    void testConsistent_Title() {
      secondBook.setTitle(secondBook.getTitle() + "any string");
      Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void testConsistent_Author() {
      secondBook.setAuthor(secondBook.getAuthor() + "any string");
      Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void testConsistent_Genre() {
      secondBook.setGenre(secondBook.getGenre() + "any string");
      Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void testConsistent_Height() {
      secondBook.setHeight(secondBook.getHeight() + 12);
      Assertions.assertNotEquals(firstBook, secondBook);
    }

    @Test
    void testConsistent_Publisher() {
      secondBook.setPublisher(secondBook.getPublisher() + "any string");
      Assertions.assertNotEquals(firstBook, secondBook);
    }
  }
}
