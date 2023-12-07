@Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.RENAME, comment = "Renommer les attributs en mettant la première lettre en majuscule")
public class Personne {
    public Personne(String nom, int age, int numrue, String nomrue, String ville, int codepostale) {
        this.NomComplet = nom;
        this.Age = age;
        this.NumRue = numrue;
        this.NomRue = nomrue;
        this.Ville = ville;
        this.CodePostale = codepostale;
    }

    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.ENCAPSULATED_FIELD, comment = "Encapsuler les attributs en les rendant private")
    private String NomComplet;

    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.ENCAPSULATED_FIELD, comment = "Encapsuler les attributs en les rendant private")
    private int Age;

    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.EXTRACT_METHOD, comment = "extraire cet attribut et le mettre dans une classe Adresse")
    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.ENCAPSULATED_FIELD, comment = "Encapsuler les attributs en les rendant private")
    private int NumRue;

    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.EXTRACT_METHOD, comment = "extraire cet attribut et le mettre dans une classe Adresse")
    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.ENCAPSULATED_FIELD, comment = "Encapsuler les attributs en les rendant private")
    private String NomRue;
    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.EXTRACT_METHOD, comment = "extraire cet attribut et le mettre dans une classe Adresse")
    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.ENCAPSULATED_FIELD, comment = "Encapsuler les attributs en les rendant private")
    private String Ville;

    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.EXTRACT_METHOD, comment = "extraire cet attribut et le mettre dans une classe Adresse")
    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.ENCAPSULATED_FIELD, comment = "Encapsuler les attributs en les rendant private")
    private int CodePostale;


    @Refactoring(refactoredBy = "nomModificateur", name = RefactoringName.EXTRACT_METHOD, comment = "extraire cette méthode et le mettre dans une classe Adresse")
    public void AfficherAdresse()
    {
        System.out.println("Numero de rue : "+NumRue);
        System.out.println("Nom de la rue : "+NomRue);
        System.out.println("Nom de la ville : "+Ville);
        System.out.println("CodePostale : "+CodePostale);
    }
}
