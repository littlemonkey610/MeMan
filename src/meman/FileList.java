/*
 * class containing methods to import files and build them into a list
 * of FileListEntry 's  
 */
package meman;

/**
 *
 * @author BM
 */
import java.io.File;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;

public class FileList {
    private ArrayList<FileListEntry> exsistingFiles;
    private int numMovies;
    private ArrayList<FileListEntry> mediaFiles = new ArrayList();
    private int counter = 0;
    private long librarySize = 0;
    
    public void setLibrarySize(long size){
        librarySize = size;
    }
    
    public long getLibrarySize(){
        return librarySize;
    }

    public ArrayList<FileListEntry> getList() {
        return mediaFiles;
    }

    public int getNumMovies() {
        return numMovies;
    }

    public void importFolder(Path ImportPath) {
        BuildFileList(ReadMediaDirectory(ImportPath));
    }

    public void importSingle(Path p, Date d) {
        mediaFiles.add(new FileListEntry(p, d));
        numMovies++;
    }

    private void BuildFileList(Path[] paths) {
        int counter = 0;
        for (Path p : paths) {
            FileListEntry tempFile = checkIfExisits(p.toString());
            if(tempFile != null){
                mediaFiles.add(tempFile);
            } else{
            mediaFiles.add(new FileListEntry(p));
            }
            counter++;
        }
        numMovies = counter;
    }

    public static void printFileList(FileList f) {
        for (FileListEntry files : f.getList()) {
            String s = files.getName() + "  "
                    + String.valueOf(files.getFileSize()) + "MB";
            System.out.println(s);
        }
    }

    private Path[] ReadMediaDirectory(Path ImportPath) {
        String path = ImportPath.toString();
        File folder = new File(path);

        MeMan.setProgressMax(folder.listFiles().length - 1);

        Path[] results = ReadFolder(folder, true);
        counter = 0;
        return results;
    }

    private Path[] ReadFolder(File file, boolean countPBar) {
        ArrayList<Path> files = new ArrayList();
        File[] listOfFileObjects = file.listFiles();

        for (File f : listOfFileObjects) {
            if (countPBar){
                MeMan.setProgressCurrent(counter);
                counter++;
            }
            
            if (f.isDirectory()) {
                Path[] tempFiles = (ReadFolder(f, false));
                for (Path p : tempFiles) {
                    if (TestExtension(p.getFileName().toString())) {
                        files.add(p);
                    }
                }

            } else {
                if (TestExtension(f.getName())) {
                    files.add(f.toPath());
                }
            }
        }

        return files.toArray(new Path[files.size()]);
    }

    private boolean TestExtension(String s) {
        boolean result = false;
        if (s.endsWith(".mp4") || s.endsWith(".avi") || s.endsWith(".mkv")
                || s.endsWith(".m4v")) {
            result = true;
        }
        return result;
    }
    
    private FileListEntry checkIfExisits(String title){
        if (exsistingFiles == null){
            exsistingFiles = FileInOut.readFileList().getList();
        }
        boolean flag = false;
        int i;
        for (i = 0; i < exsistingFiles.size(); i++){
            flag = title.equals(exsistingFiles.get(i).getFilePath().toString());
            if (flag){
                return exsistingFiles.get(i);
            } 
        }        
        return null;
    }
}
