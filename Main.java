public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");

        //Nome da Faculdade
        System.out.println("UNIFAN - Centro Universitario Alfredo Nasser");

        //Nome do aluno
        System.out.println("Aluno: Kleber Freitas Martins");

        //Nome do professor
        System.out.println("Professor: Brenno Pimenta");

        //Fraze de boas vindas
        System.out.println("Aproveite o desafio de conhecimento!");
        System.out.println("Boa Sorte!");

        //Dizendo que será respondido 15 perguntas sobre Velozes e Furiosos
        System.out.println("O questionário e formado por 15 perguntas de multiplas escolhas.");

        System.out.println("-----------------------------------------------------------------");
//
//
        Questao q1 = new Questao();
        q1.pergunta = "01 - Em quantas partes são dividos o coração?";
        q1.opcaoA = "A) 2.";
        q1.opcaoB = "B) 4.";
        q1.opcaoC = "C) 5.";
        q1.opcaoD = "D) 1.";
        q1.opcaoE = "E) O coração não tem divisões!";
        q1.correta = "B";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);


//
        Questao q2 = new Questao();
        q2.pergunta = "02 - Qual o orgão responsável por filtrar o sague?";
        q2.opcaoA = "A) Pâncreas.";
        q2.opcaoB = "B) Fígado.";
        q2.opcaoC = "C) Ríns.";
        q2.opcaoD = "D) Medula.";
        q2.opcaoE = "E) Nenhum dos itens.";
        q2.correta = "C";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);


//


    }
}