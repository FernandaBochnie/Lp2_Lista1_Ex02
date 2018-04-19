

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Entidade {
    private String Nome;
    private String Sexo;
    private String Resultado;

    public String getResultado() {
        if (String.valueOf(Sexo).equals("Feminino")) {
            Resultado="Ilma Sra. "+Nome;
        }
        if (String.valueOf(Sexo).equals("Masculino")) {
            Resultado="Ilmo Sr. "+Nome;  
            return Resultado;
        }
        return Resultado;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
}
