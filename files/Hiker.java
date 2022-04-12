
public class Hiker {

    public static int answer() {
        return 6 * 7;
    }

    public static int minimumValue(int[] sequence) {
        int min = Integer.MAX_VALUE;
        for(int i : sequence ){
            if( i < min) {
                min = i;
            }
        }
        return min;
    }
}
