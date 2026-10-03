public class Circulo implements Forma {
    private double raio;
    private double area;
    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }


    @Override
    public double calcularArea() {
        this.area = 3.14 * (this.raio * this.raio);
        return area;
    }

}
