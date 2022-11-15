import java.util.ArrayList;

public class Exercises5 {

    static int isOnionArray(int[] a){
        int k=a.length-1;
        int j=0;
        if (a.length==0)
            return 1;
        while(j!=k){
            if(a[j]+a[k]>10)
                return 0;
            k--;
            j++;
        }
        return 1;
    }
    static int isPrimeHappy(int n){
        if(n<=2)
            return 0;
        int sum=0;
        for(int i=2;i<n;i++){
          if(isPrime(i)){
              sum+=i;
          }
        }
        if(sum%n==0)
            return 1;
        return 0;
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

    static int[] encodeArray(int n){
        int len= n>0?0:1;
        int originaln=n;
        while(n!=0){

            int digit= n>=0?n%10:-(n%10);
            len+=digit+1;
            n/=10;
        }
        int[] encode=new int[len];
        int indx;
        if(originaln>0){
            indx=0;
        }
        else{
            indx=1;

            encode[0]=originaln==0?1:-1;
        }
        while(originaln!=0){
            int digit= originaln>=0 ? originaln%10:-(originaln%10);
            for(int i=0;i<digit;i++){
                encode[indx]=0;
                indx++;
            }
            encode[indx]=1;
            indx++;
            originaln/=10;
        }

        return encode;

    }
}
