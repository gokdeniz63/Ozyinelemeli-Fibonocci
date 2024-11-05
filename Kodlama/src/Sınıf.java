import java.util.*;
import java.lang.*;
import java.math.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.*;
import java.util.regex.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.JSpinner.ListEditor;
import java.nio.file.attribute.FileTime;
import java.net.*;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;


 class  Sınıf {
	 
	static int fib(int n) {
		int fb;
		if(n==0 || n==1)
			fb=n;
		else
			fb=fib(n-1)+fib(n-2);
		return fb;
	}
    public static void main(String[] args) {
    	 out.print("Kaçıncı Eleman:");
    	 int n;
    	 Scanner gir=new Scanner(System.in);   	 
    	 n=gir.nextInt();
    	 out.printf("%d. eleman:%d",n,fib(n));
    	 
    }   
}
