package entities;

public class ContaBanco {

  public Integer numero;
  public String agencia;
  public String nomeDoCliente;
  public Double saldo;

  public ContaBanco(){}

  public ContaBanco(Integer numero, String agencia, String nomeDoCliente, Double saldo){
    this.numero = numero;
    this.agencia = agencia;
    this.nomeDoCliente = nomeDoCliente;
    this.saldo = saldo;
  }

  

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNomeDoCliente() {
    return nomeDoCliente;
  }

  public void setNomeDoCliente(String nomeDoCliente) {
    this.nomeDoCliente = nomeDoCliente;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return 
    "-----------------------ContaBanco----------------------"+"\n"
                                 + " Número = " + numero +"\n"
                                 + " Agência = " + agencia +"\n"
                                 + " Nome do usuario = " + nomeDoCliente +"\n"
                                 + " Saldo = " + saldo +"\n" +
    "------------------------------------------------------- ";
  }
}
