<h1 align="center">Hello, I'm Cezary 👋👋</h1>
<h2 align="center">A passionate beginner Java and Python from Bydgoszcz in Poland</h2>

<table>
<tr>
<td>
	
```java
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
        System.out.printf("I write code in two languages %s and %s.%n", codeLanguages.get(0), codeLanguages.get(1));

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
                    String.format("In %d, I completed my first-degree studies in Mechatronics Engineering " +
                            "with a specialization in controller programming.", graduationYear) :
                    String.format("My studies in Mechatronics are %s.", status(isGraduated));
            case "Computer Science" -> isGraduated ?
                    String.format("In %d, I completed second-degree studies with a master's degree in " +
                            "computer science, specializing in information processing systems.", graduationYear) :
                    String.format("My studies in Computer Science are %s.", status(isGraduated));
            default -> "No studies";
        };
    }

    public static String status(boolean isGraduated) {
        return isGraduated ? "graduated" : "in progress";
    }
}
```
<h2 align="center">Output</h2>
Hello my name is Cezary.<br>
I'm 24 years old and I'm from Poland.<br>
I know two languages Polish and English.<br>
I write a code in two languages Java and Python.<br>
In 2023, I completed my first-degree studies in Mechatronics Engineering with a specialization in controller programming.<br>
My studies in Computer Science are in progress.

</td>
<td>

<h2 align="center">📋 Languages

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)</h2>

<h2 align="center">💻 IDEs/Editors

![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=android-studio&logoColor=white)</h2>

<h2 align="center">🧑‍💻 Forums

![Stack Overflow](https://img.shields.io/badge/-Stackoverflow-FE7A16?style=for-the-badge&logo=stack-overflow&logoColor=white)
![Reddit](https://img.shields.io/badge/Reddit-%23FF4500.svg?style=for-the-badge&logo=Reddit&logoColor=white)</h2>

<h2 align="center">🎛️ Operating System
    
![Windows 11](https://img.shields.io/badge/Windows%2011-%230079d5.svg?style=for-the-badge&logo=Windows%2011&logoColor=white)
![macOS](https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=macos&logoColor=F0F0F0)
![iOS](https://img.shields.io/badge/iOS-000000?style=for-the-badge&logo=ios&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)</h2>

<h2 align="center">🏢 Office

![Microsoft Office](https://img.shields.io/badge/Microsoft_Office-D83B01?style=for-the-badge&logo=microsoft-office&logoColor=white)
![Microsoft Excel](https://img.shields.io/badge/Microsoft_Excel-217346?style=for-the-badge&logo=microsoft-excel&logoColor=white)
![Microsoft PowerPoint](https://img.shields.io/badge/Microsoft_PowerPoint-B7472A?style=for-the-badge&logo=microsoft-powerpoint&logoColor=white)
![Microsoft Word](https://img.shields.io/badge/Microsoft_Word-2B579A?style=for-the-badge&logo=microsoft-word&logoColor=white)</h2>	
</td>
</tr>
</table>

<!--
**Roquv13/Roquv13** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->
