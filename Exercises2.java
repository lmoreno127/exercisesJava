public class Exercises2 {

    static int largestPrimeFactor(int n) {
        int largest = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i) && i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    static int[] encodeNumber(int n) {
        if (n <= 1)
            return null;
        int[] solution1 = new int[n / 2];
        int num = 2;
        int idx = 0;
        while (n != 1) {
            while (n % num == 0) {
                solution1[idx] = num;
                idx++;
                n /= num;
            }
            num++;
        }
        int[] solution2 = new int[idx];
        for (int i = 0; i < idx; i++)
            solution2[i] = solution1[i];
        return solution2;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
        int i=0;
        int k=0;
        int matches = 0;
        for(i=0;i<len;i++){
            if(a[i]==pattern[k])
                matches++;
            else
                if(matches == 0 || k==patternLen-1)
                    return 0;
                else{
                 k++;
                 matches=0;
                 if(a[i]==pattern[k])
                     matches++;
                 else
                     break;
                }
        }
        if(i==len && k==patternLen-1)
            return 1;
        else
            return 0;
    }

}
