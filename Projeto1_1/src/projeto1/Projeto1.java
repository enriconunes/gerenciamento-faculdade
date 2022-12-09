
package projeto1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Projeto1
{


    public static void main(String[] args)
    {
        
        // 1. Cadastro
        //  1.1 Aluno +
        //  1.2 Disciplina +
        //  1.3 Professor +
        //  1.4 Curso +
        //
        // 2. Exibir
        //  2.1 Alunos +
        //  2.2 Disciplinas +
        //  2.3 Professores +
        //  2.4 Curso +
        //
        // 3. Editar
        //  3.1 Alunos
        //      3.1.1 Nome +
        //      3.1.2 Sexo +
        //  3.2 Disciplinas
        //  3.3 Professores
        //  3.4 Cursos
        
        
        //DECLARACAO DOS ARRAYS DE CADA OBJETO
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        /*
        //TESTE FUNCIONAMENTO
        
        professor.setNome("Rodrigo");
        professores.add(professor);
        System.out.println(professores);
        professor.setNome("Antonio");
        System.out.println(professores);
        
        
        for (int w = 0 ; w < 3; w++){
            System.out.println("nome: ");
            String nome = input.nextLine();
            professor.setNome(nome);
            professores.add(professor);
            System.out.println(professores);
        }
        */
        
        int menu = 100; //DECLARACAO DE VARIAVEL COM VALOR ALEATORIO DIFERENTE DE 0,1,2,3
        while (menu != 0)
            {
                System.out.println("1. Cadastrar\n2. Visualizar\n3. Editar\n0. Sair\n\nDigite sua opcao: ");
                        
            try{
                menu = input.nextInt(); 
             }catch(InputMismatchException exception){
                System.out.println("ERRO: O input deve ser um numero inteiro!");
                String lixBuffer = input.nextLine();   
                break;
             }
            
            if (menu == 0)
            {
                break;
            }
            
            //OPCAO CADASTRAR
            else if (menu == 1)                    
            {
                int submenu = 100;
                
                while(submenu != 0){
                    System.out.println("1. Cadastrar Aluno\n2. Cadastrar Professor\n3. Cadastrar Curso\n4. Cadastrar Disciplina\n0. Voltar\n\nDigite sua opcao: ");
                    
                    try{
                        submenu = input.nextInt();
                        
                    }catch(InputMismatchException exception){
                        System.out.println("ERRO: O input deve ser um numero inteiro!");
                        String lixBuffer = input.nextLine();   
                        break;
                    }
                    
                    
                    if(submenu == 1){
                        //CADASTRAR ALUNO
                        String lixo = input.nextLine();
                        System.out.println("Digite o nome do aluno: ");
                        String nome = input.nextLine();   
                        System.out.println("Digite o sexo do aluno: ");
                        String sexo = input.nextLine(); 
                        System.out.println("Digite o pais de origem do aluno: ");
                        String pais = input.nextLine();
                        System.out.println("Digite o nome da universidade de origem do aluno: ");
                        String universidade = input.nextLine();
                        System.out.println("Digite o nome de uma disciplina inscrita (usar opcao 'Editar' para adicionar mais disciplinas): ");
                        String nomeDisciplina = input.nextLine();
                        System.out.println("Digite o nome do curso: ");
                        String nomeCurso = input.nextLine();

                        Aluno aluno = new Aluno();
                        
                        aluno.setNome(nome);
                        aluno.setPaisOrigem(pais);
                        aluno.setUniOrigem(universidade);
                        aluno.setSexo(sexo);
                        
                        //CONFERIR SE O CURSO EXISTE
                        if (cursos.isEmpty()){
                            System.out.println("ERRO: Nao ha cursos cadastrados!\n");
                            break;
                        }
                        else{
                            
                        boolean existe = false;
                        int posicao = 0;
                        for(int x = 0; x < cursos.size(); ++x){
                            if (nomeCurso.equals(cursos.get(x).getNome()))
                            {
                                existe = true;  
                                posicao = x;
                            }
                        }
                            if (existe == true){
                                aluno.setCurso(cursos.get(posicao));
                            }
                            else{
                                System.out.println("\nERRO: O curso " + nomeCurso + " nao existe!\n");
                                break;
                            }
                        }
                        
                        
                        //CONFERIR SE A DISCIPLINA EXISTE
                        if (disciplinas.isEmpty()){
                            System.out.println("ERRO: Nao ha disciplinas cadastradas!\n");
                        }
                        else{
                        boolean existe = false;
                        int posicao = 0;
                        for(int x = 0; x < disciplinas.size(); ++x){
                            if (nomeDisciplina.equals(disciplinas.get(x).getNome()))
                            {
                                posicao = x;
                                existe = true;
                                //aluno.adicionarDisciplina(disciplinas.get(x));
                                //alunos.add(aluno); //SE TODOS OS PASSOS ANTERIORES NAO DEREM ERRO, ENTAO ADICIONA O OBJ NO ARRAY DE ALUNOS
                                //System.out.println("\nAluno " + nome + " cadastrado(a)!\n");
                            }
                            }
                            if (existe == true){
                                aluno.adicionarDisciplina(disciplinas.get(posicao));
                                alunos.add(aluno); //SE TODOS OS PASSOS ANTERIORES NAO DEREM ERRO, ENTAO ADICIONA O OBJ NO ARRAY DE ALUNOS
                                System.out.println("\nAluno " + nome + " cadastrado(a)!\n"); 
                            }
                            else{
                                System.out.println("\nERRO: A disciplina " + nomeDisciplina + " nao existe!\n");
                                break;
                            }
                        }
                        
                         
                        
                        
                        
                    }
                    else if(submenu == 2){
                        //CADASTRAR PROFESSOR
                        String lixo = input.nextLine();
                        System.out.println("Digite o nome do(a) professor(a): ");
                        String nome = input.nextLine(); 
                        System.out.println("Digite o sexo do(a) professor(a): ");
                        String sexo = input.nextLine(); 
                        System.out.println("Digite o cargo do(a) professor(a): ");
                        String cargo = input.nextLine();               
                        System.out.println("Digite o email do(a) professor(a): ");
                        String email = input.nextLine();
                        System.out.println("Digite o telemovel do(a) professor(a): ");
                        int telemovel;
                        try{
                            telemovel = input.nextInt();
                        } catch(InputMismatchException exception){
                            System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                            String lixBuffer = input.nextLine();
                            break;
                        }
                        

                        //CONFERIR SE O PROFESSOR JA EXISTE
                        boolean existe = false;
                        for (int x = 0; x < professores.size(); x++){
                            if (nome.equals(professores.get(x).getNome())){
                                existe = true;
                            }
                        }
                        if (existe == true){
                            System.out.println("ERRO: Este professor ja esta cadastrado!\n");
                        }
                        else{
                            Professor professor = new Professor();
                            professor.setSexo(sexo);
                            professor.setNome(nome);
                            professor.setCargo(cargo);
                            professor.setEmail(email);
                            professor.setTelemovel(telemovel);
                        
                            professores.add(professor);
                        
                            System.out.println("\nProfessor(a) " + nome + " cadastrado(a)!\n");
                        }        
                    }
                    else if(submenu == 3){
                        //CADASTRAR CURSO
                        String lixo = input.nextLine();
                        System.out.println("Digite o nome do curso: ");
                        String nome = input.nextLine(); 
                        System.out.println("Digite o nome de uma disciplina para inicializar o curso (usar opcao 'Editar' para adicionar mais disciplinas): ");
                        String nomeDisciplina = input.nextLine();   
                        
                        Curso curso = new Curso();
                        
                        curso.setNome(nome);
                        
                        //CONFERIR SE A DISCIPLINA EXISTE
                        if (disciplinas.isEmpty()){
                            System.out.println("ERRO: Nao ha disciplinas cadastradas!\n");
                            break;
                        }
                        else{
                        boolean existe = false;
                        int posicao = 0;
                        for(int x = 0; x < disciplinas.size(); x++){
                            if (nomeDisciplina.equals(disciplinas.get(x).getNome()))
                            {           
                                existe = true;
                                posicao = x;   
                            }
                        }
                        if (existe == true){
                            curso.adicionarDisciplina(disciplinas.get(posicao));
                            cursos.add(curso);
                            System.out.println("\nO curso " + nome + " foi cadastrado!\n");
                        }
                        else{
                            System.out.println("\nERRO: A disciplina " + nomeDisciplina + " nao existe!\n");
                            break;
                        }
                        
                        }
                        
                        
                    }
                    else if(submenu == 4){
                        //CADASTRAR DISCIPLINA
                        String lixo = input.nextLine();
                        System.out.println("Digite o nome da disciplina: ");
                        String nome = input.nextLine(); 
                        System.out.println("Digite a quantidade de ECTS da disciplina: ");
                        int ects;
                        try{
                        ects = input.nextInt();
                        
                        }catch(InputMismatchException exception){
                        System.out.println("ERRO: O input deve ser um numero inteiro!");
                        String lixBuffer = input.nextLine();   
                        break;
                    }
                           
                        System.out.println("Digite o idioma da disciplina: ");
                        String lixo2 = input.nextLine();
                        String idioma = input.nextLine();
                        System.out.println("Digite o nome do professor regente: ");
                        String nomeProfessor = input.nextLine();
                        
                        Disciplina disciplina = new Disciplina();
                        
                        disciplina.setEcts(ects);
                        disciplina.setNome(nome);
                        disciplina.setIdioma(idioma);
                        
                        //CONFERIR SE O PROFESSOR EXISTE
                        
                        if (professores.isEmpty()){
                            System.out.println("ERRO: Nao ha professores cadastrados!\n");
                        }
                        else{
                        boolean existe = false;
                        int posicao = 0;
                        for (int x = 0; x < professores.size(); x++){
                            if(nomeProfessor.equals(professores.get(x).getNome())){
                                //disciplina.adicionarProfessor(professores.get(x));             
                                //disciplinas.add(disciplina); //ADICIONA OBJETO NO ARRAY DE  DISCIPLINA               
                                //System.out.println("\nDisciplina " + nome + " cadastrada!\n");
                                existe = true;
                                posicao = x;
                            }
                        }
                        
                            if (existe == true){
                                disciplina.adicionarProfessor(professores.get(posicao));             
                                disciplinas.add(disciplina); //ADICIONA OBJETO NO ARRAY DE  DISCIPLINA               
                                System.out.println("\nDisciplina " + nome + " cadastrada!\n");
                            }
                            else{
                                System.out.println("\nERRO: O professor " + nomeProfessor + " nao existe!\n");
                                break;
                            }
                        }
                        
                        
                    }
                    else if(submenu == 0){
                        break;
                    }
                    else{
                        System.out.println("Numero Invalido!");
                    }
                }
            }
            
            //OPCAO VISUALIZAR
            else if (menu == 2)
            {
                int submenu = 100; //VALOR ALEATORIO MAIOR QUE 4
                
                while(submenu != 0){
                    System.out.println("1. Ver Alunos\n2. Ver Professores\n3. Ver Cursos\n4. Ver Disciplinas\n0. Voltar\n\nDigite sua opcao: ");
                    
                    try{
                        submenu = input.nextInt();
                    } catch(InputMismatchException exception){
                        System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                        String lixBuffer = input.nextLine();
                        break;
                    }
                    
                    
                    if(submenu == 1){
                        //VER ALUNOS
                        if(alunos.isEmpty()){
                            System.out.println("Nao ha alunos cadastrados!");
                        }
                        else{
                        for (int cnt = 0; cnt < alunos.size(); cnt++){
                            System.out.println("\n------------------------------- Aluno numero " + alunos.get(cnt).getNumero() + " -------------------------------\n");
                            System.out.println("Nome: " + alunos.get(cnt).getNome());
                            System.out.println("Sexo: " + alunos.get(cnt).getSexo());
                            System.out.println("Curso: " + alunos.get(cnt).verNomeCurso());
                            System.out.println("ECTS inscritas: " + alunos.get(cnt).getEcts());
                            System.out.println("Pais de origem: " + alunos.get(cnt).getPaisOrigem());
                            System.out.println("Universidade de origem: " + alunos.get(cnt).getUniOrigem());
                            System.out.println("\nDisciplinas matriculadas: ");
                            for (int cnt2 = 0; cnt2 < alunos.get(cnt).quantidadeDisciplina(); cnt2++){
                                alunos.get(cnt).verDisciplinaIndice(cnt2);
                            }
                            alunos.get(cnt).verificaEcts();
                            System.out.println("------------------------------------------------------------------------------");
                        }
                        }
                    }
                    else if(submenu == 2){
                        //VER PROFESSORES
                        if(professores.isEmpty()){
                            System.out.println("Nao ha professores cadastrados!");
                        }
                        else{
                            for(int x=0; x < professores.size(); x++){
                                System.out.println("\n");
                                System.out.println("---------------------- PROFESSOR NUMERO " + x + " ----------------------");
                                System.out.println("Nome do professor: " + professores.get(x).getNome());
                                System.out.println("Sexo do professor: " + professores.get(x).getSexo());
                                System.out.println("Cargo do professor: " + professores.get(x).getCargo());
                                System.out.println("Telemovel do professor: " + professores.get(x).getTelemovel());
                                System.out.println("Email do professor: " + professores.get(x).getEmail());
                                System.out.println("----------------------------------------------------------------\n");                                
                            }
                        }

                    }
                    else if(submenu == 3){
                        //VER CURSOS
                        if(cursos.isEmpty()){
                            System.out.println("Nao ha cursos cadastrados!");
                        }
                        else{
                            for (int x = 0; x < cursos.size(); x++){
                                System.out.println("\n---------------- Curso numero " + x + " ----------------\n");
                                System.out.println("Nome: " + cursos.get(x).getNome());
                                System.out.println("Disciplinas: ");
                                for (int cnt = 0; cnt < cursos.get(x).quantidadeDisciplinas(); cnt++){
                                    cursos.get(x).verNomeDisciplinaIndex(cnt);
                                }
                                System.out.println("------------------------------------------------");
                            }
                        }
                    }
                    else if(submenu == 4){
                        //VER DISCIPLINAS
                        
                        if(disciplinas.isEmpty()){
                            System.out.println("Nao ha disciplinas cadastradas!");
                        }
                        else{
                            for(int x=0; x < disciplinas.size(); x++){
                                System.out.println("\n");
                                System.out.println("---------------------- DISCIPLINA NUMERO " + x + " ----------------------");
                                System.out.println("Nome da disciplina: " + disciplinas.get(x).getNome());
                                System.out.println("Quantidade de ECTS da disciplina: " + disciplinas.get(x).getEcts());
                                System.out.println("Idioma da disciplina: " + disciplinas.get(x).getIdioma());
                                System.out.println("Quantidade de professores: " + disciplinas.get(x).getQuantProfessores());                                
                                System.out.println("Professores da disciplina: ");
                                for (int i=0; i < disciplinas.get(x).getQuantProfessores(); i++){
                                    disciplinas.get(x).verProfessorIndice(i);
                                }
                                System.out.println("-----------------------------------------------------------------");
                            }
                        }
                    }
                    else if(submenu == 0){
                        break;
                    }
                    else{
                        System.out.println("Numero Invalido!");
                    }
                }
            }  
            
            //OPCAO EDITAR
            else if (menu == 3)
            {
                int submenu = 100;
                
                while(submenu != 0){
                    System.out.println("1. Editar Alunos\n2. Editar Professores\n3. Editar Cursos\n4. Editar Disciplinas\n0. Voltar\n\nDigite sua opcao: ");
                    
                    try{
                        submenu = input.nextInt();
                    } catch(InputMismatchException exception){
                        System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                        String lixBuffer = input.nextLine();
                        break;
                    }
                    
                    if(submenu == 1){
                        //EDITAR ALUNOS
                        System.out.println("Digite o numero do aluno para o alterar: ");
                        int numeroAluno;
                        try{
                        numeroAluno = input.nextInt();
                        
                        }catch(InputMismatchException exception){
                        System.out.println("ERRO: O input deve ser um numero inteiro!");
                        String lixBuffer = input.nextLine();   
                        break;
                        }
                        
                        //CONFERIR SE O ALUNO EXISTE
                        if (alunos.isEmpty()){
                            System.out.println("ERRO: Nao ha alunos cadastrados!\n");
                        }
                        else{
                        for (int x = 0; x < professores.size(); x++){
                            if(numeroAluno == alunos.get(x).getNumero()){
                                //ALUNO ENCONTRADO
                                int menuEditar;
                                try{
                                    menuEditar = input.nextInt();
                                } catch(InputMismatchException exception){
                                    System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                                    String lixBuffer = input.nextLine();
                                    break;
                                }
                                
                                
                                while (menuEditar != 0){
                                    System.out.println("1. Alterar nome do(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("2. Alterar sexo do(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("3. Alterar pais de origem do(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("4. Alterar universidade de origem do(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("5. Alterar curso do(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("6. Adicionar disciplinas ao(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("7. Remover disciplinas ao(a) aluno(a) " + alunos.get(x).getNome());
                                    System.out.println("0. Voltar");
                                    System.out.println("\n\nDigite sua opcao: ");
                                    menuEditar = input.nextInt();
                                    
                                    if (menuEditar == 0){
                                        //VOLTAR
                                    }
                                    else if (menuEditar == 1){
                                        //EDITAR NOME DO ALUNO
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Alterar o nome " + alunos.get(x).getNome() + " para: ");
                                        String novoNome = input.nextLine();                                        
                                        alunos.get(x).setNome(novoNome);
                                        System.out.println("Nome alterado com sucesso!");
                                    }
                                    else if (menuEditar == 2){                                       
                                        //EDITAR SEXO DO ALUNO
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Alterar o sexo " + alunos.get(x).getSexo() + " para: ");
                                        String novoSexo = input.nextLine();                                 
                                        alunos.get(x).setSexo(novoSexo);
                                        System.out.println("Sexo alterado com sucesso!");
                                    }
                                    else if (menuEditar == 3){
                                       //EDITAR PAIS DE ORIGEM DO ALUNO 
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Alterar o pais " + alunos.get(x).getPaisOrigem()+ " para: ");                                        
                                        String novoPais = input.nextLine();
                                        alunos.get(x).setPaisOrigem(novoPais);
                                        System.out.println("Pais de origem alterado com sucesso!");
                                    }
                                    else if (menuEditar == 4){
                                        //EDITAR UNIVERSIDADE DE ORIGEM DO ALUNO
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Alterar universidade " + alunos.get(x).getUniOrigem()+ " para: ");                                      
                                        String novaUni = input.nextLine();
                                        alunos.get(x).setUniOrigem(novaUni);
                                        System.out.println("Universidade de origem alterado com sucesso!");
                                    }
                                    else if (menuEditar == 5){
                                        //EDITAR CURSO DO ALUNO
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Alterar o curso " + alunos.get(x).verNomeCurso()+ " para: ");                           
                                        String novoCurso = input.nextLine();
                                        
                                        //CONFERIR SE O CURSO EXISTE
                                        if (cursos.isEmpty()){
                                            System.out.println("ERRO: Nao ha cursos cadastrados!\n");
                                            break;
                                        }
                                        else{
                                        boolean existe = false;
                                        int posicao = x;
                                        for(int i = 0; i < cursos.size(); ++i){
                                            if (novoCurso.equals(cursos.get(i).getNome()))
                                            {
                                                //CURSO ENCONTRADO
                                                //alunos.get(x).setCurso(cursos.get(i));
                                                //System.out.println("Curso alterado com sucesso!");
                                                existe = true;
                                                posicao = i;
                                            }
                                        }
                                        if (existe == true){
                                            alunos.get(x).setCurso(cursos.get(posicao));
                                            System.out.println("Curso alterado com sucesso!");
                                            
                                        }
                                        else{
                                            System.out.println("\nERRO: O curso " + novoCurso + " nao existe!\n");
                                            break;
                                        }
                                        }
                                                                             
                                        
                                    }
                                    else if (menuEditar == 6){
                                        //ADICIONAR DISCIPLINA
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Digite o nome da disciplina a ser adicionada: ");
                                        
                                        String novaDisciplina = input.nextLine();
                                                                                
                                        
                                        //CONFERIR SE A DISCIPLINA EXISTE
                                        if (disciplinas.isEmpty()){
                                            System.out.println("ERRO: Nao ha disciplinas cadastrados!\n");
                                            break;
                                        }
                                        else{
                                            
                                        boolean existe = false;
                                        int posicao = 0;
                                        
                                        for(int i = 0; i < disciplinas.size(); i++){
                                            if (novaDisciplina.equals(disciplinas.get(i).getNome()))
                                            {
                                                //DISCIPLINA ENCONTRADA
                                                existe = true;
                                                posicao = i;
                                            }
                                        }
                                            if(existe == true){
                                                if (alunos.get(x).conferirDisciplina(novaDisciplina) == true){
                                                    System.out.println("O aluno ja esta matriculado nesta disciplina!\n");
                                                }
                                                else{
                                                alunos.get(x).adicionarDisciplina(disciplinas.get(posicao));
                                                System.out.println("\nDisciplina adicionada com sucesso!\n");  
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("\nERRO: A disciplina " + novaDisciplina + " nao existe!\n");
                                                break;
                                            }
                                        }
                                         
                                        
                                    }
                                    else if (menuEditar == 7){
                                        //REMOVER DISCIPLINA
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Digite o nome da disciplina a ser removida: ");
                                 
                                        String removeDisciplina = input.nextLine();
                                                                                
                                        
                                        //CONFERIR SE A DISCIPLINA EXISTE
                                        if (disciplinas.isEmpty()){
                                            System.out.println("ERRO: Nao ha disciplinas cadastrados!\n");
                                            break;
                                        }
                                        else{
                                            
                                        boolean existe = false;
                                        int posicao = 0;
                                        
                                        for(int i = 0; i < disciplinas.size(); i++){
                                            if (removeDisciplina.equals(disciplinas.get(i).getNome()))
                                            {
                                                //DISCIPLINA ENCONTRADA
                                                existe = true;
                                                posicao = i;
                                            }
                                        }
                                            if(existe == true){
                                                
                                                alunos.get(x).removerDisciplina(removeDisciplina);
                                                System.out.println("\nDisciplina removida com sucesso!\n");                                    
                                            }
                                            else{
                                                System.out.println("\nERRO: A disciplina " + removeDisciplina + " nao existe!\n");
                                                break;
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("Opcao invalida!");
                                        break;
                                    }
                                    
                                }
                                
                                System.out.println("\nAluno(a) " + alunos.get(x).getNome() + " modificado(a)!\n");
                            }
                            else{
                                System.out.println("\nERRO: O aluno " + alunos.get(x).getNome() + " nao existe!\n");
                                break;
                            }
                        }
                    }
                    }
                    else if(submenu == 2){
                        //EDITAR PROFESSORES
                        String buffer = input.nextLine();
                        System.out.println("Digite o nome do professor para editar: ");
                        String nomeProfessor = input.nextLine();
                        
                        //Conferir se o professor existe
                        if (professores.isEmpty()){
                            System.out.println("ERRO: Nao ha professores cadastrados!\n");
                        }
                        else{
                            
                        boolean existe = false;
                        int posicao = 0;
                        for (int x = 0; x < professores.size(); x++){
                            if(nomeProfessor.equals(professores.get(x).getNome())){
                                existe = true;
                                posicao = x;
                            }
                        }                      
                            if (existe == true){
                                //PROFESSOR ENCONTRADO
                                int menuEditar = 100;
                                
                                
                                while (menuEditar != 0){
                                    System.out.println("\n1. Editar nome do(a) professor(a) " + professores.get(posicao).getNome());
                                    System.out.println("2. Editar sexo do(a) professor(a) " + professores.get(posicao).getNome());
                                    System.out.println("3. Editar cargo do(a) professor(a) " + professores.get(posicao).getNome());
                                    System.out.println("4. Editar email do(a) professor(a) " + professores.get(posicao).getNome());
                                    System.out.println("5. Editar telemovel do(a) professor(a) " + professores.get(posicao).getNome());
                                    System.out.println("0. Voltar\n\nDigite sua opcao: ");
                                    try{
                                        menuEditar = input.nextInt();
                                    } catch(InputMismatchException exception){
                                        System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                                        break;
                                    }
                                    
                                    if (menuEditar == 0){
                                        break;
                                    }
                                    else if (menuEditar == 1){
                                        //EDITAR NOME
                                        buffer = input.nextLine();
                                        System.out.println("Alterar nome " + professores.get(posicao).getNome() + " para:");
                                        String novoNome = input.nextLine();
                                        professores.get(posicao).setNome(novoNome);
                                    }
                                    else if (menuEditar == 2){
                                        //EDITAR SEXO
                                        buffer = input.nextLine();
                                        System.out.println("Alterar sexo " + professores.get(posicao).getSexo() + " para:");
                                        String novoSexo = input.nextLine();
                                        professores.get(posicao).setSexo(novoSexo);
                                    }
                                    else if (menuEditar == 3){
                                        //EDITAR CARGO
                                        buffer = input.nextLine();
                                        System.out.println("Alterar cargo " + professores.get(posicao).getCargo() + " para:");
                                        String novoCargo = input.nextLine();
                                        professores.get(posicao).setCargo(novoCargo);
                                    }
                                    else if (menuEditar == 4){
                                        //EDITAR EMAIL
                                        buffer = input.nextLine();
                                        System.out.println("Alterar email " + professores.get(posicao).getEmail() + " para:");
                                        String novoEmail = input.nextLine();
                                        professores.get(posicao).setEmail(novoEmail);
                                    }
                                    else if (menuEditar == 5){
                                        //EDITAR TELEMOVEL
                                        buffer = input.nextLine();
                                        System.out.println("Alterar telemovel " + professores.get(posicao).getTelemovel() + " para:");
                                        int novoTelemovel;
                                        try{
                                        novoTelemovel = input.nextInt();
                                        }catch(InputMismatchException exception){
                                            System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                                            break;
                                        }
                                        professores.get(posicao).setTelemovel(novoTelemovel);
                                    }
                                    else{
                                        System.out.println("Opcao Invalida!\n");
                                        break;
                                    }
                                }
                                    System.out.println("Professor alterado!\n");
                            }
                            else{
                                System.out.println("\nERRO: O professor " + nomeProfessor + " nao existe!\n");
                                break;
                            }
                        }
                        
                        
                    }
                    else if(submenu == 3){
                        //EDITAR CURSOS
                        String buffer = input.nextLine();
                        System.out.println("Digite o nome do curso para alterar");
                        String nomeCurso = input.nextLine();
                        //CONFERIR SE O CURSO EXISTE
                        boolean existe = false;
                        int posicao = 0;
                        
                        if (cursos.isEmpty()){
                            System.out.println("ERRO: Nao ha cursos cadastrados!\n");
                            break;
                            }
                        else{
                            for (int x = 0; x < cursos.size(); x++){
                                if (nomeCurso.equals(cursos.get(x).getNome())){
                                    existe = true;
                                    posicao = x;
                                }
                            }
                            
                            if (existe == true){
                                int menuEditar = 100;
                                while (menuEditar != 0){
                                    buffer = input.nextLine();
                                    System.out.println("1. Editar o nome do curso " + cursos.get(posicao).getNome());
                                    System.out.println("2. Adicionar disciplina ao curso " + cursos.get(posicao).getNome());
                                    System.out.println("3. Remover disciplina do curso " + cursos.get(posicao).getNome());
                                    System.out.println("0. Voltar\n\nDigite sua opcao: ");
                                    
                                    try{
                                        menuEditar = input.nextInt();
                                    } catch(InputMismatchException exception){
                                        System.out.println("ERRO: O input deve ser um numero inteiro!\n");
                                        String lixBuffer = input.nextLine();
                                        break;
                                    }
                                    
                                    
                                    if (menuEditar == 0){
                                        break;
                                    }
                                    else if (menuEditar == 1){
                                        //EDITAR NOME DO CURSO
                                        buffer = input.nextLine();
                                        System.out.println("Alterar o nome " + cursos.get(posicao).getNome() + " para: ");
                                        String novoNome = input.nextLine();
                                        cursos.get(posicao).setNome(novoNome);
                                    }
                                    else if (menuEditar == 2){
                                        //ADICIONAR DISCIPLINA
                                        String lixoBuffer = input.nextLine();
                                        System.out.println("Digite o nome da disciplina a ser adicionada: ");
                                        
                                        String novaDisciplina = input.nextLine();
                                                                                
                                        
                                        //CONFERIR SE A DISCIPLINA EXISTE
                                        if (disciplinas.isEmpty()){
                                            System.out.println("ERRO: Nao ha disciplinas cadastrados!\n");
                                            break;
                                        }
                                        else{
                                            
                                        boolean existeDisciplina = false;
                                        int posicaoDisciplina = 0;
                                        
                                        for(int i = 0; i < disciplinas.size(); i++){
                                            if (novaDisciplina.equals(disciplinas.get(i).getNome()))
                                            {
                                                //DISCIPLINA ENCONTRADA
                                                existeDisciplina = true;
                                                posicaoDisciplina = i;
                                            }
                                        }
                                            if(existeDisciplina == true){
                                                if (cursos.get(posicao).conferirDisciplina(novaDisciplina) == true){
                                                    System.out.println("O curso ja possui essa disciplina!\n");
                                                }
                                                else{
                                                cursos.get(posicao).adicionarDisciplina(disciplinas.get(posicaoDisciplina));
                                                System.out.println("\nDisciplina adicionada com sucesso!\n");  
                                                }
                                                
                                            }
                                            else{
                                                System.out.println("\nERRO: A disciplina " + novaDisciplina + " nao existe!\n");
                                                break;
                                            }
                                        }
                                        
                                    }
                                    else if (menuEditar == 3){
                                        //REMOVER DISCIPLINA
                                        buffer = input.nextLine();
                                        System.out.println("Digite o nome da disciplina a ser removida: ");
                                 
                                        String removeDisciplina = input.nextLine();
                                                                                
                                        
                                        //CONFERIR SE A DISCIPLINA EXISTE
                                        if (disciplinas.isEmpty()){
                                            System.out.println("ERRO: Nao ha disciplinas cadastrados!\n");
                                            break;
                                        }
                                        else{
                                            
                                        boolean existeDisciplina = false;
                                        
                                        
                                        for(int i = 0; i < disciplinas.size(); i++){
                                            if (removeDisciplina.equals(disciplinas.get(i).getNome()))
                                            {
                                                //DISCIPLINA ENCONTRADA
                                                existeDisciplina = true;
                                                
                                            }
                                        }
                                            if(existeDisciplina == true){
                                                
                                                cursos.get(posicao).removerDisciplina(removeDisciplina);
                                                System.out.println("\nDisciplina removida com sucesso!\n");                                    
                                            }
                                            else{
                                                System.out.println("\nERRO: A disciplina " + removeDisciplina + " nao existe!\n");
                                                break;
                                            }
                                        }
                                        
                                    }
                                    else{
                                        System.out.println("Opcao invalida!\n");
                                        break;
                                    }
                                }
                                
                            }
                            else{
                                System.out.println("ERRO: O curso " + nomeCurso + " nao existe!\n");
                            }
                        }
                        }
                    else if(submenu == 4){
                        //EDITAR DISCIPLINAS
                        String buffer = input.nextLine();
                        System.out.println("Digite o nome da disciplina para alterar: ");
                        String nomeDisciplina = input.nextLine();
                        
                        //VER SE A DICIPLINA EXISTE
                        if (disciplinas.isEmpty()){
                            System.out.println("ERRO: Nao ha disciplinas cadastrados!\n");
                            break;
                        }
                        else{

                        boolean existeDisciplina = false;
                        int posicaoDisciplina = 0;

                        for(int i = 0; i < disciplinas.size(); i++){
                            if (nomeDisciplina.equals(disciplinas.get(i).getNome()))
                            {
                                //DISCIPLINA ENCONTRADA
                                existeDisciplina = true;
                                posicaoDisciplina = i;
                            }
                        }
                            if(existeDisciplina == true){

                                int menuEditar = 100;                                
                                
                                while (menuEditar != 0){
                                    buffer = input.nextLine();
                                    System.out.println("1. Editar nome da disciplina " + disciplinas.get(posicaoDisciplina).getNome());
                                    System.out.println("2. Editar quantiade de ECTS da disciplina " + disciplinas.get(posicaoDisciplina).getNome());
                                    System.out.println("3. Editar o idioma da disciplina " + disciplinas.get(posicaoDisciplina).getNome());
                                    System.out.println("4. Adicionar professor na disciplina " + disciplinas.get(posicaoDisciplina).getNome());
                                    System.out.println("5. Remover professor da disciplina " + disciplinas.get(posicaoDisciplina).getNome());
                                    System.out.println("0. Voltar\n\nDigite sua opcao: ");
                                    
                                    try{
                                       menuEditar = input.nextInt(); 
                                    }catch(InputMismatchException exception){
                                       System.out.println("ERRO: O input deve ser um numero inteiro!");
                                       String lixBuffer = input.nextLine();
                                       break;
                                    }
                                    
                                    
                                    if (menuEditar == 0){
                                        break;
                                    }
                                    else if( menuEditar == 1){
                                        //EDITAR NOME
                                        buffer = input.nextLine();
                                        System.out.println("Alterar nome " + disciplinas.get(posicaoDisciplina).getNome() + " para: ");
                                        String novoNome = input.nextLine();
                                        disciplinas.get(posicaoDisciplina).setNome(novoNome);
                                        System.out.println("Nome alterado com sucesso!\n");
                                    }
                                    else if( menuEditar == 2){
                                        //EDITAR QUANTIDADE DE ECTS
                                        buffer = input.nextLine();
                                        System.out.println("Alterar ECTS " + disciplinas.get(posicaoDisciplina).getEcts() + " para: ");
                                        int novoEct = input.nextInt();
                                        disciplinas.get(posicaoDisciplina).setEcts(novoEct);
                                        System.out.println("ETCS alterado com sucesso!\n");
  
                                    }
                                    else if( menuEditar == 3){
                                        //EDITAR IDIOMA
                                        buffer = input.nextLine();
                                        System.out.println("Alterar idioma " + disciplinas.get(posicaoDisciplina).getIdioma() + " para: ");
                                        String novoIdioma = input.nextLine();
                                        disciplinas.get(posicaoDisciplina).setIdioma(novoIdioma);
                                        System.out.println("Idioma alterado com sucesso!\n");
                                        
                                    }
                                    else if( menuEditar == 4){
                                        //ADICIONAR PROFESSOR
                                        buffer = input.nextLine();
                                        System.out.println("Digite o nome do professor para adicionar: ");
                                        String novoProfessor = input.nextLine();
                                        
                                        if (professores.isEmpty()){
                                        System.out.println("ERRO: Nao ha professores cadastrados!\n");
                                        break;
                                    }
                                    else{
                                        //CONFERIR SE O PROFESSOR EXISTE
                                        boolean existeProf = false;
                                        int posicaoProf = 0;
                                        
                                        for (int i = 0; i < professores.size(); i++){
                                            if(novoProfessor.equals(professores.get(i).getNome())){
                                                existeProf = true;
                                                posicaoProf = i;
                                            }
                                        }
                                        
                                        if (existeProf == true){
                                            if (disciplinas.get(posicaoDisciplina).conferirProfessor(novoProfessor) == true){
                                                System.out.println("O professor " + novoProfessor + " ja esta na disciplina!\n");
                                                break;
                                            }
                                            else{
                                                disciplinas.get(posicaoDisciplina).adicionarProfessor(professores.get(posicaoProf));
                                                System.out.println("Professor adicionado com sucesso!\n");
                                            }
                                        }
                                        else{
                                            System.out.println("ERRO: O professor " + novoProfessor + " nao existe!\n");
                                            break;
                                        }
                                        }
                                    }
                                    else if( menuEditar == 5){
                                        //REMOVER PROFESSOR
                                        buffer = input.nextLine();
                                        System.out.println("Digite o nome do professor para remover: ");
                                        String removeProfessor = input.nextLine();
                                        
                                        if (professores.isEmpty()){
                                        System.out.println("ERRO: Nao ha professores cadastrados!\n");
                                        break;
                                    }
                                    else{
                                        //CONFERIR SE O PROFESSOR EXISTE
                                        boolean existeProf = false;
                                        int posicaoProf = 0;
                                        
                                        for (int i = 0; i < professores.size(); i++){
                                            if(removeProfessor.equals(professores.get(i).getNome())){
                                                existeProf = true;
                                                posicaoProf = i;
                                            }
                                        }
                                        
                                        if (existeProf == true){
                                            if (disciplinas.get(posicaoDisciplina).conferirProfessor(removeProfessor) == false){
                                                System.out.println("O professor " + removeProfessor + " nao esta na disciplina!\n");
                                                break;
                                            }
                                            else{
                                                disciplinas.get(posicaoDisciplina).removerProfessor(professores.get(posicaoProf));
                                                System.out.println("Professor removido com sucesso!\n");
                                            }
                                        }
                                        else{
                                            System.out.println("ERRO: O professor " + removeProfessor + " nao existe!\n");
                                            break;
                                        }
                                        }
                                    }
                                    else{
                                        System.out.println("Opcao invalida!\n");
                                        break;
                                    }
                                }
                            }
                            else{
                                System.out.println("\nERRO: A disciplina " + nomeDisciplina + " nao existe!\n");
                                break;
                            }
                                        }
                        
                        
                    }
                    else if(submenu == 0){
                        break;
                    }
                    else{
                        System.out.println("Numero Invalido!\n\n");
                    }
                }
            }
            
            else
            {
                System.out.println("Opcao invalida!\n");
            }  
            
            }
    }
}