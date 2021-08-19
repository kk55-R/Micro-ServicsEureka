package com.feignInterface;

import com.entity.LibraryEntity;
import com.feignEntity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="lib-services")
public interface libClient {


    @GetMapping("/books")
    public List<Book> getAllBooks();
}
