import java.util.Scanner;

public class ArvoreBinaria {
 
    public static int busca_binaria(int dado[],int x, int inferior,int superior){
        int meio;
        if(inferior>superior){
            return -1;
        }
        meio = (inferior + superior)/2;
        if(x == dado[meio]){
          return meio;
        }
        if(x<dado[meio]){
            return busca_binaria(dado,x,inferior,meio-1);
        }
        else{
            return busca_binaria(dado,x,meio+1,superior);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da lista em numeros inteiros: ");
        int tamanho;
        tamanho = scan.nextInt();
        
        int dado[] = new int[tamanho];
        for(int i =0;i<tamanho;i++){
            dado[i] = i+1;
        }
        
        System.out.println("Qual numero você deseja buscar? ");
        int valor;
        valor = scan.nextInt();
        
        int inf = 0;
        int sup = dado.length-1;
        int resultado = (busca_binaria(dado,valor,inf,sup));
        
        if(resultado == -1){
            System.out.println("O Número nao existe na lista");
        }
        else{
            System.out.println("Número encontrado, no indice: "+resultado);
        }
        
    }
    
}