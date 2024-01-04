
import myPackage.AnnotatedClass;
import myPackage.Author;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args) {
        Class<AnnotatedClass> clazz = AnnotatedClass.class;

        if (clazz.isAnnotationPresent(Author.class)) {
            Author classAuthor = clazz.getAnnotation(Author.class);
            System.out.println("Class Author: " + classAuthor.value());
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Author.class)) {
                Author fieldAuthor = field.getAnnotation(Author.class);
                System.out.println("Field: " + field.getName() + ", Author: " + fieldAuthor.value());
            }
        }

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.isAnnotationPresent(Author.class)) {
                Author constructorAuthor = constructor.getAnnotation(Author.class);
                System.out.println("Constructor Author: " + constructorAuthor.value());
            }
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {
                Author methodAuthor = method.getAnnotation(Author.class);
                System.out.println("Method: " + method.getName() + ", Author: " + methodAuthor.value());
            }
        }
    }
}
