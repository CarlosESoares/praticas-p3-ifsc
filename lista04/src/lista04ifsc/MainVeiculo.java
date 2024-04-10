package lista04ifsc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo a = new Veiculo();
		a.setAno(1900);
		a.setNome("opala 69");
		a.setCor("preto");
		
		Veiculo c = new Veiculo();
		c.setAno(1901);
		c.setNome("opala 68");
		c.setCor("branco");

		Veiculo b = new Veiculo();
		b.setAno(1902);
		b.setNome("opala 696");
		b.setCor("azul");

		
		ArrayList<Veiculo> a1=  new ArrayList<>(3);
		
		a1.add(a);
		a1.add(b);
	
		a1.add(c);
		
		for (Veiculo veiculo : a1) {
			System.out.println(veiculo.getNome());
		}
		for (Veiculo veiculo : a1) {
			System.out.println(veiculo.getAno());
		}
		for (Veiculo veiculo : a1) {
			System.out.println(veiculo.getCor());
		}
	}

}
