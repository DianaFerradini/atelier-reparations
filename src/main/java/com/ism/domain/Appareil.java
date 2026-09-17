package com.ism.domain;

public final class Appareil extends AbstractEntity {
//Appareil est final car aucune classe ne peut l'hériter

    private String marque;
    private String modele;
    private String imei;
    private EtatAppareil etat;

    public Appareil() {
    }

    public Appareil(int id, String marque, String modele, String imei, EtatAppareil etat) {
        super(id);
        this.marque = marque;
        this.modele = modele;
        this.imei = imei;
        this.etat = etat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public EtatAppareil getEtat() {
        return etat;
    }

    public void setEtat(EtatAppareil etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", marque : " + marque + ", modele : " + modele + ", imei : " + imei + ", etat :" + etat;
    }
}
