package main.java.list.OperacoesBasicas.catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livros;

    public CatalogoLivros() {
            livros = new ArrayList<>();
    }

    //Adiciona um livro ao catálogo.
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public List<Livro>  pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!this.livros.isEmpty()){
            for(Livro livro: this.livros) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
         return livrosPorAutor;
    }

    //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!this.livros.isEmpty()){
            for(Livro livro: this.livros) {
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

        if(!this.livros.isEmpty()) {
            for (Livro livro : this.livros) {
                if (livro.getTítulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
            Livro livro1 = new Livro("Livro 1","Abmael", 2020);
            Livro livro2 = new Livro("Livro 1","Fernando", 2021);
            Livro livro3 = new Livro("Livro 3", "Fernando", 2022);
            Livro livro4 = new Livro("Livro 4","Crys", 2023);
            Livro livro5 = new Livro("Livro 5", "Vivi", 1994);

        catalogoLivros.adicionarLivro(livro1);
        catalogoLivros.adicionarLivro(livro2);
        catalogoLivros.adicionarLivro(livro3);
        catalogoLivros.adicionarLivro(livro4);
        catalogoLivros.adicionarLivro(livro5);

        System.out.println(catalogoLivros.pesquisarPorAutor("Fernando"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
