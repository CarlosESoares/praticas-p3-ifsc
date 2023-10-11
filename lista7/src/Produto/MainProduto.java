package Produto;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop p1 = new Desktop();
		Desktop p2 = new Desktop();
		Desktop p3 = new Desktop();

		p1.setFabricante("mototo");
		p1.setCodBarras((long) (4123));
		p1.setGamer(true);

		p2.setFabricante("Sansuisg");
		p2.setCodBarras((long) (45425));
		p2.setGamer(false);

		p3.setFabricante("nokikia");
		p3.setCodBarras((long) (59798));
		p3.setGamer(true);

		ArrayList<Desktop> lista = new ArrayList<>(3);
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

		for (Desktop produto4 : lista) {

			System.out.println(produto4.getFabricante());
			System.out.println(produto4.getCodBarras());
			System.out.println(produto4.isGamer());

		}

		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = new SmartPhone();
		SmartPhone s3 = new SmartPhone();

		s1.setFabricante("motrolo");
		s1.setDimensoesTela("pequena");
		s1.setModelo("alta perfomence");

		s2.setFabricante("motrolo");
		s2.setDimensoesTela("pequena");
		s2.setModelo("alta perfomence");

		s3.setFabricante("motrolo");
		s3.setDimensoesTela("pequena");
		s3.setModelo("alta perfomence");

		ArrayList<SmartPhone> lista1 = new ArrayList<>(3);
		lista1.add(s1);
		lista1.add(s2);
		lista1.add(s3);

		for (SmartPhone smart4 : lista1) {

			System.out.println(smart4.getFabricante());
			System.out.println(smart4.getDimensoesTela());
			System.out.println(smart4.getModelo());

		}

	}

}
