
package calculadora;

import java.util.Scanner;


public class Calculadora {

    
    int Dato1,Dato2,Resultado,datosi;
   
void sumar(){
    
   Resultado=Dato1+Dato2;
}

void restar(){
    
  Resultado= Dato1-Dato2;
    
}

void multiplicar(){
    
  Resultado= Dato1*Dato2;
           
}

void Dividir(){
    
    if(Dato2==0){
       System.out.println("¡error!¡No puedes dividir sobre 0!");
    }
    else{
        Resultado= Dato1/Dato2;
    }
     
}

void setDato1 (int a){
 
    Dato1=a;
}

void setDato2(int b){
    
    Dato2=b;
}

public int getResultado() {
        return Resultado;
    }

    public static void main(String[] args) {
        
       int opcion;
       Scanner miEntrada = new Scanner(System.in);
        
       System.out.println("Seleccione una operacion");
       System.out.println("1. Sumar");
       System.out.println("2. Restar");
       System.out.println("3. Multiplicar");
       System.out.println("4. Dividir");

       
       do{
        
        opcion=miEntrada.nextInt();
  
    
      } while(opcion<1||opcion>4);
       
    Calculadora miCalculadora = new Calculadora();
    
    switch(opcion){
        case 1:
        miCalculadora.setDato1(40);
        miCalculadora.setDato2(20);
        miCalculadora.sumar();
        System.out.println(miCalculadora.getResultado());
        
    }
        
    switch(opcion){
        case 2:
        miCalculadora.setDato1(40);
        miCalculadora.setDato2(20);
        miCalculadora.restar();
        System.out.println(miCalculadora.getResultado());
              
    }
        
    switch(opcion){
        case 3:
        miCalculadora.setDato1(40);
        miCalculadora.setDato2(20);
        miCalculadora.multiplicar();
        System.out.println(miCalculadora.getResultado());
              
    }
        
    
    

        
 
    switch(opcion){
        case 4:
        miCalculadora.setDato1(40);
        miCalculadora.setDato2(0);
        miCalculadora.Dividir();
    
            System.out.println(miCalculadora.getResultado());

  
        
    }
    }
    
}
