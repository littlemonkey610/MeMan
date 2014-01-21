/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meman;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.*;
import javax.swing.table.*;
import java.util.Date;

/**
 *
 * @author JOSH
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        searchingProgressBar.setMinimum(0);
        searchingProgressBar.setStringPainted(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTextBox = new javax.swing.JTextField();
        directoryToSearchTextBox = new javax.swing.JTextField();
        lab1 = new javax.swing.JLabel();
        searchingProgressBar = new javax.swing.JProgressBar();
        reSearchButton = new javax.swing.JButton();
        lab4 = new javax.swing.JLabel();
        numMoviesLab = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        totalSizeLab = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        numMoviesDisplayedLab = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        movieSearchStatusLab = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchTextBox.setText("Search...");
        searchTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextBoxMouseClicked(evt);
            }
        });
        searchTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextBoxActionPerformed(evt);
            }
        });
        searchTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextBoxKeyReleased(evt);
            }
        });

        directoryToSearchTextBox.setText("\\\\NAS\\media\\Movies");

        lab1.setText("Directory to search");

        reSearchButton.setText("Reload");
        reSearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reSearchButtonMouseClicked(evt);
            }
        });

        lab4.setText("Total Number Of Movies:");

        numMoviesLab.setText("0");

        lab3.setText("Total Size:");

        totalSizeLab.setText("0MB");

        lab2.setText("Number Of Movies Displayed:");

        numMoviesDisplayedLab.setText("0");

        lab5.setText("Status:");

        movieSearchStatusLab.setText("Done");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Size", "Extension", "Added"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(5);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lab1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(reSearchButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lab5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(movieSearchStatusLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(searchingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(directoryToSearchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lab2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numMoviesDisplayedLab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lab4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numMoviesLab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lab3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalSizeLab)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lab1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directoryToSearchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reSearchButton)
                            .addComponent(lab5)
                            .addComponent(movieSearchStatusLab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchingProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab4)
                    .addComponent(numMoviesLab)
                    .addComponent(lab3)
                    .addComponent(lab2)
                    .addComponent(numMoviesDisplayedLab)
                    .addComponent(totalSizeLab))
                .addContainerGap())
        );

        searchTextBox.getAccessibleContext().setAccessibleName("search_field");
        lab1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextBoxActionPerformed
        searchTextBox.setText("");
    }//GEN-LAST:event_searchTextBoxActionPerformed

    private void reSearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reSearchButtonMouseClicked
        new Thread() {
            public void run() {
                movieSearchStatusLab.setText("Scanning");
                FileList files = new FileList();
                String directory = getImportDirectory();
                files.importFolder(Paths.get(directory));
                movieSearchStatusLab.setText("Writing");
                FileInOut.WriteFileList(files);
                movieSearchStatusLab.setText("Updating Index");
                Search.updateIndex();
                totalSizeLab.setText(String.valueOf(files.getLibrarySize()));
                movieSearchStatusLab.setText("Done");
            }
        }.start();

    }//GEN-LAST:event_reSearchButtonMouseClicked

    private void searchTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextBoxMouseClicked
        searchTextBox.setText("");
    }//GEN-LAST:event_searchTextBoxMouseClicked

    private void searchTextBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextBoxKeyReleased
        files = Search.searchText(searchTextBox.getText());

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //clear table for new results
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }

        for (int i = 0; i < files.size(); i++) { //populate table with search results
            model.addRow(new Object[]{files.get(i).getName(),
                        files.get(i).getFileSize() + "MB",
                        files.get(i).getExtension(),
                        String.valueOf(timeString(files.get(i).getImportTime()))});
        }
        jTable1.setModel(model);

        this.setNumMoviesDisplayed(String.valueOf(jTable1.getRowCount()));
        
    }//GEN-LAST:event_searchTextBoxKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            try {
                Desktop.getDesktop().open(new File(files.get(jTable1.getSelectedRow()).getFilePath().toString()));
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField directoryToSearchTextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel movieSearchStatusLab;
    private javax.swing.JLabel numMoviesDisplayedLab;
    private javax.swing.JLabel numMoviesLab;
    private javax.swing.JButton reSearchButton;
    private javax.swing.JTextField searchTextBox;
    private javax.swing.JProgressBar searchingProgressBar;
    private javax.swing.JLabel totalSizeLab;
    // End of variables declaration//GEN-END:variables
    private ArrayList<FileListEntry> files;

    private String getImportDirectory() {
        String temp = directoryToSearchTextBox.getText();
        temp.replace("//", "////");

        return temp;
    }
    
    private String timeString(Date time){
        long current = new Date().getTime();
        long imported = time.getTime();
        
        long diff = (current - imported) / 86400000;
        
        return String.valueOf(diff) + " Days Ago";
    }

    public void setProgressMax(int max) {
        searchingProgressBar.setMaximum(max);
    }

    public void setProgressMin(int min) {
        searchingProgressBar.setMinimum(min);
    }

    public void setProgressCurrent(int current) {
        searchingProgressBar.setValue(current);
    }

    public void setNumMoviesDisplayed(String newText) {
        numMoviesDisplayedLab.setText(newText);
    }

    public void setNumMovies(String newText) {
        numMoviesLab.setText(newText);
    }

    public void setMovieSearchStatus(String newText) {
        movieSearchStatusLab.setText(newText);
    }

    public void setTotalSize(long newNum) {
        totalSizeLab.setText(String.valueOf(newNum)
                + "GB");
    }
}
