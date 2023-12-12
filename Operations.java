/**
 * Operations
 */
public class Operations {
    // public int finalValueAfterOperations(String[] operations) {
    // int X = 0;
    // for (int i = 0; i < operations.length; i++) {
    // if (operations[i] == "X++" || operations[i] == "++X") {
    // X = X + 1;
    // } else {
    // X = X - 1;
    // }
    // }
    // return X;
    // }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.charAt(1) == '-') {

                x--;
            } else {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] testArray = { "++X", "++X", "X++" };
        Operations o = new Operations();
        int x = o.finalValueAfterOperations(testArray);

        System.out.println(x);
    }
}