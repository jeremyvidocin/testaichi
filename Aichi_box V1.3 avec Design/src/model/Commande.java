package model;

import java.util.Date;

public class Commande {
    private int id;
    private int idClient;
    private Date date;
    private String statut;

    public Commande(int id, int idClient, Date date, String statut) {
        this.id = id;

        this.idClient = idClient;
        this.date = date;
        this.statut = statut;
    }

    public int getId() {
        return id;
    }


    public int getIdClient() {
        return idClient;
    }

    public Date getDate() {
        return date;
    }

    public String getStatut() {
        return statut;
    }


}