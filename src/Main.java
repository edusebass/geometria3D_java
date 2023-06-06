public class Main {
    public static void main(String[] args) {
        figuras3D cubo = new figuras3D(0,0);
        figuras3D piramdes = new figuras3D(0,0);
        figuras3D esferas = new figuras3D(0,0);
        figuras3D cilindro = new figuras3D(0,0);

        cilindro.setAlturaCili(12);
        cilindro.setRadioCili(5);

        System.out.println("Volumen cilindro: " + cilindro.getVolumenCilindro());

    }
}