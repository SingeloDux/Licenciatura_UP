# Função para encontrar a ordem ótima de multiplicação
def matrix_chain_order(p):
    n = len(p) - 1
    m = [[0 for _ in range(n)] for _ in range(n)]

    for length in range(2, n+1):  # Tamanho da cadeia
        for i in range(n-length+1):
            j = i + length - 1
            m[i][j] = float('inf')
            for k in range(i, j):
                q = m[i][k] + m[k+1][j] + p[i]*p[k+1]*p[j+1]
                if q < m[i][j]:
                    m[i][j] = q
    return m[0][n-1]

# Exemplo de uso
dimensions = [10, 30, 5, 60]
min_operations = matrix_chain_order(dimensions)
print(f"O número mínimo de operações é {min_operations}")