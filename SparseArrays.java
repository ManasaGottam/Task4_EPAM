package Epam;import java.io.*;
import java.util.*;

public class SparseArrays {
static int[] matchingStrings(String[] strings, String[] queries) {
  HashMap<String,Integer> h=new HashMap<>();
  int res[]=new int[queries.length];
  for(int i=0;i<strings.length;i++) {
    if(h.containsKey(strings[i])) {
      h.put(strings[i],h.get(strings[i])+1);
    }
    else {
      h.put(strings[i],1);
    }
  }

  for(int i=0;i<queries.length;i++) {
    if(h.containsKey(queries[i])) {
      res[i]=h.get(queries[i]);
      //System.out.println(h.get(queries[i]));
    }
    else {
      res[i]=0;
    }
  }
  return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
