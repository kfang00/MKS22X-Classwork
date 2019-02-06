import java.util.ArrayList;
public class Recursion {

  public static ArrayList<String> makeAllWords(int k, int maxLetter) {
    ArrayList<String> hold = new ArrayList<String>();
    return mAWH(k, maxLetter, "", hold);
  }

    private static ArrayList<String> mAWH(int k, int max, String word, ArrayList<String> data) {
      if (k == 0) {
        data.add(word);
      }
      if (k > 0) {
        for (int n = 0; n < max; n++) {
          return mAWH(k - 1, max, word + (char)n, data);
        }
      }
    return data;
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(1, 1)); 
    System.out.println(makeAllWords(1, 2));
    System.out.println(makeAllWords(1, 3));
    System.out.println(makeAllWords(1, 4));
    System.out.println(makeAllWords(1, 5));

  }
}
