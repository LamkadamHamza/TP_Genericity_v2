package Presentation;

import entities.Produit;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ApplicationTest1 {
    public static void main(String[] args) throws Exception{
        File file = new File("Produit.dat");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
        Produit p = (Produit) ois.readObject();

        System.out.println(p.getId());

    }
}
