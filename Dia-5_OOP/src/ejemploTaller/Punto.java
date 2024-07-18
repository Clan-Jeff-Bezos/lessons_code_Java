package ejemploTaller;

public class Punto {
    private Integer x = -2;
    protected Integer y = -1;

    public void cuadrante(){
        if ((this.x) == null){
            System.out.println("Hola");
        }
        if (this.x > 0 && this.y > 0) {
            System.out.println("First quadrant: (+,+)");
        } else if (this.x < 0 && this.y < 0) {
            System.out.println("Thrid Cuadrante: (−,−)");
        } else if (this.x < 0) {
            System.out.println("Second Cuadrante: (−,+)");
        } else {
            System.out.println("Cuarto Cuadrante: (+,−)");
        }
    }
}
