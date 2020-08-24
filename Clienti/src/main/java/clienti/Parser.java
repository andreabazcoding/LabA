package clienti;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author luqmanasghar
 */
public class Parser {

    public Parser() {}    
    
    public void readFromFile(String path) throws Exception
    {
        File file = new File(path);        
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(file);
        
        System.out.println("------------------");
        System.out.println("line scanner");
        System.out.println("------------------");        
        
        while (scanner.hasNextLine()) {
            Scanner line = new Scanner(scanner.nextLine());
            cliente.setName((line.hasNext() && (!"-".equals(line.next())) ) ? line.next() : null);
            cliente.setSurname((line.hasNext() && (!"-".equals(line.next()))) ? line.next() : null);
            cliente.setCity((line.hasNext() && (!"-".equals(line.next()))) ? line.next() : null);
            cliente.setProvince((line.hasNext() && (!"-".equals(line.next()))) ? line.next() : null);
            cliente.setMail((line.hasNext() && (!"-".equals(line.next()))) ? line.next() : null);
            cliente.setNickName((line.hasNext() && (!"-".equals(line.next()))) ? line.next() : null);
            cliente.setPassword((line.hasNext() && (!"-".equals(line.next()))) ? line.next() : null);
            line.close(); // teoricamente endline
        }
        scanner.close();
        cliente.printCliente();
        
        System.out.println("------------------");
        System.out.println("Scanner con substring");
        System.out.println("------------------");
        
        cliente = new Cliente();
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
          String line = scanner.nextLine();
          cliente.setName(line.substring(0, 29));
          cliente.setSurname(line.substring(30, 59));
          cliente.setCity(line.substring(60, 99));
          cliente.setProvince(line.substring(100, 102));
          cliente.setMail(line.substring(103, 134));
          cliente.setNickName(line.substring(135, 145));
          cliente.setPassword(line.substring(146, 160));
        }
        cliente.printCliente();
        scanner.close();
        
        System.out.println("------------------");
        System.out.println("Scanner last");
        System.out.println("------------------");
        scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
        scanner.close();
    } 
                
}
