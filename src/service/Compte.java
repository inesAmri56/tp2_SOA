package service;


private int code;
private double solde;
private String dateCreation;
public Compte(int code,double solde,String dateCreation)
{
	this.code=code;
	this.solde=solde;
	this.dateCreation=dateCreation;
}
public int getcode()
{
	return code;
}
public void setcode(int c)
{
	code=c;
}
public double getsolde()
{
	return solde;
}
public void setcode(double s)
{
	solde=s;
}
public String getdateCreation()
{
	return dateCreation;
}
public void setcode(String d)
{
	dateCreation=d;
}

}
