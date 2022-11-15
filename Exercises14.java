public class Exercises14 {

    static double eval(double x,int[] a){

        double eval = 0;
        for(int i=0;i<a.length;i++){
            eval=eval+a[i]*Math.pow(x,i);
        }
        return eval;
    }

    static int isAllPossibilities(int[] a){
        if(a.length==0)
            return 0;
        for(int i=0;i<a.length;i++){
            boolean flag=false;
            for(int j=0;j<a.length;j++){
                if(a[j]==i)
                    flag=true;
            }
            if(!flag)
                return 0;
        }
        return 1;
    }

    static int isLayered(int[] a){
        int cont=1;
        for(int i=0;i<a.length-1;i++){
           if(a[i+1]==a[i])
               cont++;
           if(a[i+1]<a[i])
               return 0;
           if(a[i]>a[i+1]){
               if(cont<2)
                   return 0;
               cont=1;
           }
        }
        return 1;
    }
}
