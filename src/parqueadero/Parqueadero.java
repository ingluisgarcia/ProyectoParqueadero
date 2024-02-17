
package parqueadero;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Parqueadero {
    
    private String placa;
    private String horaEntrada;
    private String horaSalida;
    
    public Parqueadero(String placa){
        this.placa = placa;
        horaEntrada= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .format(Calendar.getInstance().getTime());
        horaSalida = null;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getHoraEntrada(){
        return horaEntrada;
    }
    
    public String getHoraSalida(){
        if(horaSalida !=null){
            return horaSalida;
        }else{
            return "Dentro del Parqueadero";
        }
        
    }
    
    public void setHoraSalida(){
        horaSalida = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                .format(Calendar.getInstance().getTime());
    }
    
}
