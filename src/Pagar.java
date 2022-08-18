public class Pagar implements Pago {
  private float cantidad;

  public Pagar(float cantidad) {
    this.cantidad = cantidad;
  }

  public void pagarTC() {
    System.out.println("Se ha pagado un total de $" + this.cantidad + " con Tarjeta de Credito");
    System.exit(0);
  }
  
  public void pagarPaypal() {
    System.out.println("Se ha pagado un total de $" + this.cantidad + " con Paypal");
    System.exit(0);
  }

  public void pagarPersonal() {
    System.out.println("Se ha pagado un total de $" + this.cantidad + " con Credito Personal");
    System.exit(0);
  }

  public void pagarTransferencia() {
    System.out.println("Se ha pagado un total de $" + this.cantidad + " con Transferencia Bancaria");
    System.exit(0);
  }
}
