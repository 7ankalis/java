public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(Personne titulaire, double solde, int numero, double tauxInteret) {
        super(titulaire, solde, numero);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }
}

