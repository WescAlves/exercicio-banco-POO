package views;

import java.time.LocalDate;

import models.Cliente;
import models.ContaCorrente;
import models.ContaPoupanca;
import models.Endereco;
import models.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua dom zacarias rolim de moura", 263, "Cajazeiras");
        PessoaFisica wesley = new PessoaFisica(200.0, endereco, "40344409880", "Wesley", LocalDate.of(1998,05,02));
        ContaCorrente contaWesley = new ContaCorrente(wesley, 1, 1, 100, LocalDate.of(2023,9,29), 10);
        System.out.println(contaWesley.getSaldo());    
        contaWesley.depositar(100);
        System.out.println(contaWesley.getSaldo());
        if(contaWesley.sacar(350)==true){
            System.out.println("Sacado com sucesso");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        if(contaWesley.aplicarTaxa()){
            System.out.println("Taxa aplicada com suceso");
        }
        else{System.out.println("Saldo insuficiente, taxa não foi aplicada. Você tem 10 dias para regularizar sua situação");
        }
        System.out.println(contaWesley.getSaldo());



        ContaPoupanca wesleyPoupanca = new ContaPoupanca(wesley, 1, 1, 0, LocalDate.of(2023,9,29), 0.1);
        System.out.println(wesleyPoupanca.getSaldo());
        wesleyPoupanca.depositar(10);
        System.out.println(wesleyPoupanca.getSaldo());
        if(wesleyPoupanca.sacar(10)){
            System.out.println("Sacado com sucesso");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(wesleyPoupanca.getSaldo());
        wesleyPoupanca.depositar(3000);
        System.out.println(wesleyPoupanca.getSaldo());
        wesleyPoupanca.renderJuros();
        System.out.println(wesleyPoupanca.getSaldo());
    }
    
    
}   
