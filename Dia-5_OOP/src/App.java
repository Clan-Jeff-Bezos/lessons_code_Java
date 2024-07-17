public class App {
    // Por convencion las clases empiezan con 
    // mayuscula
    public static void main(String[] args) throws Exception {
        
        Pizza pizzaJamon = new Pizza(); // atributos que pertecen a su espacio (scope)
        Pizza pizzaPiña = new Pizza();
        pizzaJamon.estado = "crud";

        pizzaJamon.hornear();
        Integer numero = null;
        // int numerodos = null;
        System.out.println(pizzaPiña.getPrecio());
    }
}