package sample.controller;

import javax.swing.*;
import java.io.File;
import java.util.List;


public class LocationChooser {

    private FileCreater fileCreater;

    public LocationChooser(FileCreater fileCreater) {
        this.fileCreater = fileCreater;
    }
    public void chooseLocation(List<Integer> list){

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new File( System.getProperty("user.home")
                + System.getProperty("file.separator")+ "Desktop"));

        int option = chooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION)
        {
            String path = chooser.getSelectedFile().getAbsolutePath();
            fileCreater.saveFile(list, path);
        }
    }
}
