class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Método para calcular total
    public double calcularTotal() {
        return precio * cantidad;
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("\nProducto: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + calcularTotal());
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
}