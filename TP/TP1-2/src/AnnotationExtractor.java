import java.lang.reflect.*; //inspection des types à l'execution

public class AnnotationExtractor {
    public static void main(String[] args) {
        Class<Personne> classePersonne = Personne.class;
        extractAnnotations(classePersonne);
        extractAnnotations(classePersonne.getDeclaredFields());
        extractAnnotations(classePersonne.getDeclaredMethods());
    }

    public static void extractAnnotations(AnnotatedElement... elements) { //tableau d'éléments annotées
        for (AnnotatedElement element : elements) {
            if (element.isAnnotationPresent(Refactoring.class)) {//vérifie si l'élément possède l'annotation @refactoring
                Refactoring refactoringAnnotation = element.getAnnotation(Refactoring.class); //récupère l'annotation refactoring présente sur l'élément
                //affichage infos des annotations
                System.out.println("Annotation @Refactoring sur : " + element);
                System.out.println("RefactoredBy: " + refactoringAnnotation.refactoredBy());
                System.out.println("Name: " + refactoringAnnotation.name());
                System.out.println("Comment: " + refactoringAnnotation.comment());
                System.out.println("Present in Eclipse: " + refactoringAnnotation.presentInEclipse());
                System.out.println("Applications: " + refactoringAnnotation.applications());
                System.out.println();
            }
        }
    }
}
