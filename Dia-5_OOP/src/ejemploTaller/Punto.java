package ejemploTaller;

public class Punto {
    private Integer x;
    private Integer y;

    void cuadrante(){
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
