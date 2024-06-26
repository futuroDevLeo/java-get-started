// # Exercício 6

// Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
// representando o preço original de um produto. Em seguida, declare uma variável do tipo double
// percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

package exercises;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 199.9;
        int percentualDesconto = 10;
        double precoComDesconto = precoOriginal - (precoOriginal * (double) percentualDesconto / 100);
        System.out.println(
                String.format(
                        "O Preço original do produto é %.2f Reais, com o desconto de %d%% esse valor fica: %.2f Reais",
                        precoOriginal, percentualDesconto, precoComDesconto));
    }
}
