import java.util.Scanner;

public class ManipularString {
    static Scanner scanner = new Scanner(System.in);
    void lerNomeSobrenome() {
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println(nome.concat(sobrenome));
    }
}






