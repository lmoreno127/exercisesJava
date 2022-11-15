public class Exercises {

    static int exercise1(int [] arr ){
        int alength=arr.length;
        if(alength%2==0)
            return 0;
        int middle=arr[alength/2];
        for(int i=0;i<alength;i++){
           if(middle>=arr[i] && i!=alength/2)
               return 0;
        }
       return 1;
    }

    static int f(int [] a){
        int X=0;
        int Y=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                Y+=a[i];
            else
                X+=a[i];
        }

        return X-Y;
    }

    static char[] f(char[]a,int start,int len){
        if(start+len > a.length || start<0 || len<0)
            return null;
        char[] sol=new char[len];
        for(int i=0;i<len;i++){
            sol[i]=a[start+i];
        }
        return sol;
    }

    static int f(int n){
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        return reverse;
    }
    static void r(int n){
        if(n==0) {
            return;
        }
        System.out.print(n%10);
       r(n/10);

    }
    static int[] f(int[] first,int[] second){
        if(first==null || second==null)
            return null;
        int len= first.length>second.length ? first.length : second.length;
        int[] duplicates1 = new int[len];
        int indx=0;
        for(int i=0;i<first.length;i++){
            for(int j=0;j<second.length;j++){
                if(first[i]==second[j]){
                   duplicates1[indx]=first[i];
                   indx++;
                }
            }
        }
        int [] duplicates2=new int[indx];
        for(int i=0;i<indx;i++)
            duplicates2[i]=duplicates1[i];

        return duplicates2;
    }
}
