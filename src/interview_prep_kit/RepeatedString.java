package interview_prep_kit;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        long numOfS = n / s.length();
        long rest = n % s.length();

        if (!s.contains("a")) return 0;
        return s.length() > n ? charCounter(s, rest)
                : numOfS * charCounter(s, s.length()) + charCounter(s, rest);
    }

    private static long charCounter(String s, long end) {
        return s.chars().limit(end).filter(c -> c == 'a').count();
    }

    }

    public class RepeatedString {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            long n = Long.parseLong(bufferedReader.readLine().trim());

            long result = Result.repeatedString(s, n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
