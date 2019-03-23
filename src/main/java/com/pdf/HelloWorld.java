package com.pdf;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

import com.extractor.impl.ResumeExtractorImpl;

public class HelloWorld {
	public static void main(String[] args) throws InvalidPasswordException, IOException {
		ResumeExtractorImpl resume = new ResumeExtractorImpl();
		resume.getEmail();
		resume.getNumber();
	
	}
}
