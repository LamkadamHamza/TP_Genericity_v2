package meties;

import entities.Produit;

import javax.swing.event.ListDataEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class MetieProduitImpl  implements IMetier<Produit> {

    List<Produit> produitList = new ArrayList<>();


    @Override
    public void add(Produit O) {
        Produit p = findById(O.getId());
        if(p==null)
          produitList.add(O);
    }

    @Override
    public List<Produit> getAll() {

        return produitList;

    }

    @Override
    public Produit findById(Long id) {
        for (Produit p: produitList)
        {
            if(p.getId() == id)  { return  p ; }

        }

        return null;
    }

    @Override
    public void delete(Long id) {
        Produit p = findById(id);
        if(p!=null)
           produitList.remove(p);

    }

    @Override
    public void saveAll(Produit O) throws Exception{
        File file = new File("Produit.dat");
        FileOutputStream fos = new FileOutputStream(file);;
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Produit p=(Produit) O;
        oos.writeObject(p);
        oos.close();
    }


    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }
}
