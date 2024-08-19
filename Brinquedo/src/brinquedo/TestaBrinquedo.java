public class TestaBrinquedo {
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo("Hot Wheels", "3 a 5", 10);
        brinquedo1.mostrarInformacoes(); 

        System.out.println(); 

        Brinquedo brinquedo2 = new Brinquedo("Barbie", "2 a 4", 20);
        brinquedo2.mostrarInformacoes(); 
        System.out.println(); 

        brinquedo2.setFaixaEtaria("6 a 10");
        brinquedo2.mostrarInformacoes(); 
    }

}
