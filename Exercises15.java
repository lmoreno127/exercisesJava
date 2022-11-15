import java.util.Arrays;

public class Exercises15 {

    static void updateMileageCounter(int[] a , int miles ){
        for (int i = 0; i < a.length && miles > 0; i++) {
            miles = a[i] + miles;
            if (miles > 9) {
                int tempMiles = miles % 10;
                miles /= 10;
                a[i] = tempMiles;
            } else {
                a[i] = miles;
                miles = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static int isHollow(int[] a){
        int precnonzeros=0;
        int zeros=0;
        int follnonzeros=0;
        int i=0;
        while(a[i]!=0){

            precnonzeros++;
            i++;
        }
        System.out.println(a.length);
        while(a[i]==0 ){
            System.out.println("dadad");
            zeros++;
            i++;
            if(i==a.length)
                break;
        }
        while(i<a.length){
            follnonzeros++;
            i++;
        }
        if(follnonzeros==precnonzeros && zeros>=3)
            return 1;
        return 0;
    }
    static int isConsectiveFactored(int n){
        if(n<0)
            return 0;
        boolean hasFactors=false;
        int j=0;
        for(int i=2;i<n;i++){

           if(n%i ==0 && i==j+1 && j>1){
             return 1;
           }
           if(n%i==0)
               j=i;
        }
        return 0;
    }

    static int isTwinPrime(int n){
        if(!isPrime(n))
            return 0;
        if(isPrime(n+2) || isPrime(n-2))
            return 1;

        return 0;
    }

    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }


}
