public class Main {
    public static void main(String[] args)
    {
        // Criar objetos do passeio
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Piloto piloto = new Piloto();
        Balao balao = new Balao();

        p1.nome = "Brad Pitt";
        p2.nome = "Jennifer Aniston";

        p1.tel = "11 94002-8922";
        p2.tel = "11 99912-5003";

        p1.telEmergencia = "11 98765-4321";
        p2.telEmergencia = "11 91234-5678";

        p1.cpf = "809.115.329-51";
        p2.cpf = "449.394.089-14";

        p1.rg = "50.238.309-4";
        p2.rg = "41.484.244-3";

        p1.estado = "Colúmbia Britânica";
        p2.estado = "Colúmbia Britânica";

        p1.cidade = "Vancouver";
        p2.cidade = "Vancouver";

        p1.bairro = "Grandview-Island";
        p2.bairro = "Grandview-Island";

        p1.rua = "Turner St";
        p2.rua = "Turner St";
    }
}