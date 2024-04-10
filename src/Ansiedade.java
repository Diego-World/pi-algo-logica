import java.util.Scanner;

public class Ansiedade {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int humor;
        String gratidao,hidratacao, sono,alimentacao;

        System.out.println("Como você está se sentindo hoje?");
        System.out.println("01) Muito mal");
        System.out.println("02) Mal");
        System.out.println("03) Regular");
        System.out.println("04) Bem");
        System.out.println("05) Muito bem");
        System.out.println("Digite uma opção entre 1 e 5!");
        humor = sc.nextInt();

        switch (humor){
            case 1:
                System.out.println("Dica: Tente relaxar um pouco, talvez fazer alguma atividade que te dê prazer.");
                break;
            case 2:
                System.out.println("Dica: Talvez seja bom tirar um tempo para descansar e se cuidar.");
                break;
            case 3:
                System.out.println("Dica: Pequenas pausas ao longo do dia podem te ajudar a recarregar as energias.");
                break;
            case 4:
                System.out.println("Dica: Continue assim! talvez tente se desafiar um pouco mais hoje");
                break;
            case 5:
                System.out.println("Dica: Ótimo aproveite o dia e celebre suas conquistas");
                break;
            default:
                System.out.println("Entrada inválida");
        }

        System.out.println("*/**********************************************************************************************/*");
        String ansioso;

        System.out.println("Você está se sentindo ansioso?");
        System.out.println("Digite Sim ou não");
        ansioso = sc.nextLine();
        ansioso = sc.nextLine();

        if(ansioso.equalsIgnoreCase("nao")) {
            System.out.println("Espero que você fique bem, nós nos importamos com você, volte sempre que se sentir ansioso");
        }else if(ansioso.equalsIgnoreCase("sim")){
            int count = 0;

            System.out.println("Vamos fazer um exercicio de respiração...");
            while (count<10){

                System.out.println("*/Inspirando/*");
                System.out.println("Inspire " +count + "s...");
                count++;
            }

            System.out.println("*/**********************************************************************************************/*");

            while (count >= 0){

                System.out.println("*/expirando/*");
                System.out.println("expire " +count + "s...");
                count--;
            }
        }

        System.out.println("/**********************************************************************************************/*");

        System.out.println("Digite algo pelo qual você é grato");
        gratidao = sc.nextLine();

        System.out.println("*/**********************************************************************************************/*");

        System.out.println("Tem bebido água?");
        System.out.println("Digite Sim ou Não");
        hidratacao = sc.nextLine();

        if(hidratacao.equalsIgnoreCase("nao") || hidratacao.equalsIgnoreCase("não")){
            System.out.println("Lembre-se de tomar água ao longo do dia para se manter hidratado");
        }else{
            System.out.println("Parabéns por se manter hidratado!");
        }

        System.out.println("*/**********************************************************************************************/*");

        System.out.println("Você tem dormido bem?");
        System.out.println("Digite Sim ou Não");
        sono = sc.nextLine();
        if(sono.equalsIgnoreCase("nao")|| sono.equalsIgnoreCase("não")){
            System.out.println("Tente estabelecer uma rotina de sono saúdavel para garantir um descanso adequado");
        }else{
            System.out.println("Dormir é fundamental para a saúde");
        }

        System.out.println("*/**********************************************************************************************/*");

        System.out.println("Você tem se alimentado bem?");
        System.out.println("Digite Sim ou Não");
        alimentacao = sc.nextLine();
        if(alimentacao.equalsIgnoreCase("nao")|| alimentacao.equalsIgnoreCase("não")){
            System.out.println("Lembre-se de se alimentar de forma saúdavel para garantir energia ao longo do dia");
        }else{
            System.out.println("Manter uma alimentação equilibrada é essêncial para o seu bem-estar!");
        }

        sc.close();
    }
}
