package com.extractor;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public interface DataStore {
	public List<String> getData() throws InvalidPasswordException, IOException;
}
