package com.jovanspring.helloworld1;

import com.itextpdf.forms.xfdf.Encoding;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
import com.itextpdf.kernel.pdf.canvas.parser.listener.ITextExtractionStrategy;
import com.itextpdf.kernel.pdf.canvas.parser.listener.SimpleTextExtractionStrategy;
import com.sun.media.jfxmedia.track.Track;

import java.io.File;

//        PdfDocument pdfDoc = new PdfDocument(new PdfReader(SRC));
//
//        Rectangle rect = new Rectangle(36, 750, 523, 56);
//        CustomFontFilter fontFilter = new CustomFontFilter(rect);
//        FilteredEventListener listener = new FilteredEventListener();
//
//        // Create a text extraction renderer
//        LocationTextExtractionStrategy extractionStrategy = listener
//        .attachEventListener(new LocationTextExtractionStrategy(), fontFilter);
//
//        // Note: If you want to re-use the PdfCanvasProcessor, you must call PdfCanvasProcessor.reset()
//        PdfCanvasProcessor parser = new PdfCanvasProcessor(listener);
//        parser.processPageContent(pdfDoc.getFirstPage());
//
//        // Get the resultant text after applying the custom filter
//        String actualText = extractionStrategy.getResultantText();
//
//        pdfDoc.close();
//
//        // See the resultant text in the console
//        System.out.println(actualText);
//
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest)))) {
//        writer.write(actualText);
//        }


public class PdfReaderTest {
    public static void main(String[] args) throws Exception {
        StringBuilder text = new StringBuilder();
        String fileName = "test.pdf";
        PdfDocument pdfDoc = new PdfDocument(new PdfReader(fileName));

        String str = PdfTextExtractor.getTextFromPage(pdfDoc.getFirstPage());
        System.out.println(str);

    }
}
