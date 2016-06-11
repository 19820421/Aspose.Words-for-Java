/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.programming_documents.document;

import com.aspose.words.*;
import com.aspose.words.Font;
import com.aspose.words.examples.Utils;

import java.awt.*;


public class DocumentBuilderApplyBordersAndShadingToParagraph {
    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DocumentBuilderApplyBordersAndShadingToParagraph.class);

        // Open the document.
        Document doc = new Document();
        DocumentBuilder builder = new DocumentBuilder(doc);

        // Set paragraph borders
        BorderCollection borders = builder.getParagraphFormat().getBorders();
        borders.setDistanceFromText(20);
        borders.getByBorderType(BorderType.LEFT).setLineStyle(LineStyle.DOUBLE);
        borders.getByBorderType(BorderType.RIGHT).setLineStyle(LineStyle.DOUBLE);
        borders.getByBorderType(BorderType.TOP).setLineStyle(LineStyle.DOUBLE);
        borders.getByBorderType(BorderType.BOTTOM).setLineStyle(LineStyle.DOUBLE);
        // Set paragraph shading
        Shading shading = builder.getParagraphFormat().getShading();
        shading.setTexture(TextureIndex.TEXTURE_DIAGONAL_CROSS);
        shading.setBackgroundPatternColor(Color.YELLOW);
        shading.setForegroundPatternColor(Color.GREEN);

        builder.write("I'm a formatted paragraph with double border and nice shading.");

        doc.save(dataDir + "output.doc");
        //ExEnd:1






    }
}
