package org.example;

import org.example.paqueteDos.Animal;

public class Main {
    public static void main(String[] args) {
    /*las funciones se usan llamndolas
        int resultado=sumar(5,10);
        System.out.printf("la suma es : "+resultado);*/
        //para usar la clase animal debo crear un objeto de dicha clase
        //¿que es un objeto? es una variable especial que pérmite que yo acceda alos atributos  metodos de una clase
        //variable siemple java
        Integer edad=11;

        //variable tipo objeto
        Animal objeto=new Animal(1,"nana");
        Animal objeto2=new Animal(5,"leona");




    /*public static int sumar( int numero1,int numero2){
        return  numero1+numero2;}*/


    //objetos veterinario vacio/lleno
    Veterinario objeto3=new Veterinario();
    Veterinario objeto4=new Veterinario(5,"ale","123");

    //accediendo a los atributos de una clase desde un objeto
    //pongo el nombre del objeto.nombre del atributo que quiero acceder

    objeto4.

}
}