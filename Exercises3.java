public class Exercises3 {

    static void doIntegerBasedRounding(int[] a, int n){
        if(n <= 0) return;
        for(int i = 0;i<a.length;i++){
            if(a[i] >= 0){
                int lower = (a[i]/n)*n;
                int upper = lower +n;
                int middleElement = n%2==0 ? lower + n/2 : lower + n/2 +1;
                if(a[i] >= middleElement)
                    a[i] = upper;
                else
                    a[i] = lower;
            }
        }
    }

    static int isCubePowerful(int n){
        if(n<=0)
            return 0;
      int sum=0;
      int originaln=n;
      while(n!=0){
          int digit = n%10;
          sum+=Math.pow(digit,3);
          n/=10;
      }

      return originaln == sum ? 1 : 0;
    }

    static int decodeArray(int[] a){
        int sign = a[0]>= 0 ? 1 : -1;
        int number=0;
        for(int i=0;i<a.length-1;i++){
           number=number*10+Math.abs(a[i]-a[i+1]);
        }
        number*=sign;
        return number;
    }
}
