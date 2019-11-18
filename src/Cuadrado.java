
import java.util.Scanner;

public class Cuadrado extends Figuras {

    Scanner sc = new Scanner(System.in);
    public void areaCuadrado(){

        int lado;
        int area;

        System.out.println("Agrege el lado del cuadrado");
        lado = sc.nextInt();
        area = lado * lado;
        System.out.println("Area del Cuadrado es: " + area);
    }

    public void perimetroCuadrado(){

        int lado;
        int perimetro;
        System.out.println("Agrege el lado del cuadrado");
        lado = sc.nextInt();
        perimetro = 4 * lado;
        System.out.println("El perimetro del Cuadrado es: " + perimetro);

    }

    public void datosCuadrado(){
        System.out.println("Datos");
        System.out.println("- Figura: Cuadrado");
        System.out.println("- Lado: 20");
        System.out.println("- Area: 400");
        System.out.println("- Perimetro: 80");
        System.out.println("- Ubicado en el cuadrante 3, con coordenadas en x: -17 y Y: -17");

    }
    public void setArea(double e_area){

        area = e_area;

    }

    public void setPerimetro(double e_perimetro){

        perimetro = e_perimetro;

    }

    public double getArea(){
        return area;
    }

    public double getPerimetro(){
        return perimetro;
    }











}

