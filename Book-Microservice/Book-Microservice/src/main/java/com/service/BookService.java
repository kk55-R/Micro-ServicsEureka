package com.service;

import com.entity.BookEntity;

import java.util.List;

public interface BookService {
    List<BookEntity> findAll();

    void saveMyBook(BookEntity book);
}
