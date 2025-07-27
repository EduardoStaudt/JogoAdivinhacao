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

        System.out.println("\nBem Vindo Ao Jogo de Advinhacao em Java!");
        System.out.println("O jogo consiste vc tentar adivinhar o que eh o desenho.\n");

        // Desenho de um gato

        System.out.println("\nDesenho 1:\n");

        // Verifica se a resposta do usuário está correta

        while (tentativas1 > 0) {
            // exibe parte do desenho de acordo com a chance
            System.out.println(partesDesenho1[chance]);

            System.out.print("O que eh o desenho acima? ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals(n1)) {
                System.out.println("Parabens, voce acertou!");
                break;
            } else {
                tentativas1--;
                chance = Math.min(chance + 1, partesDesenho1.length - 1);
                if (tentativas1 == 0) {
                    System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                } else {
                    System.out.println("Resposta errada! Tentativas restantes: " + tentativas1 + "\n");
                }
            }
        }


        // Desenho de um cachorro
        int tentativas2 = 4;
        chance = 1;

        System.out.println("\nDesenho 2:\n");
        while (tentativas2 > 0) {
            // exibe parte do desenho de acordo com a chance
            System.out.println(partesDesenho2[chance]);

            System.out.print("O que eh o desenho acima? ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals(n2)) {
                System.out.println("Parabens, voce acertou!");
                break;
            } else {
                tentativas2--;
                chance = Math.min(chance + 1, partesDesenho2.length - 1);
                if (tentativas2 == 0) {
                    System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                } else {
                    System.out.println("Resposta errada! Tentativas restantes: " + tentativas2 + "\n");
                }
            }
        }


        // Desenho de um celular
        int tentativas3 = 4;
        chance = 1;

        System.out.println("\nDesenho 3:\n");
        while (tentativas3 > 0) {
            // exibe parte do desenho de acordo com a chance
            System.out.println(partesDesenho3[chance]);

            System.out.print("O que eh o desenho acima? ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals(n3)) {
                System.out.println("Parabens, voce acertou!");
                break;
            } else {
                tentativas3--;
                chance = Math.min(chance + 1, partesDesenho3.length - 1);
                if (tentativas3 == 0) {
                    System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                } else {
                    System.out.println("Resposta errada! Tentativas restantes: " + tentativas3 + "\n");
                }
            }
        }


        // Desenho de uma coruja
        int tentativas4 = 3;
        chance = 1;

        System.out.println("\nDesenho 4:\n");
        while (tentativas4 > 0) {
            // exibe parte do desenho de acordo com a chance
            System.out.println(partesDesenho4[chance]);

            System.out.print("O que eh o desenho acima? ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals(n4)) {
                System.out.println("Parabens, voce acertou!");
                break;
            } else {
                tentativas4--;
                chance = Math.min(chance + 1, partesDesenho4.length - 1);
                if (tentativas4 == 0) {
                    System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                } else {
                    System.out.println("Resposta errada! Tentativas restantes: " + tentativas4 + "\n");
                }
            }
        }


        // Desenho de um pato
        int tentativas5 = 3;
        chance = 1;

        System.out.println("\nDesenho 5:\n");
        while (tentativas5 > 0) {
            // exibe parte do desenho de acordo com a chance
            System.out.println(partesDesenho5[chance]);

            System.out.print("O que eh o desenho acima? ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals(n5)) {
                System.out.println("Parabens, voce acertou!");
                break;
            } else {
                tentativas5--;
                chance = Math.min(chance + 1, partesDesenho5.length - 1);
                if (tentativas5 == 0) {
                    System.out.println("Voce perdeu todas as tentativas. O jogo acabou.");
                } else {
                    System.out.println("Resposta errada! Tentativas restantes: " + tentativas5 + "\n");
                }
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