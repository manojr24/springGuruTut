package com.springtut.demo.repositories;

import com.springtut.demo.model.Books;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;


public interface BookRepository extends CrudRepository<Books, Long> {
}
