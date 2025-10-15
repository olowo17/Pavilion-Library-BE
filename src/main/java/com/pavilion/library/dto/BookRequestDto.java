package com.pavilion.library.dto;

import java.time.LocalDate;

public record BookRequestDto(String title, String author, String isbn, LocalDate publishedDate) {}
