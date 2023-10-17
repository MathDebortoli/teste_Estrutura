import backend.busca.controller.BuscaPatenteController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Opa Boa noite Xesque!");

        BuscaPatenteController busca =  new BuscaPatenteController();
        busca.buscarPatenteAvancado();
        busca.buscarPatenteSimples();
    }
}