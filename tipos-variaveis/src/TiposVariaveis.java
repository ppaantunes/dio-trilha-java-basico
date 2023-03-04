public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
            //tipos primitivos.
            //estudar a classe String que representa texto na aplicação.


        String meuNome = "PEDRO PAULO";

        double salarioMinimo = 1300;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; 
            // O cast realizado acima (short) é uma adaptação, pega um tipo mais abrangente e transforma em um tipo correspondente,
            // melhor evitar esse recurso pois pode afetar em uma altereção de um valor com precisão maior para menor,
            // pode acontecer algo inesperado, melhor evitar essa prática.

        int numero = 1;
        
        numero = 2; 
            // No caso podemos alterar o valor das variáveis, caso nunca possa ser mudado usaremos de uma variável com a indicação de constante = final
            // e escrita em CAIXA ALTA, porém devemos atentar de colocar a constante final, pois só a caixa alta não representa uma constante.

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
            // Compreendemos agora que na declaração de uma variável como uma constante, ou seja que não poderá sofrer alteração, utilizamos a palavra final,
            // que por convenção deverá ser escrita toda em caixa alta, como explicito acima no VALOR_DE_PI.



    }
}
