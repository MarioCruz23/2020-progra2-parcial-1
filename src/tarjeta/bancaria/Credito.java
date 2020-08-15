package tarjeta.bancaria;

import javax.swing.JOptionPane;

public class Credito {
     String OCredito;
    String NombreDeTarjeta;
    String Intereses;
    String NumeroDeTarjeta;
    double Saldo=0;
    double Compra=0;
    double Pago=0;
    String ECredito;
    String CNumeroDeTarjeta;
    
    public void setCredito(String cre){
    if (cre.length()==0){
        JOptionPane.showMessageDialog(null, "Visa");
    }
    NombreDeTarjeta=cre;
    }
    public String getCredito(){
    return NombreDeTarjeta;
    }
    public void setOCredito(String ocre){
    if (ocre.length()==0){
        JOptionPane.showMessageDialog(null, "Q.1,657.89");
    }
    OCredito=ocre;
    }
    public String getOCredito(){
    return OCredito;
    }
    public void setIntereses(String inte){
    if (inte.length()==0){
        JOptionPane.showMessageDialog(null, "Q. 478.57");
    }
    Intereses=inte;
    }
    public String getIntereses(){
    return Intereses;
    }
    public void setNumeroDeTarjeta(String ntar){
    if (ntar.length()==0){
        JOptionPane.showMessageDialog(null, "0909202034569829");
    }
    NumeroDeTarjeta=ntar;
    }
    public String getNumeroDeTarjeta(){
    return NumeroDeTarjeta;
    }
    public void setECredito(String ecre){
    if (ecre.length()==0){
        JOptionPane.showMessageDialog(null, "Q. 10,000");
    }
    ECredito=ecre;
    }
    public String getECredito(){
    return ECredito;
    }
    public void setCNumeroDeTarjeta(String cntar){
    if (cntar.length()==0){
        JOptionPane.showMessageDialog(null, "0909202034569829");
    }
    CNumeroDeTarjeta=cntar;
    }
    public String getCNumeroDeTarjeta(){
    return CNumeroDeTarjeta;
    }
    public void setSaldo(double cantidad){
    if (cantidad<0){
        JOptionPane.showMessageDialog(null, "Q. 5,000.00");
    }
    Saldo=Saldo+cantidad;
    }
    public void setCompra(double com){
    if (com<0){
        JOptionPane.showMessageDialog(null, "Q. 450.00");
    }
    Compra=Compra-com;
    }
    public void setPago(double pag){
    if (pag<0){
        JOptionPane.showMessageDialog(null, "Q. 900.00");
    }
    Pago=Pago+pag;
    }   
}
