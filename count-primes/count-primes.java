class Solution {
    public int countPrimes(int n) {
        int answer = 0;
        boolean[] primes = new boolean[n];
        for(int i=2; i<n; i++) {
            if(primes[i]) {
                continue;
            }
            answer++;
            for(int j=2*i;j<n;j+=i) {
                primes[j] = true;
            }
        }
        return answer;
    }
}