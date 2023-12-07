import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Repeatable(Refactoring.Refactorings.class)
public @interface Refactoring {
    String refactoredBy();
    RefactoringName name();
    String comment() default "";
    boolean presentInEclipse() default false;
    int applications() default 1;

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
    public @interface Refactorings {
        Refactoring[] value();
    }
}
