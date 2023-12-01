class EtudiantAlternance extends Etudiant {
    private  float salaire;

    public EtudiantAlternance(int identifiant, String nom, float moyenne, float salaire){
        super(identifiant, nom, moyenne);
        this.salaire = salaire;
    }

    @Override


        public void ajouterUneAbsence(){
            if (salaire >= 50) {
                salaire -= 50;
                System.out.println("Absence ajoutée pour l'étudiant en alternance. Retrait de 50dt du salaire.");
            } else {
                System.out.println("L'étudiant en alternance n'a pas un salaire suffisant pour retirer 50dt.");
            }
        }


    public String toString() {
        return "EtudiantAlternance{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
    }
