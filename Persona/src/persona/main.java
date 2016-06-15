package persona;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Persona 1persona = new Persona();
        Persona 2persona = new Persona();        
        Persona 3persona = new Persona();
        Persona 4persona = new Persona();
        Scanner sc = new Scanner(System.in);
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println(" * 1 Persona * ");
        System.out.print("Ingrese nombre: ");
        1persona.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        1persona.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        1persona.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        1persona.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        1persona.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        1persona.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 2 si es soltero: ");
        1persona.casado = sc.nextInt();
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\n 2Persona ");
        System.out.print("Ingrese nombre: ");
        2persona.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        2persona.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        2persona.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        2persona.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        2persona.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        2persona.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 2 si es soltero: ");
        2persona.casado = sc.nextInt();
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        System.out.println("\n3 Persona ");
        System.out.print("Ingrese nombre: ");
        3persona.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        3persona.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        3persona.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        3persona.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        3persona.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        3persona.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 2 si es soltero: ");
        3persona.casado = sc.nextInt();
     
        System.out.println("\nCuarta Persona ");
        System.out.print("Ingrese nombre: ");
        4persona.nombre = sc.next();
        System.out.print("Ingrese apellido: ");
        4persona.apellido = sc.next();
        System.out.print("Ingrese cedula de indentidad: ");
        4persona.cedulaIdentidad = sc.next();
        System.out.print("Ingrese edad: ");
        4persona.fechaNacimiento = sc.nextInt();
        System.out.print("Ingrese telefono: ");
        4persona.telefono = sc.next();
        System.out.print("Ingrese lugar de residencia: ");
        4persona.lugarResidencia = sc.next();
        System.out.print("Ingrese 1 si es casado y 2 si es soltero: ");
        4persona.casado = sc.nextInt();
       
        System.out.println("\nLa siguiente lista son de las personas que viven en Esmeraldas , son casadas y tienes mas de 30 años:");
        if(1persona.lugarResidencia.equalsIgnoreCase("Esmeraldas") && 1persona.fechaNacimiento >= 30 && 1persona.casado == 1){
            System.out.println(persona1.nombre + " " + 1persona.apellido);
        }
        if(2persona.lugarResidencia.equalsIgnoreCase("Esmeraldas") && 2persona.fechaNacimiento >= 30 && 2persona.casado == 1){
            System.out.println(2persona.nombre + " " + 2persona.apellido);
        }
        if(3persona.lugarResidencia.equalsIgnoreCase("Esmeraldas") && 3persona.fechaNacimiento >= 30 && 3persona.casado == 1){
            System.out.println(3persona.nombre + " " + 3persona.apellido);
        }
        if(persona4.lugarResidencia.equalsIgnoreCase("Esmeraldas") && 4persona.fechaNacimiento >= 30 && 4persona.casado == 1){
            System.out.println(4persona.nombre + " " + 4persona.apellido);
        }
    }
}