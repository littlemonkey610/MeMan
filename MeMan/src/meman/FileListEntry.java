/*
 * Class represents one file and associated details
 * Provides methods which allows it to be easily stored and recovered
 * from a string which will be stored in a text file
 */
package meman;

/*
 * @author BM
 * @version 11/19/2013
 */
import java.io.File;
import java.nio.file.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileListEntry {

    String name; //name of the media
    char mediaType; //T = tv show, M = movie
    String extension; //mp4, mov etc...
    Path filePath; //path to file on disk
    double timeImported; //time imported into library in seconds
    int fileSize; //size of file in megabytes
    int fileDuration; //length of file in mins

    public FileListEntry(Path newFilePath) { //constructor
        filePath = newFilePath;
        setTypeFromPath();
        timeImported = System.currentTimeMillis();
        setFileSize();
        setFileDuration();
        setName(newFilePath);
    }

    private void setTypeFromPath() {
        Pattern p = Pattern.compile("[sS](\\d{2})[eE](\\d{2})");
        Matcher m = p.matcher(filePath.toString());
        if (m.matches()) {
            mediaType = 'T';
        } else {
            mediaType = 'M';
        }
    }

    private void setFileSize() {
        File temp = new File(filePath.toString());
        fileSize = Math.round(temp.length() / 1048576);
    }

    private void setFileDuration() {
        fileDuration = 120;
    }

    private void setName(Path p) {
        name = p.getFileName().toString();
    }

    public String getName() {
        return name;
    }

    public char getMediaType() {
        return mediaType;
    }

    public String getExtension() {
        return extension;
    }

    public Path getFilePath() {
        return filePath;
    }

    public double getImportTime() {
        return timeImported;
    }

    public int getFileSize() {
        return fileSize;
    }
}
