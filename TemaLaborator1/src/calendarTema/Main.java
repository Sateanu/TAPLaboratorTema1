package calendarTema;

import java.util.*;

public class Main {

	static Calendar calendar = new Calendar();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("1.Adauga eveniment");
			System.out.println("2.Luna cu evenimente minim");
			System.out.println("3.Luna cu evenimente maxim");
			System.out.println("4.Sterge eveniment");
			System.out.println("5.Modifica eveniment");
			System.out.println("6.Afiseaza evenimente");
			System.out.println("7.Iesire");
			int cmd = sc.nextInt();
			switch (cmd) {
			case 1:
				AdaugaEveniment(sc);
				break;
			case 2:
				System.out.println(calendar.LunaMinima());
				break;
			case 3:
				System.out.println(calendar.LunaMaxima());
			case 4:
				StergeEveniment(sc);
				break;
			case 5:
				ModificaEveniment(sc);
				break;
			case 6:
				AfiseazaEvenimente(sc);
				break;
			case 7:
				done = true;
				break;
			default:
				System.out.println("Comanda invalida");
				break;
			}
		}
		sc.close();
		Eveniment ev1 = new Eveniment("Ceva", 1);
		calendar.AddEveniment(ev1);

	}

	private static void AfiseazaEvenimente(Scanner sc) {

		System.out.print("Luna:");
		int luna = sc.nextInt();

		ArrayList<Eveniment> evenimente = calendar.GetEvenimentLuna(luna);

		Iterator<Eveniment> it = evenimente.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}

	private static void ModificaEveniment(Scanner sc) {

	}

	private static void StergeEveniment(Scanner sc) {

	}

	private static void AdaugaEveniment(Scanner sc) {

		System.out.print("Luna:");
		int luna = sc.nextInt();
		sc.nextLine();
		System.out.print("Eveniment:");
		String ev = sc.nextLine();

		calendar.AddEveniment(ev, luna);

	}

}
