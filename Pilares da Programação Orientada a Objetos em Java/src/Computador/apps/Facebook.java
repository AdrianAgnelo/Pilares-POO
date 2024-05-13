package Computador.apps;

public class Facebook extends ServicoMensagemInstantanea{
    
    public  void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Facebook");
    }
	public  void receberMensagem() {
        System.out.println("Recebido pelo Facebook");
    }

    public  void salvarHistoricoMensagem(){
        System.out.println("Salvando no Facebook");
    }
}
