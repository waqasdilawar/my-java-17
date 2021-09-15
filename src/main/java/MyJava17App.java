import java.util.Scanner;
import java.util.regex.MatchResult;

public class MyJava17App
{
    public static void main(String[] args) throws Exception {
        String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign 
                9 homecoming 1 
                freight car
                """;

        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
        }

    }
}
