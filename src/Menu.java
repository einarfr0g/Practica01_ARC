import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Convertidor conve = new Convertidor();
        boolean noQuiroSalir = true; 
        boolean aux = false;
        String NumeroEnbianrio = "";
        int b1 = -1; 
        int b2 = -1;
        while(noQuiroSalir){
            System.out.println("HOLA BIENVENIDO AL CONVERTIDOR DE BASES");
            aux = true;

            while(aux){
                System.out.println("Ingrese la base del número que desea convertir");
                Scanner scan = new Scanner(System.in);
                try {
                    b1 = scan.nextInt();
                    if(!((b1==10)||(b1==2)||(b1==8)||(b1==16))){
                        throw new Exception("esa base no está permmitida"); 
                    }
                    aux = false;
                    
                } catch (Exception e) {
                    System.out.println("ese no es un número prueba de nuevo o no es una base permitida");
                }
            }

            conve.setBase(b1);
            aux = true;
            while(aux){
                String num;
                Scanner scan = new Scanner(System.in);
                System.out.println("Ingrese el número que desea convertir");
                num = scan.nextLine();
                conve.setnumeroAConvertir(num);
                switch (conve.getBase()) {
                    case 2:
                        try {
                            conve.binariocheck();
                            NumeroEnbianrio = conve.getnumeroAComvertir();
                            aux = false;
                        } catch (Exception e) {
                            System.out.println("El número no está en binario, prube de nuevo");
                        }
                        break;

                    case 8:
                        try {
                            NumeroEnbianrio=conve.conversion8a2(num);
                            aux = false;
                        } catch (Exception e) {
                            System.out.println("El número no está en octal, prube de nuevo");
                        }
                        break;

                    case 10:
                        try {
                            NumeroEnbianrio=conve.conversion10a2(num);
                            aux = false;
                        } catch (Exception e) {
                            System.out.println("El número no está en decimal, prube de nuevo");
                        }
                        break;

                    case 16:
                        try {
                            NumeroEnbianrio=conve.conversion16a2(num);
                            aux = false;
                        } catch (Exception e) {
                            System.out.println("El número no está en hexadecimal, prube de nuevo");
                        }
                        break;
                    
                
                    default:
                        break;
                }
                

            }

            aux = true;

            while(aux){
                System.out.println("Ingrese la base al que desea convertirlo");
                Scanner scan = new Scanner(System.in);
                try {
                    b2 = scan.nextInt();
                    if(!((b1==10)||(b1==2)||(b1==8)||(b1==16))){
                        throw new Exception("esa base no está permitida"); 
                    }else if(b1==b2){
                        throw new Exception("el número ya está en esa base");
                    }
                    aux = false;
                    
                } catch (Exception e) {
                    System.out.println("ese no es un número prueba de nuevo, no es una base permitida o el número ya está en esa base, intente de nuevo");
                }
            }

            switch (b2) {
                case 2:
                    System.out.println("su Número en decimal es :" + NumeroEnbianrio);

                    break;

                case 8:
                    System.out.println("su Número en octal es :" + conve.conversion2a8(NumeroEnbianrio));

                    break;

                case 10:
                    System.out.println("su Número en decimal es :" + conve.conversion2a10(NumeroEnbianrio));

                    break;

                case 16:
                    System.out.println("su Número en hexadecimal es :" + conve.conversion2a16(NumeroEnbianrio));

                    break;
            
                default:
                    break;
            }

            System.out.println("desea cambiarlo convertir otro número ?");

            System.out.println("1:si 0:no");

            aux=true;

            int opcion= -1;

            while(aux){
                Scanner scan = new Scanner(System.in);
                opcion = scan.nextInt();
                if((opcion!=1)&&(opcion!=0)){
                    System.out.print("NO es una opción valida, intenta de nuevo");
                }else{
                    aux=false;
                }
            }

            if(opcion==0){
                noQuiroSalir=false;
            }


            

            
        }
    }
}
