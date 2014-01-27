/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meman;

/**
 *
 * @author BM
 */
//import java.nio.file.*;
//import java.util.ArrayList;
//import javax.swing.JFrame;
//import java.awt.Desktop;
//import java.io.File;
public class MeMan {

    private static Main gui;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gui = new Main();
        gui.setVisible(true);
        setMovieSearchStatus("Updating Index");
        gui.disableUI();
        Search.updateIndex();
        gui.enableUI();
        setMovieSearchStatus("Done");
    }

    public static void setProgressMax(int max) {
        gui.setProgressMax(max);
    }

    public static void setProgressMin(int min) {
        gui.setProgressMin(min);
    }

    public static void setProgressCurrent(int current) {
        gui.setProgressCurrent(current);
    }

    public static void setNumMovies(String newText) {
        gui.setNumMovies(newText);
    }

    public static void setMovieSearchStatus(String newText) {
        gui.setMovieSearchStatus(newText);
    }

    public static void setTotalSize(long newNumber) {
        gui.setTotalSize(newNumber);
    }
}
