package com.Repository;

import com.entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<LibraryEntity,Integer> {
}
