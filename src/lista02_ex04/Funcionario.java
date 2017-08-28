package lista02_ex04;
public class Funcionario {

    private int matricula;
    private String nome;
    private int idade;
    private String cargo;
    private float salario;
    public static int numFuncionarios;
    
    public Funcionario(){
        numFuncionarios++;
        this.salario = 1500;
    }
    
    public Funcionario(String nome, int idade){
        numFuncionarios++;
        this.nome = nome;
        this.idade = idade;
    }
    
    public Funcionario(String nome, int matricula, float salario){
        numFuncionarios++;
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }    
    
    public void imprimirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario + "\n");
    }
    
}
