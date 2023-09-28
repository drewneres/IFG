public abstract class Funcionario {
        public String nome;
        public Double salario;

        public Funcionario(String nome, Double salario) {
            this.nome = nome;
            this.salario = salario;
        }

        public abstract void reajustar();
    }
    class Programador extends Funcionario {
        public Programador(String nome, Double salario) {
            super(nome, salario);
        }

        @Override
        public void reajustar() {
            salario += 1500;
        }
    }

    class Analista extends Funcionario {
        public Analista(String nome, Double salario) {
            super(nome, salario);
        }

        @Override
        public void reajustar() {
            salario += 2000;
        }
    }

    class TesteFuncionario {
        public static void main(String[]args) {
            Programador programador = new Programador("Hendrew", 2000.0);
            Analista analista = new Analista("Gabriel", 5000.0);

            programador.reajustar();
            analista.reajustar();

            System.out.println("Novo salário do programador : R$ " + programador.salario);

            System.out.println("Novo salário do Analista : R$ " + analista.salario);
        }
    }
