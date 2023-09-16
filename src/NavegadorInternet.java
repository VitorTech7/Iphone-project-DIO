public interface NavegadorInternet extends AparelhoTelefonico{


    void conectar();
    void desconectar();
    void abrirPagina(String url);
    void fecharPagina();
    void navegar(String url);
}
