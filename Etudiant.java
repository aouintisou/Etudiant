public  abstract class Etudiant {
    public int identifiant;
    public String nom;
    public String prenom;
    public float moyenne;

    public Etudiant(int identifiant, String nom, float moyenne) {

        this.identifiant = identifiant;
        this.nom = nom;
        this.moyenne = moyenne;
        this.prenom = prenom;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Etudiant etudiant = (Etudiant) obj;

        return identifiant == etudiant.identifiant && nom.equals(etudiant.nom) && prenom.equals(etudiant.prenom) ;
    }
    public String toString() {
        return "Etudiant{" +
                "identifiant=" + identifiant +
                ", nom='" + nom +", prenom='" +prenom + ", moyenne='"+ moyenne + '\'' + '}';

    }

    public abstract void ajouterUneAbsence();
}

