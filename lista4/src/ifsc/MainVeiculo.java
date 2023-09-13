package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo1 = new Veiculo();
		veiculo1.setNome("opala");
		veiculo1.setAno("1968");
		veiculo1.setFabricante("chevrolet");
		veiculo1.setCor("verde-limao");
		veiculo1.setNumeroderodas(1257);
		

		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setNome("camaro");
		veiculo2.setAno("2010");
		veiculo2.setFabricante("ford");
		veiculo2.setCor("esmeralda");
		veiculo2.setNumeroderodas(45312);
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setNome("ferrari");
		veiculo3.setAno("1962");
		veiculo3.setFabricante("ferrari");
		veiculo3.setCor("preta-com-amarela");
		veiculo3.setNumeroderodas(84545);
		
		ArrayList<Veiculo> nomeLista = new ArrayList<>();
		nomeLista.add(veiculo1);
		nomeLista.add(veiculo2);
		nomeLista.add(veiculo3);
		
		for (Veiculo v : nomeLista) {
			System.out.println(v.getNome());
			System.out.println(v.getAno());
			System.out.println(v.getFabricante());
			System.out.println(v.getCor());
			System.out.println(v.getNumeroderodas()); 
			
		}
	}

}