
import java.util.Scanner;
public class Circulo extends Figuras {
    Scanner sc = new Scanner(System.in);
    public void areaCirculo() {
        int radio;
        double area;
        double Pi = 3.14159;
        System.out.println("radio del Circulo");
        radio = sc.nextInt();
        area =  Pi * (radio * radio);
        System.out.println("area del Circulo: " + area);
    }

    public void perimetroCirculo() {
        int radio;
        double Pi = 3.14159;
        double perimetro;

        System.out.println("Agrege el radio");
        radio = sc.nextInt();

        perimetro = 2 * Pi * radio;
        System.out.println("El perimetro del Circulo es:" + perimetro);
    }


    public void datosCirculo(){

        System.out.println("Datos");

        System.out.println("- Figura: Circulo");
        System.out.println("- Radio: 5");
        System.out.println("- Area: 78.53975");
        System.out.println("- Perimetro: 31.4159");
        System.out.println("- Ubicado en el cuadrante 1, con coordenadas en x: 5 y Y: 10");

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

