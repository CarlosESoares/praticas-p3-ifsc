package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tutor lucao = new tutor();
		lucao.setNomeCompleto("lucao");
		
		tutor Carlos = new tutor();
		Carlos.setNomeCompleto("Carlos edurado soares");
		
		tutor Edelwans = new tutor();
		Edelwans.setNomeCompleto("Edelwans soares");
		
		gato amora = new gato();
		amora.setApelido("amora");
		amora.setClasse("siames");
		amora.setNomeCientifico("gatones");
		amora.setPedigree("barata");
		
		gato blecaute = new gato();
		blecaute.setApelido("blecaute");
		blecaute.setClasse("o que é isso?");
		blecaute.setNomeCientifico("cachorres");
		blecaute.setPedigree("frango");
	
		gato meiodia=new gato();
		meiodia.setApelido("null");
		meiodia.setClasse("pedigrenes");
		meiodia.setPedigree("FRANGO");
		meiodia.setNomeCientifico("gatonesnes");
		
		ArrayList<tutor> tutoreses = new ArrayList<>();
		tutoreses.add(Edelwans);
		tutoreses.add(Carlos);
		tutoreses.add(lucao);
		
		lucao.adicionarGato(meiodia);
		Edelwans.adicionarGato(blecaute);
		Carlos.adicionarGato(amora);
		
		
		for (tutor tutor : tutoreses) {
			

            System.out.println("Tutor: " + tutor.getNomeCompleto());
            for (gato gato : tutor.getGatos()) {
                System.out.println(" Gato: " + gato.getApelido());
                System.out.println("Raça "+ gato.getClasse());
                System.out.println("Comida favorita "+ gato.getPedigree());
                System.out.println("----------------------------");
            }
		}
		
		
	}

}
