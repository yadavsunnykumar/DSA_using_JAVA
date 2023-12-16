package Array;

public class MaxWordInSentence {
    // public int mostWordsFound(String[] sentences) {
    // int count = 0;
    // int res = 0;
    // for (int i = 0; i < sentences.length; i++) {
    // for (int j = 0; j < sentences.length; j++) {
    // String[] str = sentences[i].split(" ");
    // count = str.length;
    // res = Math.max(res, count);
    // }
    // }
    // return res;
    // }
    public int mostWordsFound(String[] sentences) {

        int res = 0;
        for (int i = 0; i < sentences.length; i++) {
            int strLen = sentences[i].split(" ").length;
            res = Math.max(res, strLen);
        }
        return res;
    }

    public static void main(String[] args) {
        MaxWordInSentence mwis = new MaxWordInSentence();
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int x = mwis.mostWordsFound(sentences);
        System.out.println(x);

    }
}
