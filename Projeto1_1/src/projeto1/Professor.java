/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;

public class Professor extends Pessoa{
    private String cargo;
    private String email;
    private int telemovel;

    public Professor(){
    }

    public Professor(String cargo, String email, int telemovel) {
        this.cargo = cargo;
        this.email = email;
        this.telemovel = telemovel;
    }
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    /*
    public void verArrayProfessor(int index, ArrayList<Professor> objeto){
        System.out.println("\n");
        System.out.println("---------------------- PROFESSOR NUMERO " + index + " ----------------------");
        System.out.println("Nome do professor: " + objeto.get(index).getNome());
        System.out.println("Cargo do professor: " + objeto.get(index).getCargo());
        System.out.println("Telemovel do professor: " + objeto.get(index).getTelemovel());
        System.out.println("Email do professor: " + objeto.get(index).getEmail());
        System.out.println("----------------------------------------------------------------\n");
    }
    */
    
    @Override
    public String toString() {
        return "Professor{" +"nome= "+ getNome() + ", cargo=" + cargo + ", email=" + email + ", telemovel=" + telemovel + '}';
    }
    
    
    
}


