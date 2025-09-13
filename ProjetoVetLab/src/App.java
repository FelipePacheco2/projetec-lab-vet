import java.util.ArrayList;

import Dominio.Cliente;
import FakeBD.ClienteFakeDB;

public class App {
    public static void main(String[] args) throws Exception {

        ClienteFakeDB db = new ClienteFakeDB();
        ArrayList<Cliente> clientes = db.getInstancia();
        for (Cliente cliente : clientes){
            System.out.println("Codigo: " + cliente.getCodigo());
            System.out.println("nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        }
    
    }
}