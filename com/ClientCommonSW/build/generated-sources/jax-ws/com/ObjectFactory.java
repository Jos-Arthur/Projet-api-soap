
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DecompositionNP_QNAME = new QName("http://com/", "DecompositionNP");
    private final static QName _DecompositionNPResponse_QNAME = new QName("http://com/", "DecompositionNPResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://com/", "helloResponse");
    private final static QName _Factoriel_QNAME = new QName("http://com/", "Factoriel");
    private final static QName _FactorielResponse_QNAME = new QName("http://com/", "FactorielResponse");
    private final static QName _CalculPGCDResponse_QNAME = new QName("http://com/", "CalculPGCDResponse");
    private final static QName _Hello_QNAME = new QName("http://com/", "hello");
    private final static QName _CalculPGCD_QNAME = new QName("http://com/", "CalculPGCD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FactorielResponse }
     * 
     */
    public FactorielResponse createFactorielResponse() {
        return new FactorielResponse();
    }

    /**
     * Create an instance of {@link Factoriel }
     * 
     */
    public Factoriel createFactoriel() {
        return new Factoriel();
    }

    /**
     * Create an instance of {@link DecompositionNPResponse }
     * 
     */
    public DecompositionNPResponse createDecompositionNPResponse() {
        return new DecompositionNPResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link DecompositionNP }
     * 
     */
    public DecompositionNP createDecompositionNP() {
        return new DecompositionNP();
    }

    /**
     * Create an instance of {@link CalculPGCD }
     * 
     */
    public CalculPGCD createCalculPGCD() {
        return new CalculPGCD();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CalculPGCDResponse }
     * 
     */
    public CalculPGCDResponse createCalculPGCDResponse() {
        return new CalculPGCDResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecompositionNP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "DecompositionNP")
    public JAXBElement<DecompositionNP> createDecompositionNP(DecompositionNP value) {
        return new JAXBElement<DecompositionNP>(_DecompositionNP_QNAME, DecompositionNP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecompositionNPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "DecompositionNPResponse")
    public JAXBElement<DecompositionNPResponse> createDecompositionNPResponse(DecompositionNPResponse value) {
        return new JAXBElement<DecompositionNPResponse>(_DecompositionNPResponse_QNAME, DecompositionNPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factoriel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "Factoriel")
    public JAXBElement<Factoriel> createFactoriel(Factoriel value) {
        return new JAXBElement<Factoriel>(_Factoriel_QNAME, Factoriel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactorielResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "FactorielResponse")
    public JAXBElement<FactorielResponse> createFactorielResponse(FactorielResponse value) {
        return new JAXBElement<FactorielResponse>(_FactorielResponse_QNAME, FactorielResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculPGCDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "CalculPGCDResponse")
    public JAXBElement<CalculPGCDResponse> createCalculPGCDResponse(CalculPGCDResponse value) {
        return new JAXBElement<CalculPGCDResponse>(_CalculPGCDResponse_QNAME, CalculPGCDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculPGCD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "CalculPGCD")
    public JAXBElement<CalculPGCD> createCalculPGCD(CalculPGCD value) {
        return new JAXBElement<CalculPGCD>(_CalculPGCD_QNAME, CalculPGCD.class, null, value);
    }

}
