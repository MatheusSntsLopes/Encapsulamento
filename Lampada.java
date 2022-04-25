public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String [] tipos;
    private boolean TipoAbajur;
    private boolean ligada;

    public Lampada(String modelo, String tensao, String cor, String tipoLuz, String[] tipos, int garantiaMeses, boolean TipoAbajur, boolean ligada){
      this.modelo = modelo;
      this.tensao = tensao;
      this.cor = cor;
      this.tipoLuz = tipoLuz;
      this.tipos = tipos;
      this.garantiaMeses = garantiaMeses;
      this.TipoAbajur = TipoAbajur;
      this.ligada = ligada;
    }
    public Lampada() {
    }

    //get e set
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return this.tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return this.tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return this.garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return this.tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return this.TipoAbajur;
    }

    public void setTipoAbajur(boolean TipoAbajur) {
        this.TipoAbajur = TipoAbajur;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    //metodos
    public void ligar(){
        setLigada(true);
    }
    public void desligar(){
        setLigada(false); 
     }
    public void mostrarEstado(){
        if (isLigada()){
            System.out.println("A lampada esta ligada");
        } else{
            System.out.println("A lampada esta desligada");
        }
    }
    public void mudarEstado(){
        if(isLigada()){
            desligar();
        } else{
            ligar();
        }
    }
 }
