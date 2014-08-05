import java.util.*;

class Solution {
    	public int[] solution(int N, int[] P, int[] Q) { 
		boolean[] sieve = new boolean[N+1];
		Arrays.fill(sieve, Boolean.TRUE);
		sieve[0] = false;
		sieve[1] = false;
		for(int i=2; i<(int)(Math.sqrt(N)+1); i++) {
			if(sieve[i]) {
				for(int j=i+i; j<N; j+=i) {
					sieve[j] = false;
				}
			}
		}
		List<Integer> primes = new ArrayList<Integer>();
		for(int i=0; i<sieve.length; i++) {
			if(sieve[i]) {
				primes.add(i);
			}
		}
		int[] semiprimes = new int[N+1];
		int[] sp = new int[N+1];
		long semiprime = 0;
		for(int i=0; i<primes.size(); i++) {
		    for(int j=i; j<primes.size(); j++) {
		        semiprime = (long)primes.get(i)*(long)primes.get(j);
		        if(semiprime>N) {
		            break;
		        }
		        semiprimes[(int)semiprime] = 1;
		        sp[(int)semiprime] = 1;
		    }
		}
		for(int i=1; i<semiprimes.length; i++) {
		    semiprimes[i] += semiprimes[i-1];
		}
		int[] count = new int[Q.length];
		for(int i=0; i<Q.length; i++) {
		    count[i] = semiprimes[Q[i]] - semiprimes[P[i]] + sp[P[i]];
		}
		return count;
	}
}
