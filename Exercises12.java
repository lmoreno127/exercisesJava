public class Exercises12 {
    static int isSquare(int n){
        for(int i=0;i<=n/2;i++){
            if(n==i*i)
                return 1;
        }
        return 0;
    }

    static int isComplete(int[] a){
        boolean hassquare=false;
        boolean haseven=false;
        for(int i=0;i<a.length;i++){
            if(isSquare(a[i])==1)
                hassquare=true;
            if(a[i]%2==0)
                haseven=true;
        }
        if(!haseven || !hassquare)
            return 0;
        boolean hassum8=false;
        for (int i=0;i<a.length-1;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]+a[j]==8)
                   hassum8=true;
           }
        }
        if(!hassum8)
            return 0;
        return 1;
    }

    static int loopSum(int[] a ,int n){
        int i=0;
        int j=0;
        int sum=0;
        while(i<n){
            while(j<a.length && i<n){
                sum+=a[j];
                j++;
                i++;
            }
            if(i<n)
                j=0;
        }
        return sum;
    }
}
