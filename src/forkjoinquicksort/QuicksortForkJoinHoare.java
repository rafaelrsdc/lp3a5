package forkjoinquicksort;

//GitHub: HenriqueIni
//https://www.blogcyberini.com/
import java.util.concurrent.RecursiveAction;

public class QuicksortForkJoinHoare extends RecursiveAction {
    private int[] array; //array que ser� ordenado
    private int inicio; //�ndice de in�cio
    private int fim; //�ncide do fim

    //ordena o subarray do �ndice 'inicio' at� 'fim'
    public QuicksortForkJoinHoare(int[] array, int inicio, int fim){
        this.array = array;
        this.inicio = inicio;
        this.fim = fim;
    }
    //ordena o array por completo
    public QuicksortForkJoinHoare(int[] array){
        this(array, 0, array.length - 1);
    }
    //executa o Quicksort paralelamente com Fork-Join
    @Override
    protected void compute() {
        if(inicio < fim){
            int q = partition(array, inicio, fim); //obt�m o piv� (join)
            //realiza as chamadas recursivas paralelamente (fork)
            invokeAll(new QuicksortForkJoinHoare(array, inicio, q - 1),
                      new QuicksortForkJoinHoare(array, q + 1, fim));
        }
    }
    //M�todo de parti��o
    private static int partition(int[] A, int inicio, int fim){
        //o pivo � o elemento inicial
        int pivo = A[inicio];
        //�ndice i ir� percorrer o array da esquerda para a direita
        int i = inicio + 1;
        //�ndice j ir� percorrer o array da direita para a esquerda
        int j = fim;

        //O loop ir� parar quando os �ndices se ultrapassarem
        while(i <= j){
            /*
             * Este la�o ir� parar quando encontrar algum elemento
             * � esquerda que � maior que o piv�, pois ele deveria estar na
             * parti��o direita
             */
            while(i <= j && A[i] <= pivo){
                i = i + 1;
            }
            /*
             * Esse la�o ir� parar quando encontrar algum elemento
             * � direira que � menor ou igual ao piv�, pois ele deveria estar na
             * parti��o esquerda
             */
            while(i <= j && A[j] > pivo){
                j = j - 1;
            }

            //se os �ndices n�o ultrapassarem, troca-os de posi��o
            if(i < j){
                swap(A, i, j);
            }
        }
        //coloca o piv� na posi��o de ordena��o
        swap(A, inicio, j);
        return j; //retorna a posi��o do piv�
    }

    //m�todo auxiliar para realizar as trocas de elementos
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}