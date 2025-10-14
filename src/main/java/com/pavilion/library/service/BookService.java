package com.pavilion.library.service;


import com.pavilion.library.BookPageResponse;
import com.pavilion.library.model.Book;
import com.pavilion.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repo;

    public BookPageResponse getAllBooks(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Book> result = repo.findAll(pageable);

        return new BookPageResponse(
                result.getContent(),
                result.getNumber(),
                result.getTotalPages(),
                result.getTotalElements()
        );
    }

    public Optional<Book> getBookById(Long id) {
        return repo.findById(id);
    }

    public Book createBook(Book book) {
        return repo.save(book);
    }

    public Optional<Book> updateBook(Long id, Book updatedBook) {
        return repo.findById(id).map(existing -> {
            existing.setTitle(updatedBook.getTitle());
            existing.setAuthor(updatedBook.getAuthor());
            existing.setIsbn(updatedBook.getIsbn());
            existing.setPublishedDate(updatedBook.getPublishedDate());
            return repo.save(existing);
        });
    }

    public boolean deleteBook(Long id) {
        if (!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }
}
