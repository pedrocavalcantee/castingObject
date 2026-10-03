public class Principal {
    public static void main(String[] args) throws Exception {
        //Criação do objeto quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);
        quadrado.calcularArea();
        System.out.println("A área do quadrado é: " + quadrado.getArea());

        //Criação do objeto Circulo
        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        circulo.calcularArea();
        System.out.println("A área do círculo é: " + circulo.getArea());
    }
}
