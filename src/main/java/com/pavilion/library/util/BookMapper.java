package com.pavilion.library.util;

import com.pavilion.library.dto.BookRequestDto;
import com.pavilion.library.dto.BookResponseDto;
import com.pavilion.library.model.Book;

public class BookMapper {

    public static BookResponseDto toDto(Book book) {
        return new BookResponseDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getIsbn(),
                book.getPublishedDate()
        );
    }

    public static Book toEntity(BookRequestDto dto) {
        Book book = new Book();
        book.setTitle(dto.title());
        book.setAuthor(dto.author());
        book.setIsbn(dto.isbn());
        book.setPublishedDate(dto.publishedDate());
        return book;
    }


}
