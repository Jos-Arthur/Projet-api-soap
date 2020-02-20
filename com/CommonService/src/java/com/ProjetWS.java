/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jose-arthur
 */
@WebService(serviceName = "ProjetWS")
public class ProjetWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Factoriel")
    public int Factoriel(@WebParam(name = "entier") int entier) {
        //TODO write your implementation code here:
        if (entier == 0 || entier == 1) {
            return 1;
        } else {
            return entier * Factoriel(entier - 1);
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CalculPGCD")
    public int CalculPGCD(@WebParam(name = "entierA") int entierA, @WebParam(name = "entierB") int entierB) {
        //TODO write your implementation code here:
        if (entierA == entierB) {
            return entierA;
        } else {
            if (entierA > entierB) {
                return CalculPGCD(entierA - entierB, entierB);
            } else {
                return CalculPGCD(entierB - entierA, entierA);
            }
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DecompositionNP")
    public ArrayList<Integer> DecompositionNP(@WebParam(name = "entier") int entier) {
        //TODO write your implementation code here:
        ArrayList listeEntier = new ArrayList<>();
        
        if (entier < 2) {
            listeEntier.add(1);
        }
        
        for (int i=2; i <= entier; i++) {
          while(entier % i ==  0) {
                listeEntier.add(i);
                entier /= i;
               
            }
        }

        return listeEntier;
    }

    public static void main(String[] args) {
//        ProjetWS nb = new ProjetWS();
//        int nombre = 4;
//        int a = 24, b = 10;
//        ArrayList decomp=  nb.DecompositionNP(4);
//        System.out.println(nb.Factoriel(nombre));
//        System.out.println(nb.CalculPGCD(a, b));
//        
//        for (int i=0; i<decomp.size(); i++){
//             System.out.println(decomp.get(i));
//        }
       
    }
}
