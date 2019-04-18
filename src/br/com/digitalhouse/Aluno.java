package br.com.digitalhouse;

public class Aluno {
    private String nome;
    private int ra;
    private String sobrenome;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(String nome, int ra, String sobrenome, Curso curso) {
        this.nome = nome;
        this.ra = ra;
        this.sobrenome = sobrenome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object outroAluno) {
        if (!(outroAluno instanceof Aluno)) {
            return false;
        }

        if (((Aluno) outroAluno).getRa() == this.getRa() &&
                ((Aluno) outroAluno).getNome().equals(this.getNome())) {
            return true;


        }
        return false;
    }

    @Override
    public int hashCode() {
        return ra + nome.hashCode();
    }

    @Override
    public String toString() {
        return "ra: " + getRa() + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() +
                "\n Curso: " + getCurso();


    }


}

