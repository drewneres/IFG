public class Pessoa {
    private String CPF;
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String CPF, String nome, String endereco, String telefone) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String CPF, String nome, String endereco, String telefone, String matricula, String curso) {
        super(CPF, nome, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

public class Professor extends Pessoa {
    private String departamento;
    private String salario;

    public Professor(String CPF, String nome, String endereco, String telefone, String departamento, String salario) {
        super(CPF, nome, endereco, telefone);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
