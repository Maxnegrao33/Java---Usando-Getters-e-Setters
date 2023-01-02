/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.executavel;

//Chamando a classe Aluno
import cursojava.classes.Aluno;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Maciel Oliveira
 * Engenheiro da Computação
 * Pós em Engenharia de Software
 * Dev. full Stack
 */
public class AprendizadoJava {

    //Main é o objeto principal Java
    public static void main(String[] args) {
     
        //Criando uma instância Aluno na Memória (Criação de Objeto) 
        //Aluno1 é una referência para o objeto aluno
        
        //Aluno1 = Pelé
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Edson Arantes do Nascimento");
        aluno1.setIdade(45);
        aluno1.setDataNascimento("21/09/1940");
        aluno1.setEndereco("Rua Das Flores");
        aluno1.setRegistroGeral("26.451.655-4");
        aluno1.setNumeroCPF("154.187.156-89");
        aluno1.setNomeMae("Celeste Arantes");
        aluno1.setNomePai("Dondinho do Nascimento");
        aluno1.setTelefoneResponsavel("+55 35 1234-5678");
        aluno1.setDataMatricula("01/02/1956");
        aluno1.setNomeEscola("Santos Futebol Clube");
        aluno1.setCurso("Camisa 10");
        aluno1.setSerieMatriculado("Confederação Brasileira de Futebol");
        
                
        System.out.println("Seu Nome é: " + aluno1.getNome());
        System.out.println("Sua idade é: " + aluno1.getIdade());
        System.out.println("Nasceu em: " + aluno1.getDataNascimento());
        System.out.println("Mora em: " + aluno1.getEndereco());
        System.out.println("Seu RG é: " + aluno1.getRegistroGeral());
        System.out.println("Seu CPF é: " + aluno1.getNumeroCPF());
        System.out.println("Nome da sua mãe é: " + aluno1.getNomeMae());
        System.out.println("Nome do seu Pai: " + aluno1.getNomePai());
        System.out.println("telefone de Contato: " + aluno1.getTelefoneResponsavel());
        System.out.println("Matriculado em: " + aluno1.getDataMatricula());
        System.out.println("Nome da Escola: " + aluno1.getNomeEscola());
        System.out.println("Cursando: " + aluno1.getCurso());
        System.out.println("Sua série é " + aluno1.getSerieMatriculado());
        
        //Aluno2 = Garrincha
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Manoel Francisco dos Santos");
        aluno2.setIdade(45);
        aluno2.setDataNascimento("21/09/1939");
        aluno2.setEndereco("Rua Das Flores");
        aluno2.setRegistroGeral("26.453.655-4");
        aluno2.setNumeroCPF("254.187.156-89");
        aluno2.setNomeMae("Maria Aparecida de Almeida");
        aluno2.setNomePai("Manoel Pereira dos Santos");
        aluno2.setTelefoneResponsavel("+55 35 1234-5678");
        aluno2.setDataMatricula("01/02/1956");
        aluno2.setNomeEscola("Clube de Regatas Botafogo");
        aluno2.setCurso("Camisa 7");
        aluno2.setSerieMatriculado("Confederação Brasileira de Futebol");
        
                
        System.out.println("Seu Nome é: " + aluno2.getNome());
        System.out.println("Sua idade é: " + aluno2.getIdade());
        System.out.println("Nasceu em: " + aluno2.getDataNascimento());
        System.out.println("Mora em: " + aluno2.getEndereco());
        System.out.println("Seu RG é: " + aluno2.getRegistroGeral());
        System.out.println("Seu CPF é: " + aluno2.getNumeroCPF());
        System.out.println("Nome da sua mãe é: " + aluno2.getNomeMae());
        System.out.println("Nome do seu Pai: " + aluno2.getNomePai());
        System.out.println("telefone de Contato: " + aluno2.getTelefoneResponsavel());
        System.out.println("Matriculado em: " + aluno2.getDataMatricula());
        System.out.println("Nome da Escola: " + aluno2.getNomeEscola());
        System.out.println("Cursando: " + aluno2.getCurso());
        System.out.println("Sua série é " + aluno2.getSerieMatriculado());
        
        //Contrutor padrão
        Aluno aluno3 = new Aluno();
        
        //Contrutor com um parâmetro
        Aluno aluno4 = new Aluno("Maria");
        
        //Contrutor com dois parâmetros
        Aluno aluno5 = new Aluno();
    
    }
}
