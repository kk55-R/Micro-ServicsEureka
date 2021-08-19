package com.service;

import com.entity.LibraryEntity;

import java.util.List;

public interface LibraryService {
    void saveAll(LibraryEntity libraryEntity);

    List<LibraryEntity> findAll();
}
