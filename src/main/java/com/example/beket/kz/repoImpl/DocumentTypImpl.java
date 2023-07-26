package com.example.beket.kz.repoImpl;

import com.example.beket.kz.model.DocumentType;
import com.example.beket.kz.repoInterface.DocumentTypeInterface;
import com.example.beket.kz.repository.DocumentTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentTypImpl implements DocumentTypeInterface {

	private final DocumentTypeRepository documentTypeRepository;
	@Override
	public DocumentType getDocumentTypeById(Long id) {
		return documentTypeRepository.findAllById(id);
	}

	@Override
	public List<DocumentType> getAllDocumentTypes() {
		return documentTypeRepository.findAll();
	}
}
