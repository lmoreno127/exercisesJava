public class Exercises11 {

    static int isNPrimeable(int[] a, int n){
        int result = 1;

        for(int i=0;i<a.length && result==1;i++){
            if(!isPrime(a[i]+n))
                result=0;
        }
        return result;
    }

    static int is121Array(int[] a){
       int result=1;
       int bones=0;
       int eones=0;
       boolean flag=true;

       for(int i=0;i<a.length && result==1;i++){
           if(a[i]!=1 && a[i]!=2)
               result=0;
           else
               if(a[i]==1 && flag)
                  bones++;
               else
                 if(a[i]==2)
                     flag=false;
                 else
                     if(a[i]==1)
                         eones++;
       }
        if(a[a.length-1]!=1)
            result=0;
       if(bones!=eones )
           result=0;
       else
           if(bones==0)
               result=0;
       return result;
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

    static  int[] pairwiseSum(int[] a){
        if(a.length==0 || a.length%2!=0)
            return null;

        int[] pairwiseSum=new int[a.length/2];
        int j=0;
        for(int i=0;i<a.length;i+=2){
            pairwiseSum[j]=a[i]+a[i+1];
            j++;
        }
        return  pairwiseSum;
    }
}
