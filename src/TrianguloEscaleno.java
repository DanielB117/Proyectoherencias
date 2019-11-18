
import java.util.Scanner;

public class TrianguloEscaleno extends Triangulos {

    Scanner sc =new Scanner(System.in);

    public void areaTrianEsca(){

        int base;
        int altura;
        int area;

        System.out.println("Escriba la base");
        base =sc.nextInt();
        System.out.println("Escriba la altura");
        altura = sc.nextInt();

        area = (base * altura)/2;
        System.out.println("El area del Triangulo escaleno es: " + area);

    }

    public void perimetroTrianEsca(){
        int lado1,lado2, lado3;
        int perimetro;

        System.out.println("Escriba el primer lado");
        lado1 = sc.nextInt();
        System.out.println("Escriba el segundo lado");
        lado2 = sc.nextInt();
        System.out.println("Escriba el tercer lado");
        lado3 = sc.nextInt();

        perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro del triangulo escaleno es:" + perimetro);
    }

    public void datosTrianEsca(){
        System.out.println("Datos");

        System.out.println("- Figura: Triangulo Escaleno");
        System.out.println("- Base: 15");
        System.out.println("-Altura: 17");
        System.out.println("- Area: 127");
        System.out.println("-Lado 1: 10");
        System.out.println("-Lado 2: 15");
        System.out.println("-Lado 3: 20");
        System.out.println("- Perimetro: 45");
        System.out.println("- Ubicado en el cuadrante 4, con coordenadas en x: -39 y Y: 30");

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
