


public class Main {
   public static void main(String[] args){
       VeiculoTerrestre[] exemplo = new VeiculoTerrestre[8];//Criando umm vetor de veiiiculos terresre
       exemplo[0] = new CarroDePasseio(1990,"Azul",5);
       exemplo[1] = new CarroDePasseio(2004,"Verde",4);
       exemplo[2] = new Caminhao(1999,"Verde",4);
       exemplo[3] = new CarroDePasseio(2010,"Preta",5);
       exemplo[4] = new CarroDePasseio(2009,"Preta",7);
       exemplo[5] = new Caminhao(2011,"Verde",4);
       exemplo[6] = new Caminhao(2000,"Azul",4);
       exemplo[7] = new Caminhao(2005,"Preto",3);
      
 
      System.out.println("Lista de Veículos: ");     
      for(VeiculoTerrestre veiculo : exemplo){
          System.out.println(veiculo);
      }
      System.out.println("\n--- Carros de passeio com 5 passageiros e ano menor que 2010 ---\n");
      for (VeiculoTerrestre veiculo : exemplo) {
            if (veiculo.getAno() < 2010 && veiculo instanceof CarroDePasseio) {
               CarroDePasseio carro =  (CarroDePasseio)veiculo;
               if(carro.getTotalDePassageiros() >= 5){
                   System.out.println(carro);
               }
           }
       }   
      System.out.println("\n--- Total de Veículos do tipo caminhão que são verdes e tem 4 eixos ---\n");
      int total = 0;
      for(VeiculoTerrestre  veiculo : exemplo){
          if(veiculo instanceof Caminhao  &&  veiculo.getCor().equals("Verde")){ 
                Caminhao c = (Caminhao)veiculo; //preciso fazer um casting caso eu queria procurar uma atributo da minha subclasse
                if(c.getTotalDeEixos() == 4){
                   ++total;
                }
        }
      }
       System.out.println("TOTAL = " + total);
    }
}

    

