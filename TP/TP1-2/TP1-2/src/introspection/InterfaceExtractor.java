package introspection;

import java.lang.reflect.*;

public class InterfaceExtractor {

    public static void extractInterfaces(Class<?> clazz) {
        Class<?> superClass = clazz.getSuperclass();
        Class<?>[] interfaces = clazz.getInterfaces();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Method[] superMethods = superClass.getDeclaredMethods();

        StringBuilder extendedClasses = new StringBuilder();
        if (superClass != null) {
            extendedClasses.append(" extends I").append(superClass.getSimpleName());
        }

        if (interfaces.length > 0) {
            extendedClasses.append(" implements");
            for (int i = 0; i < interfaces.length; i++) {
                extendedClasses.append(" I").append(interfaces[i].getSimpleName());
                if (i < interfaces.length - 1) {
                    extendedClasses.append(",");
                }
            }
        }

        String interfaceName = "I" + clazz.getSimpleName()  + extendedClasses.toString();
        System.out.println("public interface " + interfaceName + " {");

        for (Method method : declaredMethods) {
            if (Modifier.isPublic(method.getModifiers()) && !isMethodInSuper(method, superMethods)&& !Modifier.isStatic(method.getModifiers())) {
                Class<?>[] paramTypes = method.getParameterTypes();
                StringBuilder params = new StringBuilder();
                for (int i = 0; i < paramTypes.length; i++) {
                    params.append(paramTypes[i].getSimpleName());
                    if (i < paramTypes.length - 1) {
                        params.append(", ");
                    }
                }
                System.out.println("    " + method.getReturnType().getSimpleName() + " " + method.getName() + "(" + params + ");");
            }
        }
        System.out.println("}");
    }

    private static boolean isMethodInSuper(Method method, Method[] superMethods) {
        for (Method superMethod : superMethods) {
            if (superMethod.getName().equals(method.getName())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        extractInterfaces(Appartement.class);
        extractInterfaces(AppartementResidence.class);
    }
}
