package com.extractor;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public interface ResumeExtractor {
	public String getEmail() throws InvalidPasswordException, IOException;
	public String getNumber() throws InvalidPasswordException, IOException;
	
}
