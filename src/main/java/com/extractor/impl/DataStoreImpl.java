package com.extractor.impl;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

import com.extractor.DataStore;
import com.pdf.ReadPdf;

public class DataStoreImpl implements DataStore{

	@Override
	public List<String> getData() throws InvalidPasswordException, IOException {
		ReadPdf readPdf = new ReadPdf();
		return readPdf.getData();
	}
	
}
