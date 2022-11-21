package Pincipal;

import Numeros.Racional;

public class Main {
  public static void main(String[] args) {
    Racional racionalA = new Racional(4,8);
    Racional racionalB = new Racional(8,16);

    System.out.println("El valor del primer numero Racional es " + racionalA);
    System.out.println("El valor del primer numero Racional es " + racionalB);
    System.out.println("El valor del numerador del numero racioanl " + racionalB + "es :" + racionalA.getNumerador());
    System.out.println("La suma de los numeros Racionales " + racionalA + " + " + racionalB + " es " + racionalA.sumar(racionalA, racionalB));
    System.out.println("La suma de los numeros Racionales " + racionalA + " + " + racionalB + " es " + racionalA.sumar(racionalB));
    System.out.println("La suma de los numeros Racionales " + racionalA + " + " + racionalB + " es " + racionalB.sumar(racionalA));
    //Completar
    System.out.println("Los numeros racionales " + racionalA + " + " + racionalB + " "
      + (racionalA.igualesR(racionalA, racionalB) ? "son iguales" : "son distintos"));

  }
}
