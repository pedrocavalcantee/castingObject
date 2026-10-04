import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) throws Exception {
        //Criação do objeto quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);
        quadrado.calcularArea();

        Quadrado outroQuadrado = new Quadrado();
        outroQuadrado.setLado(4);
        outroQuadrado.calcularArea();

        //Criação do objeto Circulo
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.calcularArea();

        Circulo outroCirculo = new Circulo();
        outroCirculo.setRaio(3);
        outroCirculo.calcularArea();

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(outroQuadrado);
        formas.add(circulo);
        formas.add(outroCirculo);
        
        for (Forma forma : formas) {
            if(forma instanceof Quadrado q){
                System.out.println("A área do quadrado é: " + q.getArea());
            }
            if(forma instanceof Circulo c){
                System.out.println("A área do círculo é: " + c.getArea());
            }
        }
    }


}
