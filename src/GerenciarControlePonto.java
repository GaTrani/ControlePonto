import java.time.LocalDate;
import java.time.LocalDateTime;

//Gabriel Trani Avancini
//Michelle Ferreira

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MEU CONTROLE DE PONTO");

        //GERENTE
        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("Gabriel");
        gerente.setEmail("gabriel@gmail.com");
        gerente.setDocumento("999.999.999-9");
        gerente.setLogin("GaTrani");
        gerente.setSenha("123");

        RegistroPonto gerente1 = new RegistroPonto();
        gerente1.setFunc(gerente);
        gerente1.setDataRegistro(LocalDate.now());
        gerente1.setHoraEntrada(LocalDateTime.now());
        gerente1.apresentarRegistroPonto();
        Thread.sleep(1000);

        //SECRETARIA
        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Michelle");
        secretaria.setEmail("mi@gmail.com");
        secretaria.setDocumento("999.999.999-9");
        secretaria.setTelefone("19-99999999");
        secretaria.setRamal("ramal 2");

        RegistroPonto secretaria1 = new RegistroPonto();
        secretaria1.setFunc(secretaria);
        secretaria1.setDataRegistro(LocalDate.now());
        secretaria1.setHoraEntrada(LocalDateTime.now());
        secretaria1.apresentarRegistroPonto();
        Thread.sleep(1000);

        //OEPRADOR
        Operador operador = new Operador();
        operador.setIdFunc(2);
        operador.setNome("Isa");
        operador.setEmail("isa@gmail.com");
        operador.setDocumento("999.999.999-9");
        operador.setValorHora(33.0);

        RegistroPonto operador1 = new RegistroPonto();
        operador1.setFunc(operador);
        operador1.setDataRegistro(LocalDate.now());
        operador1.setHoraEntrada(LocalDateTime.now());
        operador1.apresentarRegistroPonto();
        Thread.sleep(1000);

        //SAIDAS
        gerente1.setHoraSaida(LocalDateTime.now());
        gerente1.apresentarRegistroPonto();
        secretaria1.setHoraSaida(LocalDateTime.now());
        secretaria1.apresentarRegistroPonto();
        operador1.setHoraSaida(LocalDateTime.now());
        operador1.apresentarRegistroPonto();
        Thread.sleep(1000);

    }
}