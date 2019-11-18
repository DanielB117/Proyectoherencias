
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangulo Rec = new Rectangulo();
        Cuadrado Cua = new Cuadrado();
        TrianguloIsosceles TrianIsos = new TrianguloIsosceles();
        TrianguloEscaleno TrianEsca = new TrianguloEscaleno();
        TrianguloEquilatero TrianEqui = new TrianguloEquilatero();
        Circulo Cir = new Circulo();
        
        System.out.println("Menu");
        System.out.println("Escoga una opcion");
        System.out.println("- 1. Ver figuras");
        System.out.println("- 2. Calcular area o perimetro de alguna figura que desee ");
        System.out.println("opcion");
        int opcion = sc.nextInt();


        if (opcion == 1){
            do {
                System.out.println("Figuras");
                System.out.println();
                System.out.println("Escoga la figura que desee ver");
                System.out.println();
                System.out.println("1. Cuadrado");
                System.out.println("2. Triangulo Isosceles");
                System.out.println("3. Rectangulo");
                System.out.println("4. Triangulo Escaleno");
                System.out.println("5. Triangulo Equilatero");
                System.out.println("6. Circulo");
                System.out.println();
                System.out.println("opcion");
                opcion = sc.nextInt();

                if (opcion == 1) {
                    Cua.datosCuadrado();
                    System.out.println();
                    System.out.println("que desea hacer");
                    System.out.println("1. Seguir");
                    System.out.println("0. salir");
                    opcion = sc.nextInt();
                }

                if (opcion == 2) {
                    TrianIsos.datosTrianIsos();
                    System.out.println();
                    System.out.println("que desea hacer");
                    System.out.println("1. Seguir");
                    System.out.println("0. salir");
                    opcion = sc.nextInt();
                }

                if (opcion == 3) {
                    Rec.datosRectangulo();
                    System.out.println();
                    System.out.println("que desea hacer");
                    System.out.println("1. Seguir");
                    System.out.println("0. salir");
                    opcion = sc.nextInt();
                }

                if (opcion == 4) {
                    TrianEsca.datosTrianEsca();
                    System.out.println();
                    System.out.println("que desea hacer");
                    System.out.println("1. Seguir");
                    System.out.println("0. salir");
                    opcion = sc.nextInt();
                }

                if (opcion == 5) {
                    TrianEqui.datosTrianEqui();
                    System.out.println();
                    System.out.println("que desea hacer");
                    System.out.println("1. Seguir");
                    System.out.println("0. salir");
                    opcion = sc.nextInt();
                }

                if (opcion == 6) {
                    Cir.datosCirculo();
                    System.out.println();
                    System.out.println("que desea hacer");
                    System.out.println("1. Seguir");
                    System.out.println("0. salir");
                    opcion = sc.nextInt();
                }


            }while (opcion != 0);
        }


        if (opcion==2) {

            System.out.println("Calcular el area o perimetro");
            System.out.println("Escoga una opcion");
            System.out.println("1- Calcular area");
            System.out.println("2- Calcular perimetro");
            System.out.println("0-Para salir");
            System.out.println();
            System.out.println("Opcion");
            opcion = sc.nextInt();


            if (opcion == 1) {
                do {
                    System.out.println("Escoga una opcion para sacar el area");
                    System.out.println();
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Triangulo Isosceles");
                    System.out.println("3. Rectangulo");
                    System.out.println("4. Triangulo Escaleno");
                    System.out.println("5. Triangulo Equilatero");
                    System.out.println("6. Circulo");
                    System.out.println("0. Salir");
                    System.out.println();
                    System.out.println("Opcion");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        Cua.areaCuadrado();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 2) {
                        TrianIsos.areaTrianIsos();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 3) {
                        Rec.areaRectangulo();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 4) {
                        TrianEsca.areaTrianEsca();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 5) {
                        TrianEqui.areaTrianEqui();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }


                    if (opcion == 6) {
                        Cir.areaCirculo();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }
                }while(opcion != 0);
            }

            if (opcion == 2) {
                do {
                    System.out.println("-----Escoga una opcion para sacar el Perimetro-----");
                    System.out.println();
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Triangulo Isosceles");
                    System.out.println("3. Rectangulo");
                    System.out.println("4. Triangulo Escaleno");
                    System.out.println("5. Triangulo Equilatero");
                    System.out.println("6. Circulo");
                    System.out.println("0. Salir");
                    System.out.println();
                    System.out.println("opcion");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        Cua.perimetroCuadrado();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 2) {
                        TrianIsos.perimetroTrianIsos();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 3) {
                        Rec.perimetroRectangulo();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 4) {
                        TrianEsca.perimetroTrianEsca();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 5) {
                        TrianEqui.perimetroTrianEqui();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 6) {
                        Cir.perimetroCirculo();
                        System.out.println();
                        System.out.println("que desea hacer");
                        System.out.println("1. Seguir");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                }while(opcion != 0);
            }

            if (opcion == 0) {
                System.out.println("Fin de la operacion");
            }
        }


    }
}
