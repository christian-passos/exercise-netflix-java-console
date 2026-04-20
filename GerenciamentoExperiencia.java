import java.util.Scanner;

public class GerenciamentoExperiencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plano = sc.nextInt();
        int idade = sc.nextInt();
        sc.nextLine();
        String regiao = sc.nextLine();

        switch (plano) {
            case 1:
                System.out.println("Resolução 720p - 1 tela disponível.");
                break;
            case 2:
                System.out.println("Resolução 1080p (Full HD) - 2 telas disponíveis.");
                break;
            case 3:
                System.out.println("Resolução 4K + HDR - 4 telas disponíveis.");
                break;
            default:
                System.out.println("Código de plano inválido.");
        }

        if (idade < 12) {
            System.out.println("Categoria: Infantil (Desenhos e Animações).");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
        } else {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
        }

        if (regiao.equalsIgnoreCase("Brasil")) {
            System.out.println("Destaque: Assista agora produções originais brasileiras!");
        }

        sc.close();
    }
}
