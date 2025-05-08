public class Main {
    public static void main(String[] args) {
        Personne p = new Personne(12345678, "Taha", "Marouani");
        Compte c = new Compte(p, 1000.0, 1);

        Banque banque = new Banque("Banque Centrale");
        banque.ajouterCompte(c);

        banque.deposer(1, 500);
        banque.retirer(1, 200);

        System.out.println("Solde final: " + c.getSolde());
    }
}

