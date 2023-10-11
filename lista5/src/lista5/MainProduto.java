package lista5;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("cafe");
	
		produto.setFornecedor("dimitri");
			
		produto.setPreco(70.000);

        Produto produto2 = new Produto();
        produto2.setNome("Peixe");
        produto2.setFornecedor("lucas");
        produto2.setPreco(1.000);

        Produto produto3 = new Produto();
        produto3.setNome("Carne");
        produto3.setFornecedor("Lula");
        produto3.setPreco(30.000);
        
        
       
		
		ArrayList<Produto> lista5 = new ArrayList<>(3); 
		
		lista5.add(produto);
		lista5.add(produto2);
		lista5.add(produto3);
		
	for (Produto produto4 : lista5) {
		
		System.out.println(produto4.getFornecedor());
		System.out.println(produto4.getNome());
		System.out.println(produto4.getPreco());
		
	}

		
		
	}

}
