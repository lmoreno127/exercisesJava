import java.util.HashMap;
import java.util.Set;

public class Exercises7 {

    static int isHodder(int n){
      if(!isPrime(n))
          return 0;

      for(int i=2;i<n;i++){
          int form= (int)Math.pow(2,i)-1;
          if(n==form)
              return 1;
      }
      return 0;
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

    static int areAnagrams(char[] a1,char[] a2){
        HashMap<Character,Integer> chars= new HashMap<>();
        for(int i=0;i<a1.length;i++){

            if(chars.containsKey(a1[i])){
                int value= chars.get(a1[i]);
                chars.replace(a1[i],value++);
            }
            else{
                chars.put(a1[i],1);
            }
        }
        HashMap<Character,Integer> chars1= new HashMap<>();
        for(int i=0;i<a2.length;i++){

            if(chars1.containsKey(a2[i])){
                int value= chars1.get(a2[i]);
                chars1.replace(a2[i],value++);
            }
            else{
                chars1.put(a2[i],1);
            }
        }

        Set<Character> keys= chars.keySet();
        for(Character ch:keys){
            if(chars1.containsKey(ch)){
               if(chars.get(ch)!=chars1.get(ch))
                   return 0;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    static int closestFibonacci(int n){
        int previous=1;
        int current=1;
        int sum;
        while(current<n){
            sum=previous+current;
            previous=current;
            current=sum;

        }
        return previous;
    }
}
