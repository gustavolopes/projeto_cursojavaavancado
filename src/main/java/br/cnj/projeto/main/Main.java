package br.cnj.projeto.main;

import br.cnj.projeto.util.CasoJudicial;
import br.cnj.projeto.util.CustoJudicial;
import br.cnj.projeto.util.TaxaJudicial;

public class Main {
    public static void main(String[] args) {
        CasoJudicial caso = new CasoJudicial(new CustoJudicial(), new TaxaJudicial());
		caso.finalizarCusto(100, "RJ", 2024);
    }
}