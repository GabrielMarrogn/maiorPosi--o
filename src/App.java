import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maior = 0;
        int posicao = 0;
        for(int i = 1; i < 101; i++){
            int a = Integer.parseInt(br.readLine());
            if(i == 0){
                maior = a;
                posicao = i;
            }else if(a > maior){
                maior = a;
                posicao = i ;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);
    }
}
