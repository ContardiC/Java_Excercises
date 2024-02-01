class Cliente{
    // attributi 
    private String nome;
    private String cognome;
    private String codiceFiscale;
    // Data dataNascita;
    
    // Costruttori
    public Cliente(String nome, String cognome, String codiceFiscale){
        this.nome=nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }
    public Cliente(String nome, String cognome){
        this.nome=nome;
        this.cognome = cognome;
    }

    // metodi
    // setter
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setCodiceFiscale(String codiceFiscale){
        this.codiceFiscale = codiceFiscale;
    }
    // getter
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    // toString
    
    public String toString(){
        String res;
        res ="Cliente{" +
               "nome=" + nome +
               " cognome=" + cognome +
               " codiceFiscale=" + codiceFiscale +
               '}';
        return res;
    }
}