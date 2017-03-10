/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Estudiantes
 */
public class Tablero {

    int jugador;
    char ficha;
    
    void calculartriqui(){  
    }
    public String Asignacion(){
        //En turno vamos a definir si es una X o una Y
    //0 es X
    //1 es Y
    int turno=0;
       
    if(turno==0){
            turno=1;
            return("X");
        }else{
            turno=0;
             return("O");
    }
}
}

    

    
    

