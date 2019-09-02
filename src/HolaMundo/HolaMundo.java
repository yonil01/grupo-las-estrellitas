/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author rojas
 */

public class HolaMundo {
    int suma(int nro1,int nro2){
        return (nro1+nro2);
    }
    int multiplicacion(int nro1,int nro2){
        return (nro1*nro2);
    }
    public static void main(String[] args) {
        HolaMundo n=new HolaMundo();
        int n1;
        int n2;
        Scanner cin=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n1=cin.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2=cin.nextInt();
         System.out.println("La suma es:"+n.suma(n1, n2));
        System.out.println("La multiplicacion es : "+n.multiplicacion(n1, n2));
    }
}
