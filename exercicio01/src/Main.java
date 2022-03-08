import banco.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc01;

        // MÉTODO CONSTRUTOR
        cc01 = new ContaCorrente(8532, "Alex Green", 500);
        cc01.imprimir();

        System.out.println("\n");

        cc01.entreValorDep();

        System.out.println("\n");

        cc01.dadosAtualizados();
        cc01.entradaSaque();

        System.out.println("\n\n");

        System.out.println("Dados Atualizados: \n");
        cc01.dadosAtualizados1();
    }
}
