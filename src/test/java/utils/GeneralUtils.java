package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneralUtils {

    public static Object convertToCommaSeperatedString(List list) {
        return list.stream().collect(Collectors.joining(","));
    }

    public static Object convertToCommaSeperatedString(Stream stream) {
        return stream.map(x -> x.toString()).collect(Collectors.joining("->"));
    }

    public static Object convertToCommaSeperatedString(int[][] multiInt) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] singleInt : multiInt) {
            stringBuilder.append(convertToCommaSeperatedString(Arrays.stream(singleInt).boxed()) + ",");
        }

        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

}
