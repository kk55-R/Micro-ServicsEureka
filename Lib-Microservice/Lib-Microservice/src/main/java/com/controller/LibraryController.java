package com.controller;

import com.entity.LibraryEntity;
import com.feignEntity.Book;
import com.feignInterface.libClient;
import com.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lib")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @Autowired
    private libClient libclient;


    @GetMapping
    public List<LibraryEntity>getAll(){
        List<LibraryEntity>libraryEntities=libraryService.findAll();
        return libraryEntities;
    }
    @PostMapping("/libs")
    public void savelib(@RequestBody LibraryEntity libraryEntity){
        libraryService.saveAll(libraryEntity);
    }

    @GetMapping("/book/all")
     List<Book> bookdatas(){
        return libclient.getAllBooks();
    }


}
