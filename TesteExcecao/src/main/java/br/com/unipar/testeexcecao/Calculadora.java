/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.testeexcecao;

/**
 *
 * @author andersonbosing
 */
public class Calculadora {

    private Double num1;
    private Double num2;

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public void divisao() throws ErroDivisao {

        if (num2 == 0.0) {
            throw new ErroDivisao();
        }

        Double result = num1 / num2;

        System.out.println(result);
    }

}
