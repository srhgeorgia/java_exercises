package exerciciosClasses;

public class principalFuncionario {

	public static void main(String[] args) {
        Funcionario assalariado = new FuncionarioAssalariado("João", 3000);
        Funcionario horista = new FuncionarioHorista("Maria", 2000, 40, 50);

        System.out.println("Salário do funcionário assalariado " + assalariado.getNome() + ": R$" + assalariado.calcularSalario());
        System.out.println("Salário do funcionário horista " + horista.getNome() + ": R$" + horista.calcularSalario());
    }

}
