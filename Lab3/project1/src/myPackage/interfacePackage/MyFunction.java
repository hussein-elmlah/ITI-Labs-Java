// /home/hussein/14-Java/Java-Labs/Lab3/project1/src/myPackage/interfacePackage/MyFunction.java
package myPackage.interfacePackage;

@FunctionalInterface
public interface MyFunction<T, R> {
    R apply(T t);
}
