import javax.print.DocFlavor;

public class Exercises6 {

    static int isSystematicallyIncreasing(int[] a){

        int i=0;
        int cont=1;
        while(i<a.length){
            int number=1;
            int j=0;
            while(j<cont){
                if(a[i]!=number)
                    return 0;
                number++;
                i++;
                j++;
            }
            cont++;
        }
        return 1;
    }

    static int isFactorialPrime(int n){
        if(n<=1 || !isPrime(n))
            return 0;

        for(int i=1;i<n;i++){
            if(n==factorial(i)+1)
                return 1;
        }
        return 0;
    }

    static int factorial(int n){
        if (n==1)
            return 1;
        return n*factorial(n-1);
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

    static int largestDifferenceOfEvens(int[] a){
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]%2==0 && a[j]%2==0 && a[i]-a[j]>sum)
                    sum=a[i]-a[j];

            }
        }
        if(sum==Integer.MIN_VALUE)
            return -1;

        return sum;
    }
}
