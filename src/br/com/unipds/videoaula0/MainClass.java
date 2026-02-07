package br.com.unipds.videoaula0;



public class MainClass {
    public static void main(String[] args) {

        ContaBancaria c1, c2;

        c1 = new ContaBancaria(123,"Isidro");
        c2 = new ContaEspecial(124,"Jose",200);

        c1.creditar(100);
        c2.creditar(100);

        IO.println(c1);
        IO.println(c2);

        if (c2.debitar(150)) {
            IO.println("Debito efetuado");
            IO.println(c2);
        }
        else {
            IO.println("Saldo insuficiente para conta "+c2.getNumero());
        }
    }
}
