public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplina = new String[3];
    private double[][] notasDisciplinas = new double[3][4];

public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplina, double[][] notasDisciplinas){
    this.nome = nome;
    this.matricula = matricula;
    this.nomeCurso = nomeCurso;
    this.nomeDisciplina = nomeDisciplina;
    this.notasDisciplinas = notasDisciplinas;
}
public Aluno(){ }

    //get e set 
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    //metodos

    public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + nomeCurso);

        for(int i=0; i<notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina " + nomeDisciplina[i]);
            for (int j=0; j<notasDisciplinas[i].length; j++){
                System.out.println(notasDisciplinas[i] [j] + " ");

            }
            System.out.println();
        }
    }
    //Aprovado se media for maior ou igual a 7
    public boolean verificarAprovado(int indice){
      if(obterMedia(indice)>= 7){
          return true; 
        }
      return false;
    }
    public double obterMedia(int indice){
        double soma = 0;
      
      for(int i=0; i<notasDisciplinas[indice].length; i++){
          soma += notasDisciplinas[indice] [i];
    }
    double media  = soma / 4; 
    return media;
   }
}