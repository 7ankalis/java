import java.util.ArrayList;
import java.util.List;

public class Banque {
    private final String nomBanque;
    private final List<Compte> listeComptes = new ArrayList<>();

    public Banque(String nom) {
        this.nomBanque = nom;
    }

    public void ajouterCompte(Compte compte) {
        listeComptes.add(compte);
    }

    public void fermerCompte(Compte compte) {
        listeComptes.remove(compte);
    }

    public boolean deposer(int numero, double montant) {
        for (Compte compte : listeComptes) {
            if (compte.getNumero() == numero) {
                return compte.deposer(montant);
            }
        }
        return false;
    }

    public boolean retirer(int numero, double montant) {
        for (Compte compte : listeComptes) {
            if (compte.getNumero() == numero) {
                return compte.retirer(montant);
            }
        }
        return false;
    }
}
