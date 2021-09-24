public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        } else if (first < second){
            for (int i = first; i > 0; i--){
                if (first % i == 0){
                    if (second % i == 0){
                        return i;
                    }
                }
            }
        } else if (second < first){
            for (int j = second; j > 0; j--){
                if (second % j == 0){
                    if (first % j == 0){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}
