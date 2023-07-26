package com.example.beket.kz.repoInterface;

import com.example.beket.kz.model.DocumentType;

import java.util.List;

public interface DocumentTypeInterface {
	DocumentType getDocumentTypeById(Long id);

	List<DocumentType> getAllDocumentTypes();

}
