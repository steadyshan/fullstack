package com.cmslistadmin.content_list_crud.business;

import java.io.File;
import java.util.ArrayList;

import org.springframework.boot.autoconfigure.amqp.ConnectionFactoryCustomizer; 

public class FilesListing {
    public String[] getFileListing(String folderName) {
        String[] fileNames = null ;
            
        File folderToList = new File(folderName) ;
        File contentsFile[] = folderToList.listFiles();
        if (contentsFile != null && contentsFile.length > 0 ){
            int k = contentsFile.length;
            fileNames = new String[k];
            for (int i = 0 ; i < contentsFile.length; i++)
            {
                if (contentsFile[i].isDirectory()) {
                    fileNames[i] =   contentsFile[i].getName();
                } else {
                    fileNames[i] =   "(file)" + contentsFile[i].getName();
                    
                }
            }
        } 
        return fileNames ;
    }
    public boolean moveFile(String sourcePath,String targetPath, String sourceFileName, String destFileName ) {
        if (destFileName == "") {
            destFileName = sourceFileName ;
        }
        File fileToMove = new File(sourcePath + "/" + sourceFileName);
        System.out.printf("%s XXXXX %s YYYYY", sourcePath, targetPath);
        boolean fileMoved = fileToMove.renameTo(new File(targetPath + "/" + destFileName));
    
        return fileMoved;
    }
}
