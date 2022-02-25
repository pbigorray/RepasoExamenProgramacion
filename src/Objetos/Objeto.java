package Objetos;

public class Objeto {
    private String info;
    protected String compartido;
    private static int code;
    private final int codeLast=getCodeLast();

    public Objeto(String info,String compartido){
        this.info=info;
        this.compartido=compartido;
    }

    public void setInfo(String info){
        this.info=info;
    }
    public String getInfo(){
        return info;
    }
    public void setCompartido(String compartido){
        this.compartido=compartido;
    }
    public String getCompartido(){
        return compartido;
    }
    public int getCode(){
        return code;
    }
    public int getCodeLast(){
        return code++;
    }
}
