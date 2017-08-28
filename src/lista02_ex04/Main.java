package lista02_ex04;


public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.imprimirInfo();
        
        Funcionario f2 = new Funcionario("Maria Eduarda", 20);
        f2.imprimirInfo();
        
        Funcionario f3 = new Funcionario("Francisco",20160101, 8955.87f);
        f3.imprimirInfo();
        
        System.out.println("Numero de funcionarios: " + Funcionario.numFuncionarios);
    }
    
}
