package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }
   public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total na lista é "+ listaTarefas.obterNumeroTotalTarefas());

//        listaTarefas.adicionarTarefa("Tarefa 1");
//        listaTarefas.adicionarTarefa("Tarefa 1");
//        listaTarefas.adicionarTarefa("Tarefa 2");

        listaTarefas.removerTarefa("Tarefa 1");

        listaTarefas.obterDescricaoTarefas();

        System.out.println("O numero total na lista é "+ listaTarefas.obterNumeroTotalTarefas());
    }

}