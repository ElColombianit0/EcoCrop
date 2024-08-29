package EcoCrop;
import java.util.Scanner;
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int estrato;
        int re1;
        int re2;
        int re3;
        int total;
        int descuento;
        int fina;
        
         
        try {
            System.out.println("Que estrato eres?");
        estrato=sc.nextInt();
        
        switch (estrato){
            case 1:
               System.out.println("cuanto pagas de WiFi");
               re1=sc.nextInt();
               System.out.println("cuanto pagas de Agua");
               re2=sc.nextInt();
               System.out.println("cuanto pagas de Luz");
               re3=sc.nextInt();
                 if (re1 <= 0 || re2 <= 0 || re3 <= 0){
                    System.out.println("valores invalidos");
                    return;
               }

               total=re1+re1+re1;
               System.out.println("su total es de "+total);
               descuento=total*45/100;
               System.out.println("sel total del descuento de 45% es de "+descuento);
               fina=total-descuento;
               System.out.println("su total con el descuento de 45% es de "+fina);
               break;
            
            case 2:
                System.out.println("cuanto pagas de WiFi");
               re1=sc.nextInt();
               System.out.println("cuanto pagas de Agua");
               re2=sc.nextInt();
               System.out.println("cuanto pagas de Luz");
               re3=sc.nextInt();
               if (re1 <= 0 || re2 <= 0 || re3 <= 0){
                    System.out.println("valores invalidos");
                    return;
               }
               total=re1+re1+re1;
               System.out.println("su total es de "+total);
               descuento=total*35/100;
               fina=total-descuento;
               System.out.println("su total con el descuento de 35% es de "+fina);
               break;
            case 3:
                System.out.println("cuanto pagas de WiFi");
               re1=sc.nextInt();
               System.out.println("cuanto pagas de Agua");
               re2=sc.nextInt();
               System.out.println("cuanto pagas de Luz");
               re3=sc.nextInt();
               if (re1 <= 0 || re2 <= 0 || re3 <= 0){
                    System.out.println("valores invalidos");
                    return;
               }
               total=re1+re1+re1;
               System.out.println("su total es de "+total);
               descuento=total*20/100;
               fina=total-descuento;
               System.out.println("su total con el descuento de 20% es de "+fina);
               break;
            case 4:
                System.out.println("cuanto pagas de WiFi");
               re1=sc.nextInt();
               System.out.println("cuanto pagas de Agua");
               re2=sc.nextInt();
               System.out.println("cuanto pagas de Luz");
               re3=sc.nextInt();
               if (re1 <= 0 || re2 <= 0 || re3 <= 0){
                    System.out.println("valores invalidos");
                    return;
               }
               total=re1+re2+re3;
               System.out.println("su toltal es de "+total);
               break;
            case 5:
                System.out.println("cuanto pagas de WiFi");
               re1=sc.nextInt();
               System.out.println("cuanto pagas de Agua");
               re2=sc.nextInt();
               System.out.println("cuanto pagas de Luz");
               re3=sc.nextInt();
               if (re1 <= 0 || re2 <= 0 || re3 <= 0){
                    System.out.println("valores invalidos");
                    return;
               }
               total=re1+re2+re3;
               System.out.println("su toltal es de "+total);
               break;
            case 6:
                System.out.println("cuanto pagas de WiFi");
               re1=sc.nextInt();
               System.out.println("cuanto pagas de Agua");
               re2=sc.nextInt();
               System.out.println("cuanto pagas de Luz");
               re3=sc.nextInt();
               if (re1 <= 0 || re2 <= 0 || re3 <= 0){
                    System.out.println("valores invalidos");
                    return;
               }
               total=re1+re2+re3;
               System.out.println("su toltal es de "+total);
               
               
               break;
        default:{
                System.out.println("valor invalido");
        }
               
        }
        }catch (Exception ex) {
            System.out.println("valores invalidos");
            
        }
        
            
        
       
        
    }
}