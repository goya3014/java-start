import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String x = br.readLine();

        for (char a :
                x.toCharArray()) {
            if(a < 91) arr[a-65]++;
            else arr[a-97]++;
        }

        int max = -1;
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                answer = (char)(i+65);
            }
            else if(arr[i] == max) answer = '?';
        }
        System.out.println(answer);
    }
}
