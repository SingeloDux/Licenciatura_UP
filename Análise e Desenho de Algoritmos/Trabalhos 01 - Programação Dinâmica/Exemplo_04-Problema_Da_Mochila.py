# Função para resolver o Problema da Mochila
def knapsack(max_peso, pesos, valores, n):
    # Criar uma tabela 2D para armazenar os resultados parciais
    dp = [[0 for x in range(max_peso + 1)] for x in range(n + 1)]
    
    # Preencher a tabela de acordo com a lógica da PD
    for i in range(n + 1):
        for w in range(max_peso + 1):
            if i == 0 or w == 0:
                dp[i][w] = 0
            elif pesos[i - 1] <= w:
                dp[i][w] = max(valores[i - 1] + dp[i - 1][w - pesos[i - 1]], dp[i - 1][w])
            else:
                dp[i][w] = dp[i - 1][w]
    
    # O valor máximo que pode ser obtido com o peso máximo será armazenado em dp[n][max_peso]
    return dp[n][max_peso]

# Exemplo de uso
valores = [60, 100, 120]  # Valores dos itens
pesos = [10, 20, 30]  # Pesos dos itens
max_peso = 50  # Capacidade máxima da mochila
n = len(valores)  # Número de itens

# Chamar a função e mostrar o resultado
resultado = knapsack(max_peso, pesos, valores, n)
print("O valor máximo que pode ser obtido é:", resultado)
