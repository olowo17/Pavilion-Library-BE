package com.pavilion.library;


import com.pavilion.library.model.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookPageResponse {
    private List<Book> books;
    private int pageNumber;
    private int totalPages;
    private long totalElements;

    public BookPageResponse(List<Book> books, int pageNumber, int totalPages, long totalElements) {
        this.books = books;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}
