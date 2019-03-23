package com.extractor.impl;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

import com.extractor.ResumeExtractor;

public class ResumeExtractorImpl implements ResumeExtractor{

	@Override
	public String getEmail() throws InvalidPasswordException, IOException {
		DataStoreImpl dataStore = new DataStoreImpl();
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String line : dataStore.getData()) {
			Matcher matcher = pattern.matcher(line);
			if(matcher.matches())
			    System.out.println(line +" : "+ matcher.matches());
		}
		
	
	
		
		return null;
	}

	@Override
	public String getNumber() throws InvalidPasswordException, IOException {
		
		DataStoreImpl dataStore = new DataStoreImpl();
		String regex = "^[6-9]\\d{9}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 System.out.println("inside");
		for(String line : dataStore.getData()) {
			Matcher matcher = pattern.matcher(line);
			if(matcher.matches())
			    System.out.println(line +" : "+ matcher.matches());
			
			System.out.println(line);
		}
		System.out.println("outside");
	
	
		
		
		
		return null;
	}

}
