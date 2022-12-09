/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.util.ArrayList;


public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    
    public Curso(){
        disciplinas = new ArrayList<>();
    }
    
    public Curso(String nome){
        this.nome = nome;
        disciplinas = new ArrayList<>();
    }
    
    public void adicionarDisciplina(Disciplina objeto){
        this.disciplinas.add(objeto);
    }
    
    public void verNomeDisciplinaIndex(int index){
        System.out.println("- " + disciplinas.get(index).getNome());
    }
    
    public void removerDisciplina(String nome){
        for(int x = 0; x < this.disciplinas.size(); ++x){
            if (nome.equals(this.disciplinas.get(x).getNome())){
                this.disciplinas.remove(x);
            }
        }
        }
    
    public int quantidadeDisciplinas(){
        return disciplinas.size();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public boolean conferirDisciplina(String nome){
        for (int x = 0; x < this.disciplinas.size(); x++){
            if (nome.equals(this.disciplinas.get(x).getNome())){
                return true;
            }            
        }
        return false;
        }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", disciplinas=" + disciplinas + '}';
    }
    
    
}
