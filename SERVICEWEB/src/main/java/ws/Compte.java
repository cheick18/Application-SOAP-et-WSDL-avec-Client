package ws;

import java.util.Date;

public class Compte {
    private int codeAnInt;
    private double solde;
    private Date dateCreation;

    public int getCodeAnInt() {
        return codeAnInt;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCodeAnInt(int codeAnInt) {
        this.codeAnInt = codeAnInt;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Compte(int codeAnInt, double solde, Date dateCreation) {
        this.codeAnInt = codeAnInt;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
}
