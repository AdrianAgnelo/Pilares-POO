package Computador.apps;

public class MSN extends ServicoMensagemInstantanea{
    public  void enviarMensagem(){
        System.out.println("Enviando mensagem pelo MSN");
    }
	public  void receberMensagem() {
        System.out.println("Recebido pelo MSN");
    }
    public  void salvarHistoricoMensagem(){
        System.out.println("Salvando no MSN");
    }
}
