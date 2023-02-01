package smallest_integer_finder;

import java.util.Arrays;
import java.util.OptionalInt;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int[] result = args;
//        OptionalInt min = Arrays.stream(result).sorted().findFirst();
        OptionalInt min = Arrays.stream(result).min();
        return min.getAsInt();

    }
}