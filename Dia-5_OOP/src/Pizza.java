class Pizza {
    
    private Integer precio = 10; //Long, BigDecimal
    public String ingredientes;
    public String tipoMasa;
    public String estado; // cruda - horneado

    void hornear(){

        // Recibir la pizza cruda y verifico
        if (this.estado.equals("cruda")) {
            // Hornear la pizza
            this.estado = "horneada";
        } else {
            System.out.println("La pizza no puede ser horneada");
        }
        // Entregar pizza lista comer
    };

    Integer getPrecio(){
        return this.precio;
    }

    void setPrecio(Integer nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
