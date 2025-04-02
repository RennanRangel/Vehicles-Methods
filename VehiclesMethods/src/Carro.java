public class Carro extends Veiculo {
    private int numPortas;


    public Carro(String marca ,int ano , int numPortas ){
        super(marca,ano);
        this.numPortas = numPortas;
    }





    public int getnumPortas(){
        return numPortas;

    }
    public void setnumPortas (int numPortas){
        this.numPortas = numPortas;

    }
    @Override
    public void exibirinformacoes(){
        super.exibirinformacoes();

        System.out.println("Numero de portas: " + numPortas);
    }
    public void buzinar(){
        System.out.println("Beee");
    }


}
