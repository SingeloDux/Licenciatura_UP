# Definir um valor infinito para representar a ausência de conexão
INF = float('inf')

# Função para o Algoritmo de Floyd-Warshall
def floyd_warshall(graph):
    V = len(graph)
    dist = [list(row) for row in graph]
    
    # Aplicar o algoritmo
    for k in range(V):
        for i in range(V):
            for j in range(V):
                if dist[i][j] > dist[i][k] + dist[k][j]:
                    dist[i][j] = dist[i][k] + dist[k][j]
    
    return dist

# Definindo o grafo (as cidades e as distâncias entre elas)
graph = [
    [0, 5, INF, 10],  # A para A (0), A para B (5), A para C (inf), A para D (10)
    [INF, 0, 3, INF], # B para A (inf), B para B (0), B para C (3), B para D (inf)
    [INF, INF, 0, 1], # C para A (inf), C para B (inf), C para C (0), C para D (1)
    [INF, INF, INF, 0]# D para A (inf), D para B (inf), D para C (inf), D para D (0)
]

# Executar o algoritmo
distances = floyd_warshall(graph)

# Exibir as menores distâncias entre as cidades
print("Menores distâncias entre as cidades:")
for row in distances:
    print(row)
