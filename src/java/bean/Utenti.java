package bean;

/**
 *
 * @author Giovanni Cirillo
 */
public class Utenti {

    private String cognome;
    private String nome;
    private String telefono;
    private String username;
    private String password;
    private String tipoutente;
    
    public Utenti() {
        this.cognome = "";
        this.nome = "";
        this.telefono = "";
        this.username = "";
        this.password = "";
        this.tipoutente = "";
    }

    public Utenti(String cognome, String nome, String telefono, String username, String password, String tipoutente) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
        this.tipoutente = tipoutente;
    }
    
    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the tipoutente
     */
    public String getTipoutente() {
        return tipoutente;
    }

    /**
     * @param tipoutente the tipoutente to set
     */
    public void setTipoutente(String tipoutente) {
        this.tipoutente = tipoutente;
    }
    
    
}
