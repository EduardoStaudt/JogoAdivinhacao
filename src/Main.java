import java.util.Scanner;

// Jogo de Adivinhação em Java
public class Main {
    public static void main(String[] args) {

        String n1 = "gato";
        String n2 = "cachorro";
        String n3 = "celular";
        String n4 = "coruja";
        String n5 = "pato";

        int tentativas1 = 3;
        int chance = 1;

        // Desenho de um gato
        String[] partesDesenho1 = {
                " /\\     /\\ ",
                "(  o   o  )",
                "  ==_==  ",
                "   /\\_/\\ "
        };
        // Desenho de um cachorro
        String[] partesDesenho2 = {
                "   _____   ",
                "  /     \\  ",
                " (  o o  ) ",
                "  \\_=_/   ",
                "   / \\    "
        };
        // Desenho de um celular
        String[] partesDesenho3 = {
                "  _______  ",
                " |       | ",
                " |       | ",
                " |_______| ",
                " |__|_|__| "
        };
        // Desenho de uma coruja
        String[] partesDesenho4 = {
                "  ,_,",
                " (O,O)",
                " (   )",
                "  \" \" "
        };
        // Desenho de um pato
        String[] partesDesenho5 = {
                " __",
                "<(o )___",
                " ( ._> /",
                "  `---'"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo Ao Jogo de Advinhacao em Java!");
        System.out.println("O jogo consiste vc tentar adivinhar o que eh o desenho.\n");

        // Desenho de um gato
        System.out.println("Nivel 1:");
        System.out.println("Desenho:");
        System.out.println(partesDesenho1[0]);
        System.out.println("O que eh o desenho acima? Digite sua resposta:");
        scanner.nextLine();
        // Verifica se a resposta do usuário está correta
        if (scanner.nextLine().equals(n1)) {
            System.out.println("Parabens, voce acertou!");
        } else {
            System.out.println("Resposta errada! Tente novamente.");
            System.out.println("Voce tem " + tentativas1 + " tentativas restantes.");
            if (tentativas1 < 1) {
                System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                return;
            }else{
                for (int i = 0; i <= chance; i++) {
                    System.out.println(partesDesenho1[i]);
                }
                tentativas1--;
                chance++;
                System.out.println("O que eh o desenho acima? Digite sua resposta:");
                scanner.nextLine();
            }
        }

        // Desenho de um cachorro
        int tentativas2 = 4;
        System.out.println("Nivel 2:");
        System.out.println("Desenho:");
        System.out.println(partesDesenho2[0]);
        System.out.println("O que eh o desenho acima? Digite sua resposta:");
        scanner.nextLine();
        // Verifica se a resposta do usuário está correta
        if (scanner.nextLine().equals(n2)) {
            System.out.println("Parabens, voce acertou!");
        } else {
            System.out.println("Resposta errada! Tente novamente.");
            System.out.println("Voce tem " + tentativas2 + " tentativas restantes.");
            if (tentativas2 < 1) {
                System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                return;
            }else{
                for (int i = 0; i <= chance; i++) {
                    System.out.println(partesDesenho2[i]);
                }
                tentativas2--;
                chance++;
                System.out.println("O que eh o desenho acima? Digite sua resposta:");
                scanner.nextLine();
            }
        }

        // Desenho de um celular
        int tentativas3 = 4;
        chance = 1;
        System.out.println("Nivel 2:");
        System.out.println("Desenho:");
        System.out.println(partesDesenho3[0]);
        System.out.println("O que eh o desenho acima? Digite sua resposta:");
        scanner.nextLine();
        // Verifica se a resposta do usuário está correta
        if (scanner.nextLine().equals(n3)) {
            System.out.println("Parabens, voce acertou!");
        } else {
            System.out.println("Resposta errada! Tente novamente.");
            System.out.println("Voce tem " + tentativas3 + " tentativas restantes.");
            if (tentativas3 < 1) {
                System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                return;
            }else{
                for (int i = 0; i <= chance; i++) {
                    System.out.println(partesDesenho3[i]);
                }
                tentativas3--;
                chance++;
                System.out.println("O que eh o desenho acima? Digite sua resposta:");
                scanner.nextLine();
            }
        }

        // Desenho de uma coruja
        int tentativas4 = 3;
        chance = 1;
        System.out.println("Nivel 2:");
        System.out.println("Desenho:");
        System.out.println(partesDesenho4[0]);
        System.out.println("O que eh o desenho acima? Digite sua resposta:");
        scanner.nextLine();
        // Verifica se a resposta do usuário está correta
        if (scanner.nextLine().equals(n4)) {
            System.out.println("Parabens, voce acertou!");
        } else {
            System.out.println("Resposta errada! Tente novamente.");
            System.out.println("Voce tem " + tentativas4 + " tentativas restantes.");
            if (tentativas4 < 1) {
                System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                return;
            }else{
                for (int i = 0; i <= chance; i++) {
                    System.out.println(partesDesenho4[i]);
                }
                tentativas4--;
                chance++;
                System.out.println("O que eh o desenho acima? Digite sua resposta:");
                scanner.nextLine();
            }
        }

        // Desenho de um pato
        int tentativas5 = 3;
        chance = 1;
        System.out.println("Nivel 2:");
        System.out.println("Desenho:");
        System.out.println(partesDesenho5[0]);
        System.out.println("O que eh o desenho acima? Digite sua resposta:");
        scanner.nextLine();
        // Verifica se a resposta do usuário está correta
        if (scanner.nextLine().equals(n5)) {
            System.out.println("Parabens, voce acertou!");
        } else {
            System.out.println("Resposta errada! Tente novamente.");
            System.out.println("Voce tem " + tentativas5 + " tentativas restantes.");
            if (tentativas5 < 1) {
                System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                return;
            }else{
                for (int i = 0; i <= chance; i++) {
                    System.out.println(partesDesenho5[i]);
                }
                tentativas5--;
                chance++;
                System.out.println("O que eh o desenho acima? Digite sua resposta:");
                scanner.nextLine();
            }
        }

        System.out.println("\n-----------------------------------------------------------------------------------------------\n");

        System.out.println("  #####   ######   ######    ####      ####     ##     #####     #####              ## ");
        System.out.println(" ##   ##   ##  ##   ##  ##    ##      ##  ##   ####     ## ##   ##   ##            ####");
        System.out.println(" ##   ##   ##  ##   ##  ##    ##     ##       ##  ##    ##  ##  ##   ##            ####");
        System.out.println(" ##   ##   #####    #####     ##     ##       ##  ##    ##  ##  ##   ##             ##");
        System.out.println(" ##   ##   ##  ##   ## ##     ##     ##  ###  ######    ##  ##  ##   ##             ##");
        System.out.println(" ##   ##   ##  ##   ##  ##    ##      ##  ##  ##  ##    ## ##   ##   ##               ");
        System.out.println("  #####   ######   #### ##   ####      #####  ##  ##   #####     #####              ##");
    }
}