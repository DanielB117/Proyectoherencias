
import java.util.Scanner;

public class Rectangulo extends Figuras {

    Scanner sc = new Scanner(System.in);

    public void areaRectangulo() {

        int base, altura, area;
        System.out.println("Escriba la base");
        base = sc.nextInt();
        System.out.println("Escriba altura");
        altura = sc.nextInt();
        area = base * altura;
        System.out.println("El area del Rectangulo es: "+ area);

    }


    public void perimetroRectangulo(){
        int lado1, lado2;
        int perimetro;

        System.out.println("Escriba el primer lado");
        lado1 = sc.nextInt();

        System.out.println("Escriba el segundo lado");
        lado2 = sc.nextInt();

        perimetro = 2 * (lado1 + lado2);

        System.out.println("El perimetro del Rectangulo es:" + perimetro);
    }

    public void datosRectangulo(){

        System.out.println("Datos");

        System.out.println("- Figura: Rectangulo");
        System.out.println("- Base: 10");
        System.out.println("- Altura: 20");
        System.out.println("- Area: 200");
        System.out.println("- Lado1: 5");
        System.out.println("- Lado2: 5");
        System.out.println("- Perimetro: 20");
        System.out.println("- Ubicado en el cuadrante 2, con coordenadas en x: 7 y Y: -14");

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