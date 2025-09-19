package br.edu.fatecpg.tecprog.atividade01.view;
import br.edu.fatecpg.tecprog.atividade01.model.*;
public class LojaMain {

      public static void main(String[] args) {
            Loja lojaDSM = new Loja(3);
            lojaDSM.setProduto(1, "Airfryer", 120, 5);
            lojaDSM.setProduto(2, "Cafeteira", 85, 7);
            lojaDSM.setProduto(3, "Liquidificador", 12, 50);
            
            lojaDSM.getProdutos();
            System.out.println(lojaDSM.produtosDestaque());
            System.out.println(lojaDSM.valorTotalEstoque());
      }

}
