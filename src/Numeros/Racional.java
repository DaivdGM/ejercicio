package Numeros;

public class Racional {

  public static final int CONSTANTE = 1;

  private int numerador;
  private int denominador;

  public Racional() {
  }

  public Racional(int numerador) {
    this.numerador = numerador;
    this.denominador = CONSTANTE;
  }

  public Racional(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }

  public int getNumerador() {
    return numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public int getDenominador() {
    return denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }

  public String stringImprime() {
    return numerador + "/" + denominador;
  }

  public String toString() {
    return numerador + "/" + denominador;
  }

  public Racional sumar(Racional a, Racional b) {
    int resultadoNumerador;
    int resultadoDenominador;

    resultadoNumerador = a.getNumerador() * b.getDenominador() +  a.getDenominador() * b.getNumerador();
    resultadoDenominador = a.getDenominador() * b.getDenominador();

    return new Racional(resultadoNumerador, resultadoDenominador);
  }

  public Racional sumar(Racional a) {
    int resultadoNumerador;
    int resultadoDenominador;

    resultadoNumerador = a.getNumerador() * denominador +  a.getDenominador() * numerador;
    resultadoDenominador = a.getDenominador() * denominador;

    return new Racional(resultadoNumerador, resultadoDenominador);
  }

  public Racional restar(Racional a, Racional b) {
    int resultadoNumerador;
    int resultadoDenominador;

    resultadoNumerador = a.getNumerador() * b.getDenominador() - a.getDenominador() * b.getNumerador();
    resultadoDenominador = a.getDenominador() * b.getDenominador();

    return new Racional(resultadoNumerador, resultadoDenominador);
  }

  public Racional restar(Racional a) {
    int resultadoNumerador;
    int resultadoDenominador;

    resultadoNumerador = a.getNumerador() * denominador - a.getDenominador() * numerador;
    resultadoDenominador = a.getDenominador() * denominador;

    return new Racional(resultadoNumerador, resultadoDenominador);
  }

  public Racional multiplicar(Racional a, Racional b) {
    int resultadoNumerador;
    int resultadoDenominador;

    resultadoNumerador = a.getNumerador() * b.getNumerador();
    resultadoDenominador = a.getDenominador() * b.getDenominador();

    return new Racional(resultadoNumerador, resultadoDenominador);
  }

  public Racional multiplicar(Racional a) {
    int resultadoNumerador;
    int resultadoDenominador;

    resultadoNumerador = a.getNumerador() * numerador;
    resultadoDenominador = a.getDenominador() * denominador;

    return new Racional(resultadoNumerador, resultadoDenominador);
  }

  public boolean igualesR(Racional a, Racional b) {
    return a.getNumerador() * b.getDenominador() == a.getDenominador() * b.getNumerador();
  }

}
