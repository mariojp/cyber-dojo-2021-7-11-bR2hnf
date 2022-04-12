
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

    public static int numberOfElements(int[] sequence) {
        return sequence.length;
    }

    public static double averageValue(int[] sequence) {
        double sum = 0;
        for(int i : sequence ){
            sum += i;
        }
        return sum/sequence.length;
    }
}
