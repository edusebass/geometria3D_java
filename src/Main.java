public class Main {
    public static void main(String[] args) {
        figuras3D piramides = new figuras3D(0, 0, 0);
        piramides.setAreaBase(4.0);
        piramides.setLadoBase(5.24);
        piramides.setAltura(4.21);

        System.out.println("Volumen piramide: " + piramides.getVolumenPiramide());
    }

}