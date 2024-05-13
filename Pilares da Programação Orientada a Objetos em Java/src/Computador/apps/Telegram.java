package Computador.apps;

public class Telegram  extends ServicoMensagemInstantanea{
    public  void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Telegram");
    }
	public  void receberMensagem() {
        System.out.println("Recebido pelo Telegram");
    }

    public  void salvarHistoricoMensagem(){
        System.out.println("Salvando no telegram");
    }
}
