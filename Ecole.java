public class Ecole {
    private static final int CAPACITE_MAX = 500;
    private Etudiant[] etudiants;
    private int nombreEtudiants;

    public Ecole() {
        this.etudiants = new Etudiant[CAPACITE_MAX];
        this.nombreEtudiants = 0;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        if (nombreEtudiants < CAPACITE_MAX) {
            etudiants[nombreEtudiants++] = etudiant;
        } else {
            System.out.println("La capacité maximale de l'école est atteinte. Impossible d'ajouter plus d'étudiants.");
        }
    }
    public int rechercherEtudiant(Etudiant etudiant) {
        for (int i = 0; i < nombreEtudiants; i++) {
            if (etudiants[i].equals(etudiant)) {
                return i;
            }
        }
        return -1;
    }
    public double getMoyenneDes3A() {
        double sommeMoyennes = 0;
        int nombreEtudiants3A = 0;

        for (int i = 0; i < nombreEtudiants; i++) {
            if (etudiants[i] instanceof Etudiant3eme) {
                Etudiant3eme etudiant3A = (Etudiant3eme) etudiants[i];
                sommeMoyennes += etudiant3A.getMoyenne();  // Assurez-vous que votre classe Etudiant3eme a une méthode getMoyenne()
                nombreEtudiants3A++;
            }
        }


        if (nombreEtudiants3A == 0) {
            System.out.println("Aucun étudiant de 3A dans l'école.");
            return 0.0;
        }

        return sommeMoyennes / nombreEtudiants3A;
    }


    public double moyenneSalaireAlternants() {
        double sommeSalaires = 0;
        int nombreAlternants = 0;

        for (int i = 0; i < nombreEtudiants; i++) {
            if (etudiants[i] instanceof EtudiantAlternance) {
                EtudiantAlternance alternant = (EtudiantAlternance) etudiants[i];
                sommeSalaires += alternant.getSalaire();  // Assurez-vous que votre classe EtudiantAlternance a une méthode getSalaire()
                nombreAlternants++;
            }
        }


        if (nombreAlternants == 0) {
            System.out.println("Aucun étudiant alternant dans l'école.");
            return 0.0;
        }

        return sommeSalaires / nombreAlternants;
    }
    public String toString() {
        StringBuilder result = new StringBuilder("Ecole: " + nomEcole + "\n");

        for (int i = 0; i < nombreEtudiants; i++) {
            result.append(etudiants[i].toString()).append("\n");
        }

        return result.toString();
    }


    public void changerEcole(Etudiant etudiant, Ecole nouvelleEcole) {
        int indice = rechercherEtudiant(etudiant);

        if (indice != -1) {

            for (int i = indice; i < nombreEtudiants - 1; i++) {
                etudiants[i] = etudiants[i + 1];
            }

            nombreEtudiants--;


            nouvelleEcole.ajouterEtudiant(etudiant);
        } else {
            System.out.println("L'étudiant n'a pas été trouvé dans l'école actuelle.");
        }
    }
}

