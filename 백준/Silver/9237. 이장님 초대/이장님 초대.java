import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i <N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int seed = 0;
        int res = 0;
        for(int i = arr.length-1; i >= 0; i--){
            seed += 1;
            if(seed+arr[i] > res){
                res += seed+arr[i] - res;
            }
        }

        System.out.println(res+1);


    }
}
