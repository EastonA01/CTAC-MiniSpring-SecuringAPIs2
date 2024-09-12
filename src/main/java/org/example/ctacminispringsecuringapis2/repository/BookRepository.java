package org.example.ctacminispringsecuringapis2.repository;

import org.example.ctacminispringsecuringapis2.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
    public Optional<Book> findById(String id);
}
