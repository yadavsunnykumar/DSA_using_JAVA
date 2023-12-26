package Array;

public class XORedArray {
    public int[] decode(int[] encoded, int first) {
        int arr[] = new int[encoded.length +1];
        arr[0] = first;
        int index = 0;
        for(int i=0;i<encoded.length;i++){
            int ans = arr[index++]^encoded[i];
            arr[index] = ans;
        }
        return arr;

        
    }
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        XORedArray m = new XORedArray();
        int a[]  = m.decode(encoded,first);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

        
    }
}
