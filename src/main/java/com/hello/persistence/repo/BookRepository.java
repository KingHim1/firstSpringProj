package com.hello.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import com.hello.persistence.model.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}