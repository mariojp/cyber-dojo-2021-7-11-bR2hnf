
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

    public static int maximumValue(int[] sequence) {
        int max = Integer.MIN_VALUE;
        for(int i : sequence ){
            if( i > max) {
                max = i;
            }
        }
        return max;
    }
}
