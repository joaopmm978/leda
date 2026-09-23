package recursividade;
import java.util.Arrays;

public class Recursividade {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println("Soma dos elementos do array: " + somaArrayAteTamanho(nums, nums.length));
        //System.out.println("Média dos elementos do array: " + mediaArray(nums, nums.length));
        System.out.println("Soma das médias dos elementos do array: " + Arrays.toString(mediaSomaArray(nums, 0)));
    }

    /*public static int somaArrayAteTamanho(int[] arr, int length) {
        int soma;
        if (length == 0) {
            soma = 0; // Caso base: soma de um array vazio é 0
        } else {
            soma = arr[length - 1] + somaArrayAteTamanho(arr, length - 1); // Chamada recursiva
        }
        return soma;
    }*/

    /*public static double mediaArray(int[] arr, int length) {
        if (length == 0) {
            return 0; 
        } else {
            return (double) somaArrayAteTamanho(arr, length) / length; 
        }
    }*/

    public static double somaMediaArray(int[] arr, int length){
        double result = 0;
        double soma;

        if(length == 0){
            soma = arr[0];
        }
        else{
            soma = arr[length] + somaMediaArray(arr, length - 1);
            result = (double) soma/length;
        }

        return result;

    }

    public static double[] mediaSomaArray(int[] arr, int idx) {
        double[] results = new double[arr.length];
        
        if(idx < arr.length){
            results[idx] = (double) somaVetor(arr, 0, idx)/ (idx + 1);
        }

        return results;

        /*for(int i = 0; i < arr.length; i++){
           int soma = 0;
            for(int j = 0; j <= i; j++){
                soma += arr[j];
                
            }
            results[i] = (double) soma/(i+1);
        }*/
        //return results;
    }

    private static double somaVetor(int[] arr, int ini, int last) {
        int soma = 0;
        if(ini < last){
            soma += somaVetor(arr, ini + 1, last);
        }
        soma = arr[last];
        return soma;


    }
}
