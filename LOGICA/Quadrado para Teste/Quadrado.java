public class Quadrado extends AQuadrado {

    private int lados; //17



    public int getLados() {
        return lados;
    }


    public void setLados(int lados) {
        this.lados = lados;
    }

    @Override
    public int calcularArea() {
        return this.lados * this.lados; //17*17
    }

    @Override
    public int calcularPerimetro() {
        return this.lados * 4;  //17*4
    }
}


