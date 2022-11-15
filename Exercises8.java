public class Exercises8 {

    static int isVesuvian(int n){
        int cont=0;
        for(int i=1;i*i<n;i++){
            for(int j=1;j*j<n;j++){
                int sum=i*i+j*j;
                if(sum==n){
                    cont++;
                }
            }
        }

        if(cont>=2)
            return 1;
        return 0;
    }

    static int isOneBalanced(int[] a){
        int firstones=0;
        int endones=0;
        int noones=0;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=1 ){
                flag=true;
                noones++;
            }
            else
                if (flag){
                  endones++;
                }
                else
                {
                   firstones++;
                }




        }
        if(firstones+endones==noones)
            return 1;
        return 0;
    }

    static int isFibonacci(int n){
        if(n==1)
            return 1;
        int previous=1;
        int current=1;
        while(current<n){
            int sum = previous+current;
            if(sum==n)
                return 1;
            previous=current;
            current=sum;
        }
        return 0;
    }
}
