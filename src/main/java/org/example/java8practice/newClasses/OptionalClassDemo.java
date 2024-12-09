package org.example.java8practice.newClasses;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        optionalClassStaticMethodsDemo();
        optionalClassNonStaticMethodsDemo();

    }

    private static void optionalClassStaticMethodsDemo() {
        String email = "dummy@gmail.com";
        String noEmail = null;

        // of()
        Optional<String> emailOptional1 = Optional.of(email);
        System.out.println("===> " + emailOptional1);
        // Optional<String> emailOptional2 = Optional.of(noEmail); --> throws NPE
        // System.out.println(emailOptional2);

        // empty()
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println("===> " + emptyOptional);

        // ofNullable()
        Optional<String> emailOptional3 = Optional.ofNullable(email);
        System.out.println("===> " + emailOptional3);
        Optional<String> emailOptional4 = Optional.ofNullable(noEmail); // ---> returns an empty optional when object is NULL
        System.out.println("===> " + emailOptional4);
    }

    private static void optionalClassNonStaticMethodsDemo() {

        getOptionalAPI();
        isPresentOptionalAPI();
        createEmptyOptionalObject();
        ifPresentOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        orElseThrowOptionalAPI();
    }

    // If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException
    private static void getOptionalAPI() {

        String email = "dummy@gmail.com";
        String noEmail = null;

        // get()
        Optional<String> emailOptional = Optional.ofNullable(email);
        System.out.println(emailOptional);
        System.out.println(emailOptional.get());
        Optional<String> noEmailOptional = Optional.ofNullable(noEmail);
        System.out.println(noEmailOptional); // --> Optional.empty
        // System.out.println(noEmailOptional.get()); ---> throws NSE
    }


    // Returns an Optional with the specified present non-null value.
    private static void isPresentOptionalAPI() {
        Optional<String> opt = Optional.of("Ramesh");
        //        Optional<String> opt = Optional.of(null);
        if (opt.isPresent())
            System.out.println(opt.get());
        else
            System.out.println("no value present");
    }

    // Returns an Optional with the specified present non-null value.
    private static void createEmptyOptionalObject() {
        Optional<String> empty = Optional.empty(); //Optional.empty !=null
        System.out.println(empty.isPresent()); //false
    }


    // If a value is present, invoke the specified consumer with the value, otherwise do
    // nothing.
    private static void ifPresentOptionalAPI() {
        // The ifPresent API enables us to run some code on the wrapped value if it is
        // found to be non-null.
        // Before Optional, we would do something like this:
        String name = "Ramesh";
        if (name != null) {
            System.out.println(name.length());
        }

        Optional<String> opt = Optional.of("Ramesh");
        opt.ifPresent(str -> System.out.println(str.length()));
    }

    // If a value is present, invoke the specified consumer with the value, otherwise do nothing.
    private static void orElseOptionalAPI() {
        // With orElse, the wrapped value is returned if it is present and the argument
        // given to
        // orElse is returned if the wrapped value is absent
        String nullName = null;

        // If a value is present, invoke the specified consumer with the value, otherwise
        // do nothing.
        String name = Optional.ofNullable(nullName).orElse("Ramesh");
        System.out.println(name);
    }

    // Return the value if present, otherwise invoke other and return the result of that
    // invocation.
    private static void orElseGetOptionalAPI() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println(name);
    }

    // Return the contained value, if present, otherwise throw an exception to be created
    // by the provided supplier.
    private static void orElseThrowOptionalAPI() {

        // This will throw exception
        String nullName = null;
        //        Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new); --> throws IAE
        System.out.println(nullName);
    }


}
