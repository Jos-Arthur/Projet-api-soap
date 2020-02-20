/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientcommonsw;

/**
 *
 * @author jose-arthur
 */
public class ClientCommonSW {

    public static int calculPGCD(int entierA, int entierB) {
        com.ProjetWS_Service service = new com.ProjetWS_Service();
        com.ProjetWS port = service.getProjetWSPort();
        return port.calculPGCD(entierA, entierB);
    }

    public static java.util.List<java.lang.Integer> decompositionNP(int entier) {
        com.ProjetWS_Service service = new com.ProjetWS_Service();
        com.ProjetWS port = service.getProjetWSPort();
        return port.decompositionNP(entier);
    }

    public static int factoriel(int entier) {
        com.ProjetWS_Service service = new com.ProjetWS_Service();
        com.ProjetWS port = service.getProjetWSPort();
        return port.factoriel(entier);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        int nombre = 4;
//        System.out.println(factoriel(nombre));
    }

}
