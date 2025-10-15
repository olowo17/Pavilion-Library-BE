package com.pavilion.library.controller;


import com.pavilion.library.dto.BookPageResponse;
import com.pavilion.library.dto.BookRequestDto;
import com.pavilion.library.dto.BookResponseDto;
import com.pavilion.library.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping
    public BookPageResponse getAllBooks(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return service.getAllBooks(page, size); // assuming this already returns DTOs
    }

    @PostMapping
    public ResponseEntity<BookResponseDto> createBook(@RequestBody BookRequestDto dto) {
        log.info("Incoming book request: {}", dto);
        BookResponseDto saved = service.createBook(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBook(@PathVariable Long id) {
        BookResponseDto book = service.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookResponseDto> updateBook(
            @PathVariable Long id, @RequestBody BookRequestDto dto) {
        BookResponseDto updated = service.updateBook(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

}
