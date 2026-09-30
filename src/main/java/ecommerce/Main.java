package ecommerce;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();

        System.out.println("Inserindo: " + dao.inserir("Camiseta", "49.90"));
        System.out.println("Inserindo: " + dao.inserir("Tênis", "199.90"));

        System.out.println("\nTodos:");
        for (Produto p : dao.obterTodas()) {
            System.out.println(p);
        }

        System.out.println("\nObter id 1: " + dao.obter(1));

        System.out.println("\nAtualizando: " + dao.atualizar("Camiseta Preta", "59.90", 1));
        System.out.println("Depois: " + dao.obter(1));

        System.out.println("\nRemovendo: " + dao.remover(2));

        System.out.println("\nLista final:");
        for (Produto p : dao.obterTodas()) {
            System.out.println(p);
        }
    }
}