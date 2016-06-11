/* 
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Words. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.words.examples.mail_merge;

import com.aspose.words.Document;
import com.aspose.words.MailMergeCleanupOptions;
import com.aspose.words.examples.Utils;
import com.aspose.words.net.System.Data.DataSet;


public class RemoveUnmergedRegions {
    public static void main(String[] args) throws Exception {
        //ExStart:1
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemoveUnmergedRegions.class);

        // Open the document.
        Document doc = new Document(dataDir + "TestFile.doc");

        // Create a dummy data source containing no data.
        DataSet data = new DataSet();

        // Set the appropriate mail merge clean up options to remove any unused regions from the document.
        doc.getMailMerge().setCleanupOptions(MailMergeCleanupOptions.REMOVE_UNUSED_REGIONS);

        // Execute mail merge which will have no effect as there is no data. However the regions found in the document will be removed
        // automatically as they are unused.
        doc.getMailMerge().executeWithRegions(data);

        // Save the output document to disk.
        doc.save(dataDir + "Output.doc");
        //ExEnd:1
    }
}