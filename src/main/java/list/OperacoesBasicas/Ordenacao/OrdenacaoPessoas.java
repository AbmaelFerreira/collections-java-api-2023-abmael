package main.java.list.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    public List<Pessoa> pessoas ;

    public OrdenacaoPessoas(){
       this.pessoas = new ArrayList<>();
    }

    //: Adiciona uma pessoa à lista.
   public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }


    //: Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

      //: Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}
