public class Exercises9 {

    static int isTriangular(int n){
        int sum=0;
        if(n==1)
            return 1;
        for(int i=1;i<n;i++){
          sum+=i;
          if(sum==n)
              return 1;
        }
        return 0;
    }

    static int isMercurial(int[] a){
        int indx1=-1;
        int indx3=-1;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==1)
                indx1 = i;
            else
               if(a[i]==3)
                indx3 = i;

            if(indx1!=-1 && indx3>indx1)
               flag=true;

            if(flag && a[i]==1)
              return 0;

        }
        return 1;
    }

    static int is235array(int[] a){
        int cont2=0;
        int cont3=0;
        int cont5=0;
        int contnd235=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                cont2++;
            if(a[i]%3==0)
                cont3++;
            if(a[i]%5==0)
                cont5++;
            if(a[i]%2!=0)
                if(a[i]%3!=0)
                    if(a[i]%5!=0)
                        contnd235++;
        }

        if(cont2+cont3+cont5+contnd235==a.length)
            return 1;
        return 0;

    }
}
