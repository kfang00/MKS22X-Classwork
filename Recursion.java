import java.util.ArrayList;
public class Recursion {

  public static ArrayList<String> makeAllWords(int k, int maxLetter) {
    ArrayList<String> hold = new ArrayList<String>();
    return mAWH(k, maxLetter, "", hold);
  }

    private static List<String> mAWH(int k, int max, String word, List<String> data) {
      if (k = 0) {
        data.add(word)
      }
      if (k > 0) {
        for (int n = 0; n < max; n++) {
          return mAWH(k - 1, max, word + (char)n, data);
        }
      }
    return data;
  }
}
