package com.example.beket.kz.repository;

import com.example.beket.kz.model.DocumentType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DocumentTypeRepository extends JpaRepository<DocumentType, Long> {
	DocumentType findAllById(Long id);
}
