import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ManipularString manipularString = new ManipularString();
        // manipularString.lerNomeSobrenome();

        System.out.print("Crie uma senha (mínimo 8 caracteres e o 4º caractere deve ser 'Z'): ");
        String senha1 = ManipularString.scanner.nextLine().trim();
        if (senha1.length() >= 8 && senha1.charAt(3) == 'Z') {
            System.out.print("Repita a senha");
            String senha = ManipularString.scanner.nextLine().trim();
            if (senha1.equals(senha)) {
                System.out.println("Senha criada com sucesso.");
            } else {
                System.out.println("As senhas não coincidem. Tente novamente.");
            }
        } else {
            System.out.println("Senha inválida. Tente novamente.");
        }

    }
}




