package main.java.list.OperacoesBasicas.catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    //Adiciona um livro ao catálogo.
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public void pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livros.isEmpty()){
            for(Livro livro: livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }

    }

    //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livros.isEmpty()){
            for(Livro livro: livros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;

    }

    //: Pesquisa livros por título e retorna o primeiro livro encontrado.
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;

        if(!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTítulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }
}
