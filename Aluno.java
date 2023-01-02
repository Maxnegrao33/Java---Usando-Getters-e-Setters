/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava.classes;

/**
 @author Maciel Oliveira
 *Engenheiro da Computação
 * Pós em Engenharia de Software
 * Dev. full Stack
 */
public class Aluno {
    
    //Estes são os atributos (qualidades) do Aluno
    //Manteremos private para evitar o acesso 
    private String nome;
    private int idade;
    private String dataNascimento;
    private String endereco;
    private String registroGeral;
    private String numeroCPF;
    private String nomeMae;
    private String nomePai;
    private String telefoneResponsavel;
    private String dataMatricula;
    private String nomeEscola;
    private String curso;
    private String serieMatriculado;
    
    //Chamando o Construtor
    //Cria os dados na memória como Java
    public Aluno(){
       
    }
    public Aluno(String nomePadrao){
        nome = nomePadrao;
    }
    
    public Aluno(String nomePadrao, int idadePadrao, String dataNascimentoPadrao, String enderecoPadrao,
                 String registroGeralPadrao, String numeroCPFPadrao, String nomeMaePadrao, String nomePaiPadrao, 
                 String telefoneResponsavelPadrao, String dataMatriculaPadrao, String nomeEscolaPadrao, String      cursoPadrao, String serieMatriculadoPadrao) {
        
        nome = nomePadrao;
        idade = idadePadrao;
        dataNascimento = dataNascimentoPadrao;
        endereco = enderecoPadrao;
        registroGeral = registroGeralPadrao;
        numeroCPF = numeroCPFPadrao;
        nomeMae = nomeMaePadrao;
        nomePai = nomePaiPadrao;
        telefoneResponsavel  = telefoneResponsavelPadrao;
        dataMatricula = dataMatriculaPadrao;
        nomeEscola = nomeEscolaPadrao;
        curso = cursoPadrao;
        serieMatriculado = serieMatriculadoPadrao;
    }
    
    //Ver os Dados SETTERS e GETTERS}
    /*SET é para adicionar ou receber dados para os atributos
    Get é para retornar ou obter os atributos
    São presentes em todos os objetos Java*/
    
    
    //Estou usando o Apache NEtBeans
    /*O atalho para implementar Get e Set automaticamente
    é segurar pressionado Alt + Insert e escolher Getters and Setters*/
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome () {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }
    
    
}




