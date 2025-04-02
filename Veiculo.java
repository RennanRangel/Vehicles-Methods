public class Veiculo {
    private String marca;
    private int ano;
    
    Sau
public Veiculo(String marca,int ano){
this.marca = marca;
this.ano = ano;

}

    Veiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Veiculo(String porscheAzul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public String getmarca(){
        return marca;
    }
   public void setmarca(String marca){
       this.marca = marca;
   }
    public int getano(int ano){
       return ano;
   }
  public void setano(int ano){
      this.ano = ano;
  }
  public void exibirinformacoes(){
     System.out.println("Marca:" + marca + " Ano:  "+ano);
    
  }

 
}
