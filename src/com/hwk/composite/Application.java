package com.hwk.composite;

import com.hwk.composite.component.Directory;
import com.hwk.composite.component.File;

public class Application {
    public static void main(String[] args) {
        File myHwk = new File("La Tarea de ayer.txt",4500);
        File myOtherHwk = new File("datos INE.csv",5000);
        Directory Homework = new Directory("Tareas");
        File dogPicture = new File("otis.png",3500);
        Directory myDocs = new Directory("Mis documentos");

        Homework.add(myHwk);
        Homework.add(myOtherHwk);
        myDocs.add(Homework);
        myDocs.add(dogPicture);

        System.out.println(myDocs.getFileSize()+" bytes");
        System.out.println(myDocs.getFileSize()/1000+" KBs");
    }
}
