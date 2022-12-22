public class Usuário {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo status -> Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(12);

        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
    }
}
