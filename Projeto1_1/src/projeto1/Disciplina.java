/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int ects;
    private String idioma;
    private ArrayList<Professor> professores;
    private int quantProfessores = 0;
    
    public Disciplina(){
        professores = new ArrayList<>();
    }

    public Disciplina(String nome) {
        professores = new ArrayList<>();
        this.nome = nome;
    }
    
    public void adicionarProfessor(Professor objeto){
        this.professores.add(objeto);
        this.quantProfessores++;
    }
    
    public void removerProfessor(Professor objeto){
        this.professores.remove(objeto);
        this.quantProfessores--;
    }
    
    public boolean conferirProfessor(String nome){
        for (int x = 0; x < professores.size(); x++){
            if (nome.equals(professores.get(x).getNome())){
                return true;
            }            
        }
        return false;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    
    
    
    /**
     *
     * @param index
     */
    public void verProfessorIndice(int index){
        System.out.println("*\nNome: " + this.professores.get(index).getNome());
        System.out.println("Cargo: " + this.professores.get(index).getCargo());
        System.out.println("Email: " + this.professores.get(index).getEmail());
        System.out.println("Telemovel: " + this.professores.get(index).getTelemovel());
    }

    public int getQuantProfessores() {
        return quantProfessores;
    }
    


    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + nome + ", ects=" + ects + ", idioma=" + idioma + ", professores=" + professores + ", quantProfessores=" + quantProfessores + '}';
    }
    
}
