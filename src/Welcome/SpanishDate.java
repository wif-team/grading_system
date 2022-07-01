package Welcome;

public class SpanishDate {

    public String getSpanishDay(String day) {
        switch (day) {
            case "MONDAY":
                return "Lunes";
            case "TUESDAY":
                return "Martes";
            case "WEDNESDAY":
                return "Miércoles";
            case "THURSDAY":
                return "Jueves";
            case "FRIDAY":
                return "Viernes";
            case "SATURDAY":
                return "Sábado";
            case "SUNDAY":
                return "Domingo";
            default:
                return "";
        }
    }

    public String getSpanishMonth(String month) {
        switch (month) {
            case "JANUARY":
                return "Enero";
            case "FEBRUARY":
                return "Febrero";
            case "MARCH":
                return "Marzo";
            case "APRIL":
                return "Abril";
            case "MAY":
                return "Mayo";
            case "JUNE":
                return "Junio";
            case "JULY":
                return "Julio";
            case "AUGUST":
                return "Agosto";
            case "SEPTEMBER":
                return "Septiembre";
            case "OCTOBER":
                return "Octubre";
            case "NOVEMBER":
                return "Noviembre";
            case "DECEMBER":
                return "Diciembre";
            default:
                return "";
        }
    }
}
