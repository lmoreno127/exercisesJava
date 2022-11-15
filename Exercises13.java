import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Exercises13 {

    static int allValuesTheSame(int[] a){
        for(int i=0;i<a.length-1;i++)
            if(a[i]!=a[i+1])
                return 0;
        return 1;
    }

    static int hasNValues(int[] a, int n){
        Set<Integer> set= new HashSet<Integer>();

        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        if(set.size()==n)
            return 1;
        return 0;
    }

    static int sameNumberOfFactors(int n1,int n2){
        if(n1<0 || n2<0)
            return -1;
       int factorsn1=0;
       int factorsn2=0;

       for(int i=1;i<=n1;i++)
           if(n1%i==0)
               factorsn1++;
       for(int i=1;i<=n2;i++)
           if(n2%i==0)
               factorsn2++;
       if(factorsn1==factorsn2)
           return 1;
       return 0;
    }
}
