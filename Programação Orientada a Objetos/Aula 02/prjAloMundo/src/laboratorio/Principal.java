package laboratorio;
/**
 *
 * @author Lucas M. Gonçalves
 */
public class Principal {
    String mensagem;
    
    public Principal(){
        this.mensagem = "Alo Mundo!";
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }
        
    public static void main(String[] args){
        Principal p = new Principal();
        System.out.println(p.getMensagem());
        p.setMensagem("Um novo alo mundo");
        System.out.println(p.getMensagem());
    }
}