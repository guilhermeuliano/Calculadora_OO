public class Operacao {

    protected int Numero1;
    protected int Numero2;

    public int getNumero1() {
        return Numero1;
    }

    public void setNumero1(int numero1) {
        Numero1 = numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int numero2) {
        Numero2 = numero2;
    }

    //Solução 1 - Calculando sem parâmetro
    public double calcula() {
        System.out.println("Não será possível calcular!");
        return -1;
    }

    //Solução 2 - Calculando com parâmetro
    public double calcula(int prm1, int prm2) {
        System.out.println("Não será possível calcular!");
        return -1;
    }
}
