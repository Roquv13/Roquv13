import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        // General
        String name = "Cezary";
        int age = 24;
        String country = "Poland";

        // Languages
        Dictionary<Integer, String> languages = new Hashtable<>();
        languages.put(1, "Polish");
        languages.put(2, "English");

        // Code
        List<String> codeLanguages = List.of("Java", "Python");

        // Studies
        String firstField = "Mechatronics";
        String secondField = "Computer Science";

        // About me
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I'm " + age + " years old and I'm from " + country + ".");
        System.out.printf("I know two languages %s and %s.%n", languages.get(1), languages.get(2));
        System.out.printf("I write code in languages %s and %s.%n", codeLanguages.get(0), codeLanguages.get(1));

        // Studies first degree
        String firstDegree = studies(firstField, true, 2023);
        System.out.println(firstDegree);

        // Studies second degree
        String secondDegree = studies(secondField, false, 2024);
        System.out.println(secondDegree);

    }

    public static String studies(String studiesField, boolean isGraduated, int graduationYear) {
        return switch (studiesField) {
            case "Mechatronics" -> isGraduated ?
                    String.format("In %d, I completed my first-degree studies in Mechatronics Engineering with a specialization in controller programming", graduationYear) :
                    String.format("My studies in Mechatronics are %s.", status(isGraduated));
            case "Computer Science" -> isGraduated ?
                    String.format("In %d, I completed second-degree studies with a master's degree in computer science, specializing in information processing systems", graduationYear) :
                    String.format("My studies in Computer Science are %s.", status(isGraduated));
            default -> "No studies";
        };
    }

    public static String status(boolean isGraduated) {
        return isGraduated ? "graduated" : "in progress";
    }
}
