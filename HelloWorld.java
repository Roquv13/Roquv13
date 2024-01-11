public class HelloWorld {
    public static void main(String[] args) {

        String name, country, language, codeLanguages, firstField, secondField;
        int age;

        // General
        name = "Cezary";
        age = 24;
        country = "Poland";
        language = "Polish and English";
        codeLanguages = "Java and Python";
        // Studies
        firstField = "Mechatronics";
        secondField = "Computer Science";

        // About me
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I'm " + age + " years old and I'm from " + country + ".");
        System.out.println("I know two languages: " + language + ".");
        System.out.println("I write code in two languages: " + codeLanguages + ".");

        // Studies first degree
        String firstDegree = studies(firstField, status(true), 2023);
        System.out.println(firstDegree);

        // Studies second degree
        String secondDegree = studies(secondField, status(false), 2024);
        System.out.println(secondDegree);

    }

    public static String status(boolean field) {
        return field ? "graduated" : "in progress";
    }

    public static String studies(String studiesField, String status, int graduationYear) {
        if (studiesField.equals("Mechatronics")) {
            if (status.equals("graduated")) {
                return String.format("In %s, I completed my first-degree studies in Mechatronics Engineering with a specialization in controller programming", graduationYear);
            } else {
                return String.format("My studies in Mechatronics are %s.", status );
            }
        }
        if (studiesField.equals("Computer Science")) {
            if (status.equals("graduated")) {
                return String.format("In %s, I completed second-degree studies with a master's degree in computer science, specializing in information processing systems", graduationYear);
            } else {
                return String.format("My studies in Computer Science are %s.", status);
            }
        } else {
            return "No studies";
        }
    }
}
