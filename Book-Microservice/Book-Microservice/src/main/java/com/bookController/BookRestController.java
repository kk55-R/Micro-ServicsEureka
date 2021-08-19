package com.bookController;

import com.entity.BookEntity;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<BookEntity> getAll(){
        List<BookEntity> bookEntities=bookService.findAll();
        return bookEntities;
    }


    @PostMapping("/books")
    public void saveBook(@RequestBody BookEntity book){
        bookService.saveMyBook(book);
    }


}
