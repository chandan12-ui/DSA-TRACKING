import java.util.*;
class Solution {
    public int countPrimes(int n) {
        // int count=0;
        // for(int i=2;i<n;i++){
        //     boolean isPrime=true;
        //     for(int j=2;j*j<=i;j++){
        //         if(i%j==0){
        //             isPrime=false;
        //             break;
        //         }

        //     }
        //     if(isPrime){
        //         count++;
        //     }
            
        // }
        // return count;
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }

            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
        
    }
}