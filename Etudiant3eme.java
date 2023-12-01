 class Etudiant3eme extends Etudiant {


     public Etudiant3eme(int identifiant, String nom, float moyenne) {
         super(identifiant, nom, moyenne);
     }

     public void ajouterUneAbsence() {
         if (moyenne >= 0.5) {
             moyenne -= 0.5;
             System.out.println("Absence ajoutée pour l'étudiant du 3ème. Retrait de 0.5 point de la moyenne.");
         } else {
             System.out.println("L'étudiant du 3ème n'a pas de moyenne suffisante pour retirer 0.5 point.");
         }
     }
}

