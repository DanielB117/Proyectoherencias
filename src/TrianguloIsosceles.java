
import java.util.Scanner;

public class TrianguloIsosceles extends Triangulos{

    Scanner sc =new Scanner(System.in);

    public void areaTrianIsos(){

        double lado1;
        double lado2;
        double area;

        System.out.println("Escriba el primer lado");
        lado1 = sc.nextInt();
        System.out.println("Escriba el segundo lado");
        lado2 = sc.nextInt();
        area = lado2 * (Math.sqrt((lado1 * lado1) - ((lado2 * lado2)/4))/2);

        System.out.println("El area del Triangulo Isosceles es:" + area);

    }

    public void perimetroTrianIsos(){

        int lado1;
        int lado2;
        int perimetro;

        System.out.println("Escriba el primer lado");
        lado1 = sc.nextInt();

        System.out.println("Escriba el segundo lado");
        lado2 = sc.nextInt();

        perimetro = 2 * lado1 + lado2;
        System.out.println("El perimetro del Triangulo Isosceles es: " + perimetro);
    }

    public void datosTrianIsos() {

        System.out.println("Datos");

        System.out.println("- Figura: Triangulo Isosceles");
        System.out.println("- Lado 1: 6");
        System.out.println("- Lado 2: 8");
        System.out.println("- Area: 17.88854");
        System.out.println("- Perimetro: 38");
        System.out.println("- Ubicado en el cuadrante 4, con coordenadas en x: -16 y Y: 20");

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
