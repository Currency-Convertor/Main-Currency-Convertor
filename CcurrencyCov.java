package cConverter;

public class CcurrencyCov {

    double er = 0;

public CcurrencyCov(double todayRate) {
    er = todayRate;
}


    public double DollarToInr(double Dollar){
        double Inr = 0;
        Inr = Dollar*er;
        return Inr;
    }
    public double DollarToEuro(double Dollar){
        double euro= 0;
        euro = Dollar*er;
        return euro;
    }
    public double DollarToYen(double Dollary){
        double yen= 0;
        yen = Dollary*er;
        return yen;
    }
    public double DollarToPound(double Dollarp){
        double pound= 0;
        pound = Dollarp/er;
        return pound;
    }
    public double DollarToCad(double Dollarc){
        double cad= 0;
        cad = Dollarc/er;
        return cad;
    }
    public double InrToDollar(double Inr){
        double Dollar = 0;
        Dollar = Inr*er;
        return Dollar;
    }
    public double InrToEuro(double Inre){
        double Euro = 0;
        Euro = Inre*er;
        return Euro;
    }
    public double InrToYen(double Inry){
        double yen = 0;
        yen = Inry/er;
        return yen;
    }
    public double InrToPound(double Inrp){
        double pound = 0;
        pound = Inrp*er;
        return pound;
    }
    public double InrToCad(double Inrc){
        double cad = 0;
        cad = Inrc/er;
        return cad;
    }
    public double EurToDollar(double Eurd){
        double dollar = 0;
        dollar = Eurd*er;
        return dollar;
    }
    public double EurToInr(double Eur){
        double Euro = 0;
        Euro = Euro*er;
        return Euro;
    }
    public double EurToYen(double Eury){
        double yen = 0;
        yen = Eury*er;
        return yen;
    }
    public double EurToPound(double Eurp){
        double pound = 0;
        pound = Eurp/er;
        return pound;
    }
    public double EurToCad(double Eurc){
        double cad = 0;
        cad = Eurc*er;
        return cad;
    }
    public double YenToDollar(double Yend){
        double dollar = 0;
        dollar = Yend*er;
        return dollar;
    }
    public double YenToInr(double Yeni){
        double inr = 0;
        inr = Yeni*er;
        return inr;
    }
    public double YenToEuro(double Yene){
        double euro = 0;
        euro = Yene*er;
        return euro;
    }
    public double YenToPound(double Yenp){
        double pound = 0;
        pound = Yenp*er;
        return pound;
    }
    public double YenToCad(double Yenc){
        double cad = 0;
        cad = Yenc*er;
        return cad;
    }
    public double PoundToDollar(double Poundd){
        double dollar = 0;
        dollar = Poundd*er;
        return dollar;
    }
    public double PoundToInr(double Poundi){
        double inr = 0;
        inr = Poundi*er;
        return inr;
    }
    public double PoundToEuro(double Pounde){
        double euro = 0;
        euro = Pounde*er;
        return euro;
    }
    public double PoundToYen(double Poundy){
        double yen = 0;
        yen = Poundy*er;
        return yen;
    }
    public double PoundToCad(double Poundc){
        double cad = 0;
        cad = Poundc*er;
        return cad;
    }
    public double CadToDollar(double Cadd){
        double dollar = 0;
        dollar = Cadd*er;
        return dollar;
    }
    public double CadToInr(double Cadi){
        double inr = 0;
        inr = Cadi*er;
        return inr;
    }    
    public double CadToEuro(double Cade){
        double euro = 0;
        euro = Cade*er;
        return euro;
    }
    public double CadToYen(double Cady){
        double yen = 0;
        yen = Cady*er;
        return yen;
    }
    public double CadToPound(double Cadp){
        double pound = 0;
        pound = Cadp*er;
        return pound;
    }
}






