public class Fatorial extends Operacao{

    public double calcula() {
        long fatorial = 1;
        int i = 1;
        while (i <= Numero1) {
            fatorial = fatorial * i;
            i++;
        }
        return fatorial;
    }

    //Solução 2 - Calculando com parâmetro
    public double calcula(int prm1, int prm2) {
        long fatorial = 1;
        int i = 1;
        while (i <= prm1) {
            fatorial = fatorial * i;
            i++;
        }
        return fatorial;
    }

}
