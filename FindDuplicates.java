import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 10, 40, 20, 50};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Original Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Duplicate values: " + duplicates);
    }
}
