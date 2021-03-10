
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

import java.util.Random;

public class TestSequence {
	static int min, max, count;

	static int operation(Sequence seq, int code) {
		int s;
		System.out.println(seq);
		switch (code) {
		case 0:
			s = min;
			System.out.println("Insertion en Tete de " + s);
			seq.insereTete(s);
			assert (!seq.estVide());
			break;
		case 1:
			s = max;
			System.out.println("Insertion en Queue de " + s);
			seq.insereQueue(s);
			assert (!seq.estVide());
			break;
		case 2:
		case 3:
			if (count > 0) {
				s = seq.extraitTete();
				System.out.println("Extraction en Tete de " + s);
				assert (s == min + 1);
				assert ((count == 1) == (seq.estVide()));
				return s;
			}
			break;
		}

		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		Random r = new Random();
		Sequence s1, s2;
		s1 = new SequenceTableau();
		s2 = new SequenceListe();

		assert (s1.estVide());
		assert (s2.estVide());
		min = -1;
		max = 0;
		count = 0;
		for (int i = 0; i < 100; i++) {
			int code = r.nextInt(4);
			int r1 = operation(s1, code);
			int r2 = operation(s2, code);
			if (code < 2) {
				count++;
				if (code < 1)
					min--;
				else
					max++;
			} else {
				if (count > 0) {
					count--;
					min++;
				}
			}
			assert (r1 == r2);
		}
	}
}
