public class DeteccaoIntrusaoMISDE {
    public static void main(String[] args) {
        //simulacao de entrada trafego de rede
        String inputData = "Dados de entrada tráfego de rede: ";

        //execucao de diferentes algoritmos de deteccao em paralelo
        Thread algorithm1Thread = new Thread(() -> {
            //primeiro algoritimo de deteccao
            System.out.println("Executando algoritimo 1...");
        });

        Thread algorithm2Thread = new Thread(() -> {
            //desgundo algoritimo 
            System.out.println("Executando algoritimo 2...");
        });

        //iniciando threds para executar algoritimo em paralelo
        algorithm1Thread.start();
        algorithm2Thread.start();

        //aguardando threads terminarem
        try{
            algorithm1Thread.join();
            algorithm2Thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
