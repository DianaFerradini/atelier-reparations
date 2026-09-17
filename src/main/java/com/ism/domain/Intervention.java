package com.ism.domain;

import java.util.Date;

public class Intervention extends AbstractEntity {
//Intervention est final car aucune classe ne peut l'hériter

    private String description;
    private int cout;
    private Date date;
    private Appareil appareil;
    private StatutIntervention statut;
    
    public Intervention() {
    }

    public Intervention(int id, String description, int cout, Date date, Appareil appareil, StatutIntervention statut) {
        super(id);
        this.description = description;
        this.cout = cout;
        this.date = date;
        this.appareil = appareil;
        this.statut = statut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Appareil getAppareil() {
        return appareil;
    }

    public void setAppareil(Appareil appareil) {
        this.appareil = appareil;
    }

    public StatutIntervention getStatut() {
        return statut;
    }

    public void setStatut(StatutIntervention statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", description : " + description + ", cout : " + cout + "FCFA, date : " + date
                + ", appareil : " + appareil + ", statut : " + statut;
    }
}
