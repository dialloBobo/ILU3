package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import jeuxdecartes.Carte;

public class Utils {
	
	private List <Carte> listCarte= new ArrayList<>();
	
	
	// version 1
	public static Carte extraire (List <Carte> listCarte) {
		if(!listCarte.isEmpty()) {
		
		int index = (int) (Math.random()* listCarte.size());
		return listCarte.remove(index);	
	}
		else {
			 throw new IllegalArgumentException("La liste est vide.");
		}
	}
	
	
	public static Carte extraireIt (List <Carte> listCarte) {
		
		
		if (!listCarte.isEmpty()) {
            ListIterator<Carte> iterator = listCarte.listIterator();
            int index = (int) (Math.random() * listCarte.size());
            while (index > 0 && iterator.hasNext()) {
                iterator.next();
                index--;
            }
            Carte carte = iterator.next();
            iterator.remove();
            return carte;
        } else {
            throw new IllegalArgumentException("La liste est vide.");
        }
    }
	
	
	
	public static List<Carte> melanger(List <Carte> listCarte){
		List<Carte> melangee = new ArrayList<>();
		while(!listCarte.isEmpty()) {
			Carte carte =extraire(listCarte);
			melangee.add(carte);
		}
		return  melangee;
	}
	
	public static <Carte> boolean verifierMelange (List <Carte> liste1 ,List<Carte> liste2){
		   for (Carte carte : liste1) {
	            if (Collections.frequency(liste1, carte) != Collections.frequency(liste2, carte)) {
	                return false;
	            }
	        }
	        return true;
	    }
		

	public static <Carte> List<Carte> rassembler(List<Carte> liste) {
        List<Carte> rassemblee = new ArrayList<>();
        if (liste.isEmpty()) {
            return rassemblee;
        }

        Carte currentElement = liste.get(0);
        rassemblee.add(currentElement);

        for (int i = 1; i < liste.size(); i++) {
            Carte element = liste.get(i);
            if (element.equals(currentElement)) {
                rassemblee.add(element);
                currentElement = element;
            }

            
        }
        return rassemblee;
    }

	
    public static <Carte> boolean verifierRassemblement(List<Carte> liste) {
        ListIterator<Carte> forwardIterator = liste.listIterator();
        ListIterator<Carte> backwardIterator = liste.listIterator(liste.size());

        while (forwardIterator.hasNext() && backwardIterator.hasPrevious()) {
            Carte forwardElement = forwardIterator.next();
            Carte backwardElement = backwardIterator.previous();

            if (!forwardElement.equals(backwardElement)) {
                return false;
            }
        }

        return true;
    }
	
	
	
	

}
