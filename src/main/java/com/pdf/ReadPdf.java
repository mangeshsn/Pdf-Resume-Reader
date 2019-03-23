package com.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadPdf {

	public List<String> getData() throws InvalidPasswordException, IOException {
		ArrayList<String> pdfData = new ArrayList<>();
		try (PDDocument document = PDDocument.load(new File(
				"C:\\Users\\mangesh.narkhede\\Desktop\\misc\\Documents\\Jade\\ResumeFormat\\MangeshNarkhede_.pdf"))) {

			document.getClass();

			if (!document.isEncrypted()) {

				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);

				PDFTextStripper tStripper = new PDFTextStripper();

				String pdfFileInText = tStripper.getText(document);
				// System.out.println("Text:" + st);

				// split by whitespace
				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					pdfData.add(line);
				}

			}

		}
		return pdfData;
	}
}
