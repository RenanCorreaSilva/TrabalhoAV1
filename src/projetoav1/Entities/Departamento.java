/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoav1.Entities;

import java.io.Serializable;

public class Departamento implements Serializable{
    public Integer id;
    public String nome;
    
    public Departamento (Integer id, String nome){
        this.id = id;
        this.nome = nome;
    }
     
}


