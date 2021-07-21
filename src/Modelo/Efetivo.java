/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Felipe de Freitas
 */
public class Efetivo extends Docente{
    private String area;
    
    public Efetivo(){
        super();
    }
    
    public Efetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area){
        super(codigo, nome, salario, nivel, titulacao);
        this.area = area;
    }
    
    @Override
    public double calcularSalario(){
        //Salario do efetivo * constante + 5%
        if (nivel.equals("D1")){
            salario = salario*Constantes.D1*1.05;
        }
        else if(nivel.equals("D2")){
            salario = salario*Constantes.D2*1.05;
        }
        else{
            salario = salario*Constantes.D3*1.05;
        }
        return salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
