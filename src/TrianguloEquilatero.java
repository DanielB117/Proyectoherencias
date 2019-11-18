
import java.util.Scanner;

public class TrianguloEquilatero extends Triangulos {

    Scanner sc =new Scanner(System.in);

    public void areaTrianEqui() {

        int lado;
        double area;
        System.out.println("Escriba el lado del Triangulo");
        lado = sc.nextInt();
        area = Math.sqrt(3)/4 * (lado * lado);

        System.out.println("El area del Triangulo Equilatero es: " + area);


    }

    public void perimetroTrianEqui(){
        int lado;
        int perimetro;

        System.out.println("Escriba el lado del Triangulo");
        lado = sc.nextInt();

        perimetro = lado * 3;

        System.out.println("El perimetro del Triangulo Equilatero es: " + perimetro);
    }

    public void datosTrianEqui(){
        System.out.println("-----Datos figura-----");

        System.out.println("- Figura: Triangulo Equilatero");
        System.out.println("- Lado: 30");
        System.out.println("- Area: 389.711431");
        System.out.println("- Perimetro: 90");
        System.out.println("- Ubicado en el cuadrante 2, con coordenadas en x: 29 y Y: -29");

    }























    public void setArea(double e_area) {

        area = e_area;

    }

    public void setPerimetro(double e_perimetro) {

        perimetro = e_perimetro;

    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
}
