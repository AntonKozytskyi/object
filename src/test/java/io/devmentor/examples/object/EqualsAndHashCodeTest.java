package io.devmentor.examples.object;

import io.devmentor.examples.object.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class EqualsAndHashCodeTest {

  private Book firstBook;
  private Book secondBook;
  private Book thirdBook;

  @BeforeEach
  void setup() {
    firstBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    secondBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    thirdBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
  }

  @Test
  void testReflexive() {
    Assertions.assertTrue(firstBook.equals(firstBook));
  }

  @Test
  void testSymmetric() {
    Assertions.assertTrue(firstBook.equals(secondBook));
    Assertions.assertTrue(secondBook.equals(firstBook));
  }

  @Test
  void testTransitive() {
    Assertions.assertTrue(firstBook.equals(secondBook));
    Assertions.assertTrue(secondBook.equals(thirdBook));
    Assertions.assertTrue(thirdBook.equals(firstBook));
  }

  @Test
  void testNullComparison() {
    Assertions.assertFalse(firstBook.equals(null));
  }

  @Nested
  class ConsistentTest {
    @Test
    void testConsistent() {
      for (int i = 0; i < 10; i++) {
        Assertions.assertTrue(firstBook.equals(secondBook));
      }
    }

    @Test
    void testConsistent_Title() {
      secondBook.setTitle(secondBook.getTitle() + "any string");
      Assertions.assertFalse(firstBook.equals(secondBook));
    }

    @Test
    void testConsistent_Author() {
      secondBook.setAuthor(secondBook.getAuthor() + "any string");
      Assertions.assertFalse(firstBook.equals(secondBook));
    }

    @Test
    void testConsistent_Genre() {
      secondBook.setGenre(secondBook.getGenre() + "any string");
      Assertions.assertFalse(firstBook.equals(secondBook));
    }

    @Test
    void testConsistent_Height() {
      secondBook.setHeight(secondBook.getHeight() + 12);
      Assertions.assertFalse(firstBook.equals(secondBook));
    }

    @Test
    void testConsistent_Publisher() {
      secondBook.setPublisher(secondBook.getPublisher() + "any string");
      Assertions.assertFalse(firstBook.equals(secondBook));
    }
  }
}
