public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(Personne titulaire, double solde, int numero, double decouvertAutorise) {
        super(titulaire, solde, numero);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public boolean retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
            return true;
        }
        return false;
    }
}

