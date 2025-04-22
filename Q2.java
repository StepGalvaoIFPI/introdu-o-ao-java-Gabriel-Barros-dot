import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o salário do funcionário: ");
        double salario = Double.valueOf(entrada.nextLine());
        double aumento;

        if (salario > 1250.00) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }

        double novoSalario = salario + aumento;

        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.printf("Novo salário = R$ %.2f\n", novoSalario);
        entrada.close();
    }
}
