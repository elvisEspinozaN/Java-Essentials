package objects_and_apis;

public class SealedClasses {
    /*
    Sealed Classes : who can inherit from it
    restrict which other classes may extend them
    non-sealed : opened to be extended by any other class
    final : cannot have any subclasses
     */

    // specify which classes are allowed inherit from sealed class
    public sealed class Shape permits Rectangle, Circle {}

    // must define if sealed, non-sealed, or final
    public sealed class Rectangle extends Shape permits Square {}

    // any class that extends circle is not obligated to define themselves
    public non-sealed class Circle extends Shape {}

    public final class Square extends Rectangle {}
}
