package chip;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        int MAX = 100000;
        int[] prime = new int[MAX+1];
        prime[2] = 1;
        for (int p=4; p<=MAX; p+=2) {
            prime[p]++;
        }
        for (int p=3; p<MAX; p+=2) {
            if (prime[p] == 0) {
                for (int x=p; x<=MAX; x+=p) {
                    prime[x]++;
                }
            }
        }
        int max = 0;
        for (int p=2; p<=MAX; p++) {
            max = Math.max(prime[p], max);
        }
        int[][] kprimes = new int[6][MAX+1]; 
        for (int p=2; p<=MAX; p++) {
            int k = prime[p];
            for (int i=0; i<6; i++) {
                kprimes[i][p] = kprimes[i][p-1];
            }
            kprimes[k-1][p]++;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(s);
        for (int t=0; t<T; t++) {
            s = reader.readLine();
            int index = s.indexOf(' ');
            int A = Integer.parseInt(s.substring(0,index));
            s = s.substring(index+1);
            index = s.indexOf(' ');
            int B = Integer.parseInt(s.substring(0, index));
            int K = Integer.parseInt(s.substring(index+1));
            result.append(kprimes[K-1][B]-kprimes[K-1][A-1]).append("\n");
        }
        System.out.print(result);
    }
    
}
 
