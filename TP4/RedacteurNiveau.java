package TP4;

/*
 * Sokoban - Encore une nouvelle version (à but pédagogique) du célèbre jeu
 * Copyright (C) 2018 Guillaume Huard
 * 
 * Ce programme est libre, vous pouvez le redistribuer et/ou le
 * modifier selon les termes de la Licence Publique Générale GNU publiée par la
 * Free Software Foundation (version 2 ou bien toute autre version ultérieure
 * choisie par vous).
 * 
 * Ce programme est distribué car potentiellement utile, mais SANS
 * AUCUNE GARANTIE, ni explicite ni implicite, y compris les garanties de
 * commercialisation ou d'adaptation dans un but spécifique. Reportez-vous à la
 * Licence Publique Générale GNU pour plus de détails.
 * 
 * Vous devez avoir reçu une copie de la Licence Publique Générale
 * GNU en même temps que ce programme ; si ce n'est pas le cas, écrivez à la Free
 * Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307,
 * États-Unis.
 * 
 * Contact:
 *          Guillaume.Huard@imag.fr
 *          Laboratoire LIG
 *          700 avenue centrale
 *          Domaine universitaire
 *          38401 Saint Martin d'Hères
 */

import java.io.OutputStream;
import java.io.PrintStream;

public class RedacteurNiveau {
	PrintStream sortie;

	RedacteurNiveau(OutputStream out) {
		sortie = new PrintStream(out);
	}

	void ecrisNiveau(Niveau n) {
		for (int i = 0; i < n.lignes(); i++) {
			int dernier = 0;
			for (int j = 0; j < n.colonnes(); j++)
				if (!n.estVide(i, j))
					dernier = j;
			for (int j = 0; j <= dernier; j++)
				if (n.aMur(i, j))
					sortie.print('#');
				else if (n.aBut(i, j))
					if (n.aPousseur(i, j))
						sortie.print('+');
					else if (n.aCaisse(i, j))
						sortie.print('*');
					else
						sortie.print('.');
				else if (n.aPousseur(i, j))
					sortie.print('@');
				else if (n.aCaisse(i, j))
					sortie.print('$');
				else
					sortie.print(' ');
			sortie.println();
		}
		if (n.nom() != null)
			sortie.println("; " + n.nom());
	}
}
