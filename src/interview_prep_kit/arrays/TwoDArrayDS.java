package interview_prep_kit.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> hourglassSums = new ArrayList<>(16);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int sum = arr.get(j).get(i) + arr.get(j).get(i + 1) + arr.get(j).get(i + 2) //sum of 1st row
                        + arr.get(j + 1).get(i + 1) // sum of 2nd row
                        + arr.get(j + 2).get(i) + arr.get(j + 2).get(i + 1) + arr.get(j + 2).get(i + 2); //sum of 3rd row
                hourglassSums.add(sum);
            }
        }
        return hourglassSums.stream().mapToInt(Integer::intValue).max().orElseThrow(NoSuchElementException::new);
    }

}

public class TwoDArrayDS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
