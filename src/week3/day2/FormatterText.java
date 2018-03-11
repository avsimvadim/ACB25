package week3.day2;

public class FormatterText {
    public static void main(String[] args) {
        int age = 28;
        String name = "Vadym";

        System.out.println("Hello " + name + " ! You are " + age + " years old.");
        System.out.printf("Hello %s ! You are %d years old.%n", name, age);

        System.out.println("\tPI = " + Math.PI);
        System.out.printf("PI1 = %-8.2f%n", Math.PI);
        System.out.printf("PI2 = %-8.6f%n", Math.PI);
        System.out.printf("PI3 = %-8.5f%n", Math.PI);
        System.out.printf("PI4 = %8.3f%n", Math.PI);
        System.out.printf("PI5 = %8.3f%n", Math.PI);
        System.out.printf("PI6 = %8.3f%n", Math.PI);
        System.out.printf("PI7 = %08.3f%n", Math.PI);
        System.out.printf("PI8 = %08.4f%n", Math.PI);

    }
}
