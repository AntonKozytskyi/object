package io.devmentor.examples.object.model;

import java.util.Objects;

public class Book {

  private String title;
  private String author;
  private String genre;
  private int height;
  private String publisher;

  public Book() {
  }

  public Book(String title, String author, String genre, int height, String publisher) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.height = height;
    this.publisher = publisher;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book)) {
      return false;
    }
    Book book = (Book) o;
    return getHeight() == book.getHeight() && getTitle().equals(book.getTitle())
        && getAuthor().equals(book.getAuthor()) && getGenre().equals(book.getGenre())
        && getPublisher().equals(book.getPublisher());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTitle(), getAuthor(), getGenre(), getHeight(), getPublisher());
  }
}
