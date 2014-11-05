package calendarTema;

import java.util.*;

/*
 * TEMA:
 *  se citeste pt fiecare luna a unui an un set de evenimente 
 * -afisati luna cu cele mai multe evenimente si luna cu cele mai putine
 * -afisati evenimentele lunii introduse la tastatura
 * -adaugare, modificare, stergere evenimente intro luna dupa citirea initiala
 */

public class Calendar {
	
	ArrayList<ArrayList<Eveniment>> evenimente;
	
	public Calendar()
	{
		evenimente=new ArrayList<ArrayList<Eveniment>>();
		for(int i=0;i<=12;i++)
			evenimente.add(new ArrayList<Eveniment>());
	}
	
	public void AddEveniment(Eveniment eveniment)
	{
		
		evenimente.get(eveniment.getLuna()).add(eveniment);
	}
	
	public void AddEveniment(String text, Integer luna)
	{
		evenimente.get(luna).add(new Eveniment(text,luna));
	}
	
	public ArrayList<Eveniment> GetEvenimentLuna(Integer luna)
	{
		return evenimente.get(luna);
	}
	
	public int LunaMinima()
	{
		int min=12;
		for(int i=1;i<=12;i++)
		{
			if(min>evenimente.get(i).size())
				min=evenimente.get(i).size();
		}
		return min;
	}
	
	public int LunaMaxima()
	{
		int max=0;
		for(int i=1;i<=12;i++)
		{
			if(max<evenimente.get(i).size())
				max=evenimente.get(i).size();
		}
		return max;
	}
}
