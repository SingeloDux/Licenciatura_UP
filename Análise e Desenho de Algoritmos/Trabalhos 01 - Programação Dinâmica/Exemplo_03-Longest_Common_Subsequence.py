# Função para encontrar a subsequência comum mais longa
def lcs(X, Y):
    m = len(X)
    n = len(Y)
    
    # Criar uma tabela 2D para armazenar os resultados parciais
    dp = [[0] * (n + 1) for _ in range(m + 1)]
    
    # Preencher a tabela de acordo com a lógica da PD
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if X[i - 1] == Y[j - 1]:
                dp[i][j] = dp[i - 1][j - 1] + 1
            else:
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
    
    # O valor na posição dp[m][n] será o tamanho da LCS
    return dp[m][n]

# Exemplo de uso
X = "AGGTAB"
Y = "GXTXAYB"

# Encontrar o tamanho da subsequência comum mais longa
result = lcs(X, Y)
print("O tamanho da subsequência comum mais longa é:", result)
