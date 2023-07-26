package com.example.beket.kz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "document_type")
public class DocumentType extends BaseModel{
	private String documentName;

}
