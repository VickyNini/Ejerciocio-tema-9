public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "María Victoria Meriño Mac William";
        cliente.edad = 27;
        cliente.telefono = "+549-351-6871580";
        cliente.credito = 173500;
        System.out.println("Nombre del cliente: "+cliente.nombre);
        System.out.println("Edad: "+cliente.edad);
        System.out.println("Némero de celular: "+cliente.telefono);
        System.out.println("Crédito: $"+cliente.credito);
        System.out.println(" ");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "María Victoria Meriño Mac William";
        trabajador.edad = 27;
        trabajador.telefono = "+549-351-6871580";
        trabajador.salario = 214700;
        System.out.println("Nombre del trabajador: "+ trabajador.nombre);
        System.out.println("Edad: "+ trabajador.edad);
        System.out.println("Número de celular: "+ trabajador.telefono);
        System.out.println("Salario: $"+ trabajador.salario);


    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;
}

class Cliente extends Persona{
    int credito;

}

class Trabajador extends Persona{
    int salario;
}