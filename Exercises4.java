public class Exercises4 {

    static int isZeroPlentiful(int[] a){
        if (a.length<4)
                return 0;
        int zeros=0;
        int zeroSequences=0;
        for(int i=0;i<a.length;i++){

            if(a[i]==0)
                zeros++;
            else
                zeros=0;
           if(i<a.length-1)
               if(zeros>=4 && a[i]!=a[i+1])
                  zeroSequences++;

        }

        if(zeros>=4)
            zeroSequences++;
        System.out.println(zeros);
        return zeroSequences;

    }

    static int isDigitIncreasing(int n){
        int totaldigits=0;
        int originaln=n;
        while(n!=0){
            totaldigits++;
            n/=10;
        }
        for(int i=1;i<9;i++){

            int sum=0;
            int num=0;
            for(int j=0;j<totaldigits;j++){
             num= num*10 + i;
             sum+=num;

            }
            if(sum==originaln)
              return 1;
        }
        return 0;
    }


    static int decodeArray(int[] a){
        int zeros=0;
        int num=0;

        for(int i=0;i<a.length;i++){
            if (a[i]==0) {

                zeros++;
            }
            else{
                num=num*10+zeros;
                zeros=0;
            }
        }
        if(a[0]==-1)
            num*=-1;
        return num;
    }
}

