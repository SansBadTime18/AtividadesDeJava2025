package br.com.exemplo.seguranca;

public interface Autenticavel {
    boolean login(String usuario, String senha);
    void logout();
}
