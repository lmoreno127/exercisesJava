public class Exercises10 {

    static int[] computeHMS(int seconds){
        int[] hms= new int[3];
        hms[0]=seconds/3600;
        int module = seconds % 3600;
        hms[1]=module / 60;
        hms[2]=module % 60;
        return hms;
    }

    static int isMartian(int[] a){

        int ones=0;
        int twos=0;
        for(int i=0;i<a.length;i++){
            if(i<a.length-1){
                if(a[i]==a[i+1])
                    return 0;
            }
            if(a[i]==1)
                ones++;
            if(a[i]==2)
                twos++;

        }
        if(ones>twos)
            return 1;
        return 0;
    }

    static int isPairedN(int[] a, int n){
        for(int i=0;i<a.length-1;i++){
          for(int j=i+1;j<a.length;j++){
              int sum1 = a[i]+a[j];
              int sum2 = i+j;
              if(sum1 == n && sum2 == n)
                  return 1;
          }
        }
        return 0;
    }
}
