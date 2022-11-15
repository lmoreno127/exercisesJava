public class Exercises1 {

    static int largestAdjacentSum(int[] a){
      int largestsum =Integer.MIN_VALUE;
      for(int i=0;i<a.length-1;i++){
          int sum= a[i]+a[i+1];
          if(sum>largestsum)
              largestsum=sum;
      }
      return largestsum;
    }

    static int checkContenatedSum(int n, int catlen){

        if(n==0 || (n<10 && catlen==1))
            return 1;

        if(n<10)
            return 0;

        int totalsum=0;
        int originalnumber=n;
        while(n!=0){
          int digit= n % 10;
          int sum=0;
          for(int i=0;i<catlen;i++)
              sum= sum*10 + digit;
          totalsum+=sum;
          n=n/10;
        }

        return originalnumber == totalsum ? 1 : 0;
    }

    static  int isSequencedArray(int[] a, int m, int n){
        if(a[0]!=m)
            return 0;
        for(int i=m;i<=n;i++){
            boolean isnumber=false;
            for(int j=0;j<a.length;j++){
               if(a[j]==i)
                   isnumber=true;
            }
            if(isnumber==false)
                return 0;
        }

        for(int i=0;i<a.length-1;i++)
            if(a[i]>a[i+1])
                return 0;
        return 1;
    }

}
