public class Compte {
    protected Personne titulaire;
    protected double solde;
    protected int numero;

    public Compte(Personne titulaire, double solde, int numero) {
        this.titulaire = titulaire;
        this.solde = solde;
        this.numero = numero;
    }

    public boolean deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            return true;
        }
        return false;
    }

    public boolean retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }
}

