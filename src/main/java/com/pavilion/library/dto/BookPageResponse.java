package com.pavilion.library.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookPageResponse {
    private List<BookResponseDto> books;
    private int pageNumber;
    private int totalPages;
    private long totalElements;

    public BookPageResponse(List<BookResponseDto> books, int pageNumber, int totalPages, long totalElements) {
        this.books = books;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}
