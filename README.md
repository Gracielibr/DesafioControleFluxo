# Desafio Controle de Fluxo 

Foi feito com a ajuda das explicações nas aulas do professor

- [Gleyson Sampaio](https://github.com/glysns)
- [Desafio Controle de Fluxo](https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/controle-fluxo)

## Código Base
Abaixo temos o código que servirá de base para a resolução do desafio:

```java
public class Contador {
    	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = // Atribuir input do usuário

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = // Atribuir input do usuário
		
		try {
			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException exception) {
			// Imprimir a mensagem de erro
		}
	}

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
                // Validar se os parâmetros são válidos

                // Realizar o for para imprimir os números com base nos parâmetros
        }
}
```
