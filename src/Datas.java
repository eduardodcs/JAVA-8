import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2026, Month.JANUARY, 5);
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximasOlimpiadas.format(formatador));
		
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorHora));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		
	}
}
