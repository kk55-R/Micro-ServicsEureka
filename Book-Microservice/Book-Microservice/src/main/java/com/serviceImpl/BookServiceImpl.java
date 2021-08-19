package com.serviceImpl;

import com.Repository.BookRepo;
import com.entity.BookEntity;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo bookRepo;

    @Override
    public List<BookEntity> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public void saveMyBook(BookEntity book) {
        book.setLausnch(new Timestamp(new Date().getTime()));
        bookRepo.save(book);
    }
}
