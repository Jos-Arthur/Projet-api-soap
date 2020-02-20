
package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CalculPGCD complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CalculPGCD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entierA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="entierB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculPGCD", propOrder = {
    "entierA",
    "entierB"
})
public class CalculPGCD {

    protected int entierA;
    protected int entierB;

    /**
     * Obtient la valeur de la propriété entierA.
     * 
     */
    public int getEntierA() {
        return entierA;
    }

    /**
     * Définit la valeur de la propriété entierA.
     * 
     */
    public void setEntierA(int value) {
        this.entierA = value;
    }

    /**
     * Obtient la valeur de la propriété entierB.
     * 
     */
    public int getEntierB() {
        return entierB;
    }

    /**
     * Définit la valeur de la propriété entierB.
     * 
     */
    public void setEntierB(int value) {
        this.entierB = value;
    }

}
