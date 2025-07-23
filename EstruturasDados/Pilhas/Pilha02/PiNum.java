import java.util.Stack;

public class PiNum {
    int[] num;
    int tamanho = 3;
    int posicao;

     public PiNum() {
         this.num = new int[tamanho];
         this.posicao = -1; // Começa com -1 pois é necessário para validação
     }

     public void Add(int n) {
         posicao++; // Manda o indice para 0 pois é ai que ele começa
         num[posicao] = n; // a variável n vai ser adiconada no indice 0
         System.out.println("Adicionou: " + n);
     }

     public int Retirar(){
         return num[posicao--];

     }

     public void Consulta() {
         int p = num[posicao];
         System.out.println(p);
     }

    public static void main(String[] args) {

         PiNum p = new PiNum();

         p.Add(2);
         p.Add(8);
         p.Add(4);

         p.Retirar();


         p.Consulta();


    }
}
