package com.serviceimpl;

import com.Repository.LibraryRepo;
import com.entity.LibraryEntity;
import com.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    private LibraryRepo libraryRepo;

    @Override
    public void saveAll(LibraryEntity libraryEntity) {
        libraryRepo.save(libraryEntity);
    }

    @Override
    public List<LibraryEntity> findAll() {
        return libraryRepo.findAll();
    }
}
