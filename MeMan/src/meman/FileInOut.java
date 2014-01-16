/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meman;

import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.*;

/**
 *
 * @author JOSH
 */
public class FileInOut {

    public static void WriteFileList(FileList f) {
        ArrayList<FileListEntry> mediaFiles = f.getList();
        int numMovies = f.getNumMovies();

        try {
            File file = new File(System.getProperty("user.dir") + "\\movies.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < numMovies; i++) {
                String name = mediaFiles.get(i).getName();
                Path path = mediaFiles.get(i).getFilePath();
                double importTime = mediaFiles.get(i).getImportTime();
                int size = mediaFiles.get(i).getFileSize();

                String line = name + "\t" + path + "\t"
                        + String.valueOf(importTime) + "\t" + String.valueOf(size)
                        + "\r\n";
                fw.append(line);
            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FileList readFileList() {
        FileList files = new FileList();
        int counter = 0;
        long totalSize = 0;
        try {
        BufferedReader readbuffer = new BufferedReader(new FileReader("movies.txt"));
        
         String strRead;
        while ((strRead = readbuffer.readLine()) != null) {
            String[] splitArray = strRead.split("\t");
            files.importSingle(Paths.get(splitArray[1]));
            totalSize += Double.parseDouble((splitArray[2]));
            counter ++;
        }
        } catch (IOException e){
             e.printStackTrace();
        }
        MeMan.setNumMovies(String.valueOf(counter));
        MeMan.setTotalSize(totalSize);
        
        return files;
        }
       
    }

