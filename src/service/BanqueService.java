package service;


import java.util.*;
public class BanqueService {

	public double conversion(double montant)
	{
		return montant*10.6;
	}
	public Compte getCompte()
	{
		Compte compte = new Compte(1111,2000.00,"20/10/2020");
		return compte;
	}
	public List<Compte> getComptes()
	{
		List<Compte> list=new ArrayList<Compte>();
		Compte compte1 = new Compte(123,5000.00,"20/10/2023");
		list.add(compte1);
		Compte compte2 = new Compte(124,1545.00,"10/07/2022");
		list.add(compte2);
		Compte compte3 = new Compte(125,7700.00,"30/05/2012");
		list.add(compte3);
		return list;
	}
}


	