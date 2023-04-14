public class Divisao extends Operacao{

    //Solução 1 - Calculando sem parâmetro
    public double calcula() {
        return Numero1 / Numero2;
    }

    //Solução 2 - Calculando com parâmetro
    public double calcula(int prm1, int prm2) {
        return prm1 / prm2;
    }
}
