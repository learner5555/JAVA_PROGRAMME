import java.util.HashSet;

public class DuplicateString {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "grapes", "apple", "banana", "orange"};

        HashSet<String> duplicateStrings = new HashSet<>();

        for (String str : strings) {
            if (duplicateStrings.add(str)) {
                
            }
        }
        System.out.println("Duplicate Strings: " + duplicateStrings);
    }
}
