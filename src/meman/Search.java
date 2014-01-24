/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meman;

/**
 *
 * @author JOSH
 */
import java.util.ArrayList;

public class Search {

    private static FileList files;

    public static void updateIndex() {
        files = FileInOut.readFileList();
        MeMan.setNumMovies(String.valueOf(files.getNumMovies()));
        MeMan.setTotalSize(files.getLibrarySize());
    }

    public static ArrayList<FileListEntry> searchText(String phrase) {
        ArrayList<FileListEntry> results = new ArrayList();
        ArrayList<FileListEntry> index = new ArrayList();
        double numMovies = files.getNumMovies();

        index = files.getList();
        for (int i = 0; i < numMovies; i++) {
            String tempName = index.get(i).getName().toLowerCase();
            if (tempName.contains(phrase.toLowerCase())) {
                results.add(index.get(i));
            }
        }


        return results;
    }
}
