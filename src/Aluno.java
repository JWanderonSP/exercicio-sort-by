public class Aluno implements Comparable<Aluno>{
    private String nome;
    private String matricula;


 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno o) {
      return this.getNome().compareTo(o.getNome());
    }
  public Aluno (String nome, String matricula){
  this .nome=nome;
  this. matricula=matricula;
  }
    
}
