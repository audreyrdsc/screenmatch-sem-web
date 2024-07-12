package br.com.alura.ScreenMatchSpring.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
