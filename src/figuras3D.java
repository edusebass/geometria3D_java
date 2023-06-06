public class figuras3D {
    double lado; //cubo
   private double volCubo;
    float areaBase, altura; //piramide

    float radioesfera; //esfera

    float radioCili, alturaCili; //cilindro
    double PI = 3.14;

    //Constructor cubo
    public figuras3D(float lado) {
        this.lado = lado;
    }

    //SETTERS Y GETTERS CUBO

    private double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getVolCubo() {
        return volCubo;
    }

    private void setVolCubo(double volCubo) {
        this.volCubo = volCubo;
    }

    //CALCULO VOLUMEN CUBO
    public double volCubo(double lado){
        volCubo=(getLado()*getLado()*getLado());
        return this.volCubo;
    };

}
