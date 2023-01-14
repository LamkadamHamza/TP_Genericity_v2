package entities;

import java.io.Serializable;

public class Produit implements Serializable {
    private Long id ;
    private  String nom ;
    private String marque ;
    private String description ;
    private int nbStock ;

    private  float prix ;

    public Produit() {
    }

    public Produit(Long id, String nom, String marque, String description, int nbStock, float prix) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.nbStock = nbStock;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbStock() {
        return nbStock;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }



}
