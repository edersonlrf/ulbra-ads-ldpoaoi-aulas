/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Aluno {

    private String nome;
    private int cgu;
    private String dataNascimento;
    
    // Construtor 1
    public Aluno(){
        nome = "";
        cgu = 0;
        dataNascimento = "";
    }
    
    // Construtor 2
    public Aluno(String n, int c, String d){
        nome = n;
        cgu = c;
        dataNascimento = d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCgu() {
        return cgu;
    }

    public void setCgu(int cgu) {
        this.cgu = cgu;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int calculaIdade() {
        return 0;
    }
    
}
