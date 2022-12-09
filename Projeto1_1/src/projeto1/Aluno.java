/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.util.ArrayList;

/**
 *
 * @author enric
 */
public class Aluno extends Pessoa{
    private static int contador = 0;
    private int numero;
    private int ects = 0;
    private Curso curso;
    private String nome, paisOrigem, uniOrigem;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(){
        disciplinas = new ArrayList<>();
        this.numero = contador;
        contador++;
    }
 
    public Aluno(String nome, String paisOrigem, String uniOrigem) {
        disciplinas = new ArrayList<>();
        this.nome = nome;
        this.numero = contador;
        contador++;
    }
    
    public Aluno(int numero, Curso curso, String paisOrigem, String uniOrigem) {
        this.numero = numero;
        this.curso = curso;
        this.paisOrigem = paisOrigem;
        this.uniOrigem = uniOrigem;
        
        this.numero = contador;
        contador++;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getUniOrigem() {
        return uniOrigem;
    }

    public void setUniOrigem(String uniOrigem) {
        this.uniOrigem = uniOrigem;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getEcts() {
        return ects;
    }
    
    public int quantidadeDisciplina(){
        return disciplinas.size();
    }

    public boolean conferirDisciplina(String nome){
        for (int x = 0; x < disciplinas.size(); x++){
            if (nome.equals(disciplinas.get(x).getNome())){
                return true;
            }            
        }
        return false;
        }
    
    public void adicionarDisciplina(Disciplina nome){
        this.disciplinas.add(nome);
        this.ects = this.ects + nome.getEcts();
    }
    
    public void removerDisciplina(String nome){
        for(int x = 0; x < this.disciplinas.size(); ++x){
            if (nome.equals(this.disciplinas.get(x).getNome())){
                this.disciplinas.remove(x);
                this.ects = this.ects - this.disciplinas.get(x).getEcts();
            }
        }
        }
    
    public void verDisciplinaIndice(int index){
        System.out.println("- " + disciplinas.get(index).getNome());
    }
    
    public void verificaEcts(){
        if(this.ects < 12 || this.ects > 30){
            System.out.println("\nOBSERVACAO: Aluno com situacao IRREGULAR. Nao possui a quantidade de ECTS correcta.\n");
        }
        else{
            System.out.println("\nAluno com situacao REGULAR. Possui a quantidade de ECTS correcta.\n");
        }
    }
    
    public String verNomeCurso(){
        return this.curso.getNome();
    }

    @Override
    public String toString() {
        return "Aluno{" + "numero=" + numero + ", ects=" + ects + ", curso=" + curso.getNome() + ", nome=" + nome + ", paisOrigem=" + paisOrigem + ", uniOrigem=" + uniOrigem + ", disciplinas=" + disciplinas + '}';
    }
    

    
    
}
