package tarjeta.bancaria;

import javax.swing.JOptionPane;

public class Debito {
    String NombreDeTarjetaDebito;
    double Saldodebito=0;
    String NumeroDeTarjetaDebito;
    double SaldoActual=0;
    double Deposito=0;
    double CompraDebito=0;
    
    public void setDebito(String deb){
    if (deb.length()==0){
        JOptionPane.showMessageDialog(null, "Martercard");
    }
    NombreDeTarjetaDebito=deb;
    }
    public String getDebito(){
    return NombreDeTarjetaDebito;
    }
    public void setNumero(String num){
    if (num.length()==0){
        JOptionPane.showMessageDialog(null, "0909202032459067");
    }
    NumeroDeTarjetaDebito=num;
    }
    public String getNumero(){
    return NumeroDeTarjetaDebito;
    }
    public void setSaldodebito(double sal){
    if (sal<0){
        JOptionPane.showMessageDialog(null, "Q. 3,555.50");
    }
    Saldodebito=Saldodebito+sal;
    }
    public void setSaldoActual(double salac){
    if (salac<0){
        JOptionPane.showMessageDialog(null, "Q. 1,900.00");
    }
    SaldoActual=SaldoActual+salac;
    }
    public void setDeposito(double depo){
    if (depo<0){
        JOptionPane.showMessageDialog(null, "Q. 3,900.00/mes");
    }
    Deposito=Deposito+depo;
    }
    public void setCompraBebito(double comdeb){
    if (comdeb<0){
        JOptionPane.showMessageDialog(null, "Q. 450.00");
    }
    CompraDebito=CompraDebito-comdeb;
    }
}
