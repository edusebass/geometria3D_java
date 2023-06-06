public class figuras3D {
    private double areaBase, ladoBase, altura;
    private double volumenPiramide;

    //volumen piramide
    public figuras3D(double areaBase, double ladoBase, double altura) {
        this.areaBase = areaBase;
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    public double getAreaBase() {
        return areaBase;
    }
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
        setVolumenPiramide();
    }

    public double getLadoBase() {
        return ladoBase;
    }
    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
        setVolumenPiramide();
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
        setVolumenPiramide();
    }

    public double getVolumenPiramide() {
        return volumenPiramide;
    }

    private void setVolumenPiramide() {
        this.volumenPiramide = volumenPiramide(getAreaBase(), getLadoBase(), getAltura());
    }

    private double volumenPiramide(double areaBase, double ladoBase, double altura) {
        volumenPiramide = (1.0 / 3.0) * areaBase * ladoBase * altura;
        return volumenPiramide;
    }
}

