public class Exponenciacao extends Operacao{

    //Solução 1 - Calculando sem parâmetro
    public double calcula() {
        return Math.pow(Numero1, Numero2);
    }

    //Solução 2 - Calculando com parâmetro
    public double calcula(int prm1, int prm2) {
        return Math.pow(prm1, prm2);
    }
}
