import java.util.ArrayList;

import Dominio.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente c1 = new Cliente();

        c1.setCodigo(1);
        c1.setNome("Felipe");
        c1.setEmail("felipe@gmail.com");
        c1.setCpf("98765432112");
        c1.setNumeroCartao("123");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        
        Cliente c2 = new Cliente(2, "Rayssa", "123654789", "rayssa@gmail.com", "123");
        clientes.add(c2);
    }
}