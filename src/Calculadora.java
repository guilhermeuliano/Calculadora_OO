import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a operação (1- Adição, 2- Subtração, 3- Multiplicação, 4- Divisão,  5- Exponenciação, 6- Fatorial):");
        int tipo = teclado.nextInt();
        System.out.println("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();
        int valor2 = 0;
        if (tipo != 6) {
            System.out.println("Digite o segundo valor: ");
            valor2 = teclado.nextInt();
        }
        teclado.close();

        //Procrssamento sem orientação a objetos - Nivel 1
        System.out.println("*** Operação nível 1 ***");
        switch (tipo) {
            case 1: System.out.println("Adição = " + (valor1 + valor2)); break;
            case 2: System.out.println("Subtração = " + (valor1 - valor2)); break;
            case 3: System.out.println("Multiplicação = " + (valor1 * valor2)); break;
            case 4: System.out.println("Divisão = " + (valor1 / valor2)); break;
            case 5: System.out.println("Exponenciação = " + Math.pow(valor1, valor2)); break;
            case 6:
                long fatorial = 1;
                int i = 1;
                while (i <= valor1) {
                    fatorial = fatorial * i;
                    i++;
                }
                    System.out.println("Fatorial = " + fatorial); break;
            default: System.out.println("Operação inválida!");
        }
        System.out.println("");
        //Processamento com orientação a objetos - Nível 2 - Usando o set Numero1 e set Numero2 para a operação sem parametro funcionar!
        Operacao operacaoNivel2;
        System.out.println("*** Operação nível 2 ***");
        switch (tipo) {
            case 1: operacaoNivel2 = new Adicao();
                    operacaoNivel2.setNumero1(valor1);
                    operacaoNivel2.setNumero2(valor2);
                    System.out.println("Adição = " + operacaoNivel2.calcula());
                    break;
            case 2: operacaoNivel2 = new Subtracao();
                    operacaoNivel2.setNumero1(valor1);
                    operacaoNivel2.setNumero2(valor2);
                    System.out.println("Subtração = " + operacaoNivel2.calcula());
                    break;
            case 3: operacaoNivel2 = new Multiplicacao();
                    operacaoNivel2.setNumero1(valor1);
                    operacaoNivel2.setNumero2(valor2);
                    System.out.println("Multiplicação = " + operacaoNivel2.calcula());
                    break;
            case 4: operacaoNivel2 = new Divisao();
                    operacaoNivel2.setNumero1(valor1);
                    operacaoNivel2.setNumero2(valor2);
                    System.out.println("Divisão = " + operacaoNivel2.calcula());
                    break;
            case 5: operacaoNivel2 = new Exponenciacao();
                    operacaoNivel2.setNumero1(valor1);
                    operacaoNivel2.setNumero2(valor2);
                    System.out.println("Exponenciação = " + operacaoNivel2.calcula());
                    break;
            case 6: operacaoNivel2 = new Fatorial();
                    operacaoNivel2.setNumero1(valor1);
                    System.out.println("Fatorial = " + operacaoNivel2.calcula());
                    break;
            default: operacaoNivel2 = null;
                      System.out.println("Não foi possível identificar a operação desejada!");
        }
        System.out.println("");
        //Processamento com orientação a objetos - Nível 3 usando parâmetros no método - Não usará o set!
        Operacao operacaoNivel3;
        System.out.println("*** Operação nível 3 ***");
        switch (tipo) {
            case 1: operacaoNivel3 = new Adicao();
                System.out.println("Adição = " + operacaoNivel3.calcula(valor1, valor2));
                break;
            case 2: operacaoNivel3 = new Subtracao();
                System.out.println("Subtração = " + operacaoNivel3.calcula(valor1, valor2));
                break;
            case 3: operacaoNivel3 = new Multiplicacao();
                System.out.println("Multiplicação = " + operacaoNivel3.calcula(valor1, valor2));
                break;
            case 4: operacaoNivel3 = new Divisao();
                System.out.println("Divisão = " + operacaoNivel3.calcula(valor1, valor2));
                break;
            case 5: operacaoNivel3 = new Exponenciacao();
                System.out.println("Exponenciação = " + operacaoNivel3.calcula(valor1, valor2));
                break;
            case 6: operacaoNivel3 = new Fatorial();
                System.out.println("Fatorial = " + operacaoNivel3.calcula(valor1, valor2));
                break;
            default: operacaoNivel3 = null;
                System.out.println("Não foi possível identificar a operação desejada!");
        }
        System.out.println("");
        boolean queroTestarNivel4 = true;
        if (queroTestarNivel4 == true) {
            Operacao operacaoNivel4;
            System.out.println("*** Operação nível 4 ***");
            switch (tipo) {
                case 1: operacaoNivel4 = new Adicao(); break;
                case 2: operacaoNivel4 = new Subtracao(); break;
                case 3: operacaoNivel4 = new Multiplicacao(); break;
                case 4: operacaoNivel4 = new Divisao(); break;
                case 5: operacaoNivel4 = new Exponenciacao(); break;
                case 6: operacaoNivel4 = new Fatorial(); break;
                default: operacaoNivel4 = null;
                    System.out.println("Não foi possível identificar a operação desejada!");
            }
            //Saída
            System.out.println("Resultado = " + operacaoNivel4.calcula(valor1, valor2));
        }
    }
}