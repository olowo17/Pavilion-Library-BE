package com.pavilion.library.service;


import com.pavilion.library.util.BookMapper;
import com.pavilion.library.dto.BookPageResponse;
import com.pavilion.library.dto.BookRequestDto;
import com.pavilion.library.dto.BookResponseDto;
import com.pavilion.library.exception.BookNotFoundException;
import com.pavilion.library.model.Book;
import com.pavilion.library.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repo;

    public BookResponseDto getBookById(Long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
        return BookMapper.toDto(book);
    }

    public BookResponseDto createBook(BookRequestDto dto) {
        Book book = BookMapper.toEntity(dto);
        Book saved = repo.save(book);
        return BookMapper.toDto(saved);
    }

    public BookResponseDto updateBook(Long id, BookRequestDto dto) {
        Book existing = repo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));

        existing.setTitle(dto.title());
        existing.setAuthor(dto.author());
        existing.setIsbn(dto.isbn());
        existing.setPublishedDate(dto.publishedDate());

        Book updated = repo.save(existing);
        return BookMapper.toDto(updated);
    }

    public void deleteBook(Long id) {
        Book existing = repo.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
        repo.delete(existing);
    }

    public BookPageResponse getAllBooks(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Book> result = repo.findAll(pageable);

        List<BookResponseDto> books = result.getContent()
                .stream()
                .map(BookMapper::toDto)
                .toList();

        return new BookPageResponse(
                books,
                result.getNumber(),
                result.getTotalPages(),
                result.getTotalElements()
        );
    }
}
