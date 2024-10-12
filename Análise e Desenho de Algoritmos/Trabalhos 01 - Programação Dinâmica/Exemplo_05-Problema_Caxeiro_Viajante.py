import itertools

# Função para resolver o TSP usando Programação Dinâmica
def tsp(grafo, inicio):
    n = len(grafo)
    todas_cidades = set(range(n))

    # Tabela para armazenar o menor custo até cada conjunto de cidades visitadas
    memo = {}

    # Função recursiva para calcular o menor caminho
    def viajar(cidade_atual, cidades_visitadas):
        if cidades_visitadas == (1 << n) - 1:  # Se todas as cidades foram visitadas
            return grafo[cidade_atual][inicio]  # Retorna à cidade inicial

        if (cidade_atual, cidades_visitadas) in memo:
            return memo[(cidade_atual, cidades_visitadas)]

        # Explorar todas as cidades não visitadas
        custo_minimo = float('inf')
        for prox_cidade in range(n):
            if cidades_visitadas & (1 << prox_cidade) == 0:  # Se a cidade ainda não foi visitada
                novo_custo = grafo[cidade_atual][prox_cidade] + viajar(prox_cidade, cidades_visitadas | (1 << prox_cidade))
                custo_minimo = min(custo_minimo, novo_custo)

        # Armazenar o resultado no memo
        memo[(cidade_atual, cidades_visitadas)] = custo_minimo
        return custo_minimo

    # Iniciar a viagem da cidade inicial
    return viajar(inicio, 1 << inicio)

# Exemplo de uso:
grafo = [
    [0, 10, 15, 20],
    [10, 0, 35, 25],
    [15, 35, 0, 30],
    [20, 25, 30, 0]
]

inicio = 0  # Cidade inicial (indexada como 0)

# Chamar a função para resolver o TSP
resultado = tsp(grafo, inicio)
print(f"O menor custo para visitar todas as cidades é: {resultado}")
