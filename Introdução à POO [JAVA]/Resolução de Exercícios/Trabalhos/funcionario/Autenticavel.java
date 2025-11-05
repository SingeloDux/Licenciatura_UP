package funcionario;

// Interface para funcionários que precisam de login
interface Autenticavel {
    boolean autenticar(String usuario, String senha);
    void alterarSenha(String novaSenha);
    String getUsuario();
    double calcularBonusPerformance();
}