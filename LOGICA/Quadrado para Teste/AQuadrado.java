public abstract class AQuadrado {
   private  int lados;



    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public abstract int calcularArea();

    public abstract int calcularPerimetro();


}
