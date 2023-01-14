package Presentation;

import entities.Produit;
import meties.MetieProduitImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args)  throws Exception{


        MetieProduitImpl a = new MetieProduitImpl();
        a.add(new Produit(1L, "A", "AA", "AAAA", 123 , 11 ));
        a.add(new Produit(2L, "A", "BB", "BBBB", 123 , 1200 ));
        a.add(new Produit(3L, "A", "CC", "CCCC", 123 , 1200));
        Scanner scan = new Scanner(System.in);
        String input;
        String buyAgain = null;

        //la partie serialisation
       // File file = new File("Produit.txt");
        //FileOutputStream fos = new FileOutputStream(file);;
      // ObjectOutputStream oos=new ObjectOutputStream(fos);

        do
        {
            System.out.println("********MENU********");
            System.out.println(" 1 pour Afficher la list des produit ");
            System.out.println(" 2 pour Rechercher un produit par son id");
            System.out.println(" 3 pour Ajouter un nouveau produit par id ");
            System.out.println(" 4 pour pour sauvgarder dans un fichier  ");
            System.out.println(" 5 Quitter ce programme1");

            input = scan.next();

            if(input.equals("1"))
            {
                System.out.println("list produit");
                List<Produit> prod = a.getAll();
                System.out.println("id " +"  " + "nom" +"  " +  "marque" +"  " + "Descr "+"  " + "nb");
               for (Produit p:prod)
               {
                   System.out.println(p.getId()+ "  "+ p.getNom() + " " + p.getMarque() + " " + p.getDescription()+ " " + p.getNbStock());
               }
               // oos.writeObject(prod);
                //oos.close();

            }
            else if(input.equals("2"))
            {
                System.out.println("rechercher");
                System.out.println("entre l\'id :");
                Scanner sc = new Scanner(System.in);
                Produit p2=a.findById(sc.nextLong());
                System.out.println(p2.getNom());
            }
            else if(input.equals("3"))
            {
                System.out.println("Ajouter");

            }else if(input.equals("4")){

                Produit ps=new  Produit(4L, "E", "EE", "EEEE", 123 , 1234 );
                a.saveAll(ps);
            }
            else if(input.equals("5"))
            {

                System.out.println("By");
            }
            else
            {
                System.out.println("nombre invalide \n appuyer sur  1 pour avoir le menu");
                buyAgain = scan.next();
            }
            System.out.println("vous voulez continue\nappuyer 1 pour oui et  0 pour no");
            buyAgain = scan.next();
        }
        while(!buyAgain.equals("0"));





    }
}
