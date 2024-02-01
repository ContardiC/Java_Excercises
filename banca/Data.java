package banca;

import java.time.LocalDate;

public class Data {
    private int giorno;
    private int mese;
    private int anno;
    // costruttore
    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese= mese;
        this.anno = anno;
    }
    public Data(){
        LocalDate oggi = LocalDate.now();
        giorno = oggi.getDayOfMonth();
        mese = oggi.getMonthValue();
        anno = oggi.getYear();
    }
    // setter
    public void setGiorno(int giorno){
        this.giorno = giorno;
    }
    public void setMese(int mese){
        if(mese<1 || mese >12){
            throw new IllegalArgumentException("Mese errato");
        }else{
            this.mese=mese;
        }
    }
    public void setAnno(int anno){
        this.anno=anno;
    }
    // getter
    public int getGiorno(){
        return giorno;
    }
    public int getMese(){
        return mese;
    }
    public int getAnno(){
        return anno;
    }
    // toString
    public String toString(){
        String res;
        res ="Data{" +
               "giorno=" + giorno +
               " mese=" + mese +
               " anno=" + anno +
               '}';
        return res;
    }
    public String toStringFormat(int formato){
        String res=null;
        //TODO: buildare giorno mese e anno separati ma gia con lo zero o no
        switch(formato){
            case 0:
            // gg-mm-aaaa
            if(giorno<10){
                res="0"+giorno;
            }
            else{
                res=giorno+"";
            }
            if(mese<10){
                res+="-0"+mese;
            }else{
               res+=mese+""; 
            }
            res+=anno;
            break;
            // mm-gg-aaaa
            case 1:
            break;
            // aaaa-mm-gg
            case 2:
            
            default:
                //TODO: pensare a un qualcosa di default 
        }
        return res;
    }
}
