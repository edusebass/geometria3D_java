public class figuras3D {
    private float lado; //cubo
    private float areaBase, altura; //piramide

    private float radioesfera; //esfera

    private float radioCili, alturaCili; //cilindro
    private double PI = 3.14;
    private double volumenCilindro;

    public figuras3D(float radioCili, float alturaCili) {
        this.radioCili = radioCili;
        this.alturaCili = alturaCili;
    }

    public float getRadioCili() {
        return radioCili;
    }

    public void setRadioCili(float radioCili) {
        this.radioCili = radioCili;
    }

    public float getAlturaCili() {
        return alturaCili;
    }

    public void setAlturaCili(float alturaCili) {
        this.alturaCili = alturaCili;
    }

    public double getVolumenCilindro() {
        setVolumenCilindro();
        return volumenCilindro;
    }

    private void setVolumenCilindro() {
        this.volumenCilindro = volumenCilindro(getRadioCili(),getAlturaCili());
    }

    private double volumenCilindro(double radio, double altura1){
        volumenCilindro = (PI * (radio*radio) * altura1);
        return volumenCilindro;
    }
}
