/*
 * Copyright (C) 2022 DevMentor.IO. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

package io.devmentor.examples.object;

import io.devmentor.examples.object.model.Book;
import io.devmentor.examples.object.model.Student;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashCollectionBehaviorTest {

  private Book firstBook;
  private Book secondBook;
  private Student firstStudent;
  private Student secondStudent;

  @BeforeEach
  void setup() {
    firstBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    secondBook = new Book("Data Smart", "Foreman, John", "data_science", 235, "Wiley");
    firstStudent = new Student("Alex", "Sokorskyi", "M");
    secondStudent = new Student("Nina", "Valevina", "F");
  }

  @Test
  void testHashMapAdd() {
    Map<Book, String> books = new HashMap<>();

    books.put(firstBook, firstBook.toString());
    books.put(secondBook, secondBook.toString());

    Assertions.assertEquals(1, books.size());
  }

  @Test
  void testHashSet() {
    Set<Book> books = new HashSet<>();

    books.add(firstBook);
    books.add(secondBook);

    Assertions.assertEquals(1, books.size());
  }

  @Test
  void testHashMapAdd_whenNotOverridden() {
    Map<Student, String> books = new HashMap<>();

    books.put(firstStudent, firstStudent.toString());
    books.put(secondStudent, secondStudent.toString());

    Assertions.assertEquals(2, books.size());
  }

  @Test
  void testHashSet_whenNotOverridden() {
    Set<Student> books = new HashSet<>();

    books.add(firstStudent);
    books.add(secondStudent);

    Assertions.assertEquals(2, books.size());
  }
}
