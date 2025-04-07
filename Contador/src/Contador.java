import java.util.Scanner;
import meu.pacote.ParametrosInvalidosException; 


public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        while (true) {
            try {
                
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();

                
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = terminal.nextInt();

                
                contar(parametroUm, parametroDois);

                
                break; 

            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());

            } catch (Exception e) {
                System.out.println("Por favor, insira números inteiros válidos.");
                terminal.nextLine(); 
            }
        }

        terminal.close(); 
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

    
        for (int x = parametroUm; x <= parametroDois; x++) {
            System.out.println("Imprimir o número: " + x);
        }
    }
}
