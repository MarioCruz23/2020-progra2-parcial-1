package tarjeta.bancaria;

import javax.swing.JOptionPane;

public class TarjetaBancaria {

    String TarjetaDeCredito;
    String TarjetaDeDebito;
       
    public void setCredito(String cre) {
        if (cre.length()==0){
            JOptionPane.showMessageDialog(null, "Visa");
        }
        TarjetaDeCredito=cre;
    }
    public String getCredito(){
    return TarjetaDeCredito;
    }
    public void setDebito(String deb) {
        if (deb.length()==0){
            JOptionPane.showMessageDialog(null, "Mastercard");
        }
        TarjetaDeCredito=deb;
    }
    public String getDebito(){
    return TarjetaDeDebito;
    }    
    public static void main(String[] arg){
    TarjetaBancaria objTarjetaBancaria =new TarjetaBancaria();
    String cre, deb;
    cre=JOptionPane.showInputDialog("Ingrese el Nombre de la Tarjeta de Credito");
    deb=JOptionPane.showInputDialog("Ingrese el Nombre de la Tarjeta de Debito");
    objTarjetaBancaria.setCredito(cre);
    objTarjetaBancaria.setDebito(deb);
    
    JOptionPane.showMessageDialog(null, "Nombre de tarjeta Credito"+objTarjetaBancaria.getCredito());
    JOptionPane.showMessageDialog(null, "Nombre de tarjeta Debito"+objTarjetaBancaria.getDebito());
    
    Credito objCredito= new Credito();
        String ocre, inte, ecre, cntar, cantidad, com, pag;
        ocre=JOptionPane.showInputDialog("Ingrese el limite de credito");
        inte=JOptionPane.showInputDialog("Ingrese el los intereses de la tarjeta");
        ecre=JOptionPane.showInputDialog("Ingrese el limite automatico de la tarjeta");
        cntar=JOptionPane.showInputDialog("Ingrese el numero de tarjeta 09092020-");
        cantidad=JOptionPane.showInputDialog("Ingrese el saldo actual de la tarjeta");
        com=JOptionPane.showInputDialog("Ingrese la compra realizada");
        pag=JOptionPane.showInputDialog("Ingrese el pago a realizar");
        objCredito.setCNumeroDeTarjeta(cntar);
        objCredito.setCompra(0);
        objCredito.setOCredito(ocre);
        objCredito.setIntereses(inte);
        objCredito.setSaldo(0);
        objCredito.setPago(0);
        objCredito.setECredito(ecre);
        JOptionPane.showMessageDialog(null, "Limite de la tarjeta"+objCredito.getOCredito());
        JOptionPane.showMessageDialog(null, "Intereses"+objCredito.getIntereses());
        JOptionPane.showMessageDialog(null, "Numero de tarjeta"+objCredito.getNumeroDeTarjeta());
        JOptionPane.showMessageDialog(null, "Limite automatico"+objCredito.getECredito());
        JOptionPane.showMessageDialog(null, "Numero de tarjeta 09092020-"+objCredito.getCNumeroDeTarjeta());
        System.out.print("");
        System.out.print("Saldo actual "+cantidad+"");
        System.out.print("");
        System.out.print("Compra "+com+"");
        System.out.print("");
        System.out.print("pago"+pag+"");
        
        Debito objDebito = new Debito();
        String num, sal, salac, depo, comdeb;
        sal=JOptionPane.showInputDialog("Ingrese el limite de saldo");
        num=JOptionPane.showInputDialog("Ingrese el numero de tarjeta 09092020-");
        salac=JOptionPane.showInputDialog("Ingrese el saldo actual");
        depo=JOptionPane.showInputDialog("Ingrese el deposito");
        comdeb=JOptionPane.showInputDialog("Ingrese las compras realizadas");
        objDebito.setCompraBebito(0);
        objDebito.setDeposito(0);
        objDebito.setNumero(num);
        objDebito.setSaldoActual(0);
        objDebito.setSaldodebito(0);
        JOptionPane.showMessageDialog(null, "Limite de saldo"+sal);
        JOptionPane.showMessageDialog(null, "Numero de tarjeta 09092020-"+objDebito.getNumero());
        JOptionPane.showMessageDialog(null, "Saldo actual"+salac);
        JOptionPane.showMessageDialog(null, "Deposito"+depo);
        JOptionPane.showMessageDialog(null, "Compras realizadas"+comdeb);
    
    }
    
}
