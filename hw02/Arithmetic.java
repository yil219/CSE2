////////////////////////////////////////////////////////////////////////////////
//Yiming Lu
//Arithmetic Program
//
//  first compile the program 
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//


//define a class
public class Arithmetic
{
    //add main method
public static void main(String[] args){

//number of pairs of socks 
int nSocks=3;
//cost per pair of socks
double sockCost$=2.58;

//number of drinking glasses
int nGlasses=6;
//cost per glass
double glassCost$=2.29;

//number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopesCost$=3.25;
double taxPercent=0.06;

double totalSockCost$=nSocks*sockCost$;       //total cost for socks before tax
double totalGlassCost$=nGlasses*glassCost$;   //total cost for glasses before tax
double totalEnvelopesCost$=nEnvelopes*envelopesCost$; //total cost for envelopes before tax

double taxSockCost$=0.06*totalSockCost$;       //tax for the total socks cost
double taxGlassCost$=0.06*totalGlassCost$;     //tax for the total glass cost
double taxEnvelopesCost$=0.06*totalEnvelopesCost$;    //tax for the total envelopes

double totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopesCost$;    //total purchase before tax
double totalTransaction$=1.06*totalCost$;       //total cost for the transaction after the tax

System.out.println("totalSockCost="+totalSockCost$);
System.out.println("totalGlassCost="+totalGlassCost$);
System.out.println("totalEnvelopesCost="+totalEnvelopesCost$);
System.out.println("taxSockCost="+taxSockCost$);
System.out.println("taxGlassCost="+taxGlassCost$);
System.out.println("taxEnvelopesCost="+taxEnvelopesCost$);
System.out.println("totalCost="+totalCost$);
System.out.println("totalTransaction="+totalTransaction$);


}
}
