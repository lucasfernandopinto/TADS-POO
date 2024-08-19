public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private double preco;

    public Brinquedo(String nome, String faixaEtaria, double preco) {
        this.nome = nome;
        this.setFaixaEtaria(faixaEtaria);
        this.preco = preco;
    }
    public Brinquedo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        
        if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("6 a 10") || faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            System.out.println("Faixa etária inválida! \nA faixa etária deve ser '0 a 2', '3 a 5', '6 a 10' ou 'acima de 10'.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Preço: " + preco);
    }
}
