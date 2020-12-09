package cConverter;

import java.util.Scanner;

public class CConverter {
    public static void main(String args[]){
        double todayRate;
        int choice;
        double inr;
        char ansr ;
        do {
            System.out.println("different types of converters");
            System.out.println("1.DollarToInr");
            System.out.println("2.DollarToEuro");
            System.out.println("3.DollarToYen");
            System.out.println("4.DollarToPound");
            System.out.println("5.DollarToCad");
            System.out.println("6.InrToDollar");
            System.out.println("7.InrToEuro");
            System.out.println("8.InrToYen");
            System.out.println("9.InrToPound");
            System.out.println("10.InrToCad");
            System.out.println("11.EurToDollar");  
            System.out.println("12.EurToInr");  
            System.out.println("13.EurToYen"); 
            System.out.println("14.EurToPound");
            System.out.println("15.EurToCad");
            System.out.println("16.YenToDollar");
            System.out.println("17.YenToInr");
            System.out.println("18.YenToEuro");
            System.out.println("19.YenToPound");
            System.out.println("20.YenToCad");
            System.out.println("21.PoundToDollar");
            System.out.println("22.PoundToInr");
            System.out.println("23.PoundToEur");
            System.out.println("24.PoundToYen");
            System.out.println("25.PoundToCad");
            System.out.println("26.CadToDollar");
            System.out.println("27.CadToInr");
            System.out.println("28.CadToEuro");
            System.out.println("29.CadToYen");
            System.out.println("30.CadToPound");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            choice = sc.nextInt();
            System.out.println("enter today rate");
            todayRate = sc.nextDouble();
            CcurrencyCov cc = new CcurrencyCov(todayRate);
            switch (choice){
                case 1 :
                    System.out.println("enter dollar");
                    double dollar = sc.nextDouble();
                    System.out.println(dollar+"dollar are converted to "+ cc.DollarToInr(dollar)+ "INR");
                    break;
                case 2 :
                    System.out.println("enter dollar");
                    double dollare = sc.nextDouble();
                    System.out.println(dollare+"dollar are converted to "+ cc.DollarToEuro(dollare)+ "Euro");
                    break;
                case 3 :
                    System.out.println("enter dollar");
                    double dollary = sc.nextDouble();
                    System.out.println(dollary+"dollar are converted to "+ cc.DollarToYen(dollary)+ "Yen");
                    break;  
                case 4 :
                    System.out.println("enter dollar");
                    double dollarp = sc.nextDouble();
                    System.out.println(dollarp+"dollar are converted to "+ cc.DollarToPound(dollarp)+ "Pound");
                    break;   
                case 5 :
                    System.out.println("enter dollar");
                    double dollarc = sc.nextDouble();
                    System.out.println(dollarc+"dollar are converted to "+ cc.DollarToCad(dollarc)+ "CAD");
                    break;     
                case 6 :
                    System.out.println("enter inr");
                    double Inr = sc.nextDouble();
                    System.out.println(Inr+"Inr are converted to "+cc.InrToDollar(Inr)+ "Dollar");
                    break;
                case 7 :
                    System.out.println("enter inr");
                    double Inre = sc.nextDouble();
                    System.out.println(Inre+"Inr are converted to "+cc.InrToEuro(Inre)+ "Euro");
                    break;
                case 8 :
                    System.out.println("enter inr");
                    double Inry = sc.nextDouble();
                    System.out.println(Inry+"Inr are converted to "+cc.InrToYen(Inry)+ "Yen");
                    break;
                case 9 :
                    System.out.println("enter inr");
                    double Inrp = sc.nextDouble();
                    System.out.println(Inrp+"Inr are converted to "+cc.InrToPound(Inrp)+ "Pound");
                    break;
                case 10 :
                    System.out.println("enter inr");
                    double Inrc = sc.nextDouble();
                    System.out.println(Inrc+"Inr are converted to "+cc.InrToCad(Inrc)+ "CAD");
                    break;
                case 11 :
                    System.out.println("enter Eur");
                    double Eurd = sc.nextDouble();
                    System.out.println(Eurd+"Euro are converted to "+cc.EurToDollar(Eurd)+ "Dollar");
                    break;
                case 12 :
                    System.out.println("enter Eur");
                    double Eur = sc.nextDouble();
                    System.out.println(Eur+"Euro are converted to "+cc.EurToInr(Eur)+ "INR");
                    break;
                case 13 :
                    System.out.println("enter Eur");
                    double Eury = sc.nextDouble();
                    System.out.println(Eury+"Euro are converted to "+cc.EurToYen(Eury)+ "Yen");
                    break;
                case 14 :
                    System.out.println("enter Eur");
                    double Eurp = sc.nextDouble();
                    System.out.println(Eurp+"Euro are converted to "+cc.EurToPound(Eurp)+ "Pound");
                    break;
                case 15 :
                    System.out.println("enter Eur");
                    double Eurc = sc.nextDouble();
                    System.out.println(Eurc+"Euro are converted to "+cc.EurToCad(Eurc)+ "CAD");
                    break;
                case 16 :
                    System.out.println("enter Yen");
                    double Yend = sc.nextDouble();
                    System.out.println(Yend+"Yen are converted to "+cc.YenToDollar(Yend)+ "Dollar");
                    break;
                case 17 :
                    System.out.println("enter Yen");
                    double Yeni = sc.nextDouble();
                    System.out.println(Yeni+"Yen are converted to "+cc.YenToInr(Yeni)+ "INR");
                    break;
                case 18 :
                    System.out.println("enter Yen");
                    double Yene = sc.nextDouble();
                    System.out.println(Yene+"Yen are converted to "+cc.YenToEuro(Yene)+ "Euro");
                    break;
                case 19 :
                    System.out.println("enter Yen");
                    double Yenp = sc.nextDouble();
                    System.out.println(Yenp+"Yen are converted to "+cc.YenToPound(Yenp)+ "Pound");
                    break;
                case 20 :
                    System.out.println("enter Yen");
                    double Yenc = sc.nextDouble();
                    System.out.println(Yenc+"Yen are converted to "+cc.YenToCad(Yenc)+ "Cad");
                    break;
                case 21 :
                    System.out.println("enter Pound");
                    double Poundd = sc.nextDouble();
                    System.out.println(Poundd+"Pound are converted to "+cc.PoundToDollar(Poundd)+ "Dollar");
                    break;
                case 22 :
                    System.out.println("enter Pound");
                    double Poundi = sc.nextDouble();
                    System.out.println(Poundi+"Pound are converted to "+cc.PoundToInr(Poundi)+ "Inr");
                    break;
                case 23 :
                    System.out.println("enter Pound");
                    double Pounde = sc.nextDouble();
                    System.out.println(Pounde+"Pound are converted to "+cc.PoundToEuro(Pounde)+ "Euro");
                    break;
                case 24 :
                    System.out.println("enter Pound");
                    double Poundy = sc.nextDouble();
                    System.out.println(Poundy+"Pound are converted to "+cc.PoundToYen(Poundy)+ "Yen");
                    break;
                case 25 :
                    System.out.println("enter Pound");
                    double Poundc = sc.nextDouble();
                    System.out.println(Poundc+"Pound are converted to "+cc.PoundToCad(Poundc)+ "Cad");
                    break;
                case 26 :
                    System.out.println("enter CAD");
                    double Cadd = sc.nextDouble();
                    System.out.println(Cadd+"CAD are converted to "+cc.CadToDollar(Cadd)+ "Dollar");
                    break;
                case 27 :
                    System.out.println("enter CAD");
                    double Cadi = sc.nextDouble();
                    System.out.println(Cadi+"CAD are converted to "+cc.CadToInr(Cadi)+ "INR");
                    break;
                case 28 :
                    System.out.println("enter CAD");
                    double Cade = sc.nextDouble();
                    System.out.println(Cade+"CAD are converted to "+cc.CadToEuro(Cade)+ "Euro");
                    break;
                case 29 :
                    System.out.println("enter CAD");
                    double Cady = sc.nextDouble();
                    System.out.println(Cady+"CAD are converted to "+cc.CadToYen(Cady)+ "Yen");
                    break;
                case 30 :
                    System.out.println("enter CAD");
                    double Cadp = sc.nextDouble();
                    System.out.println(Cadp +"CAD are converted to "+cc.CadToPound(Cadp)+ "Pound");
                    break;
            }
            System.out.println(" Click 'y' if u wanna try another one");
            ansr = sc.next().charAt(0);

        }while (ansr =='y');


    }
}

