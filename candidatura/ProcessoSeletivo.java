package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = {"Ana", "Beatriz", "Camila", "Diana", "Eloisa"};

        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }

//        imprimirSelecionados();

//        selecaoCandidatos();

//        analisarCandidato(1900.00);
//        analisarCandidato(2200.00);
//        analisarCandidato(2000.0);
    }

    //Método Auxiliar
    static boolean  atender(){
        return new Random().nextInt(3) == 1 ;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas ++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO !");
            }

        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
        }

    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Ana", "Beatriz", "Camila", "Diana", "Eloisa"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento:");

        for (int indice=0; indice <candidatos.length; indice++){
            System.out.println("O candidato de nº " + indice + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Ana", "Beatriz", "Camila", "Diana", "Eloisa", "Fabiana", "Giulia","Helena", "Isabela", "Juliana"};
        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O(A) candidato(a) " + candidato + " solicitou este valor de salario " + salarioPretendido );
            if (salarioBase >= salarioPretendido){
                System.out.println("O(A) candidato(a) " + candidato + " foi selecionado(a) para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
     static  double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
     }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if ( salarioBase ==  salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
        } else {
            System.out.println("AGUARDANDO  O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
