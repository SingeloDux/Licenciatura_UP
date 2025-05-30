document.addEventListener("DOMContentLoaded", () => {
    const slides = document.querySelector(".slides");
    const slideItems = document.querySelectorAll(".slide");
    const btnEsq = document.querySelector(".seta.esquerda");
    const btnDir = document.querySelector(".seta.direita");

    const totalSlides = slideItems.length;
    let indiceAtual = 0;

    const mostrarSlides = () => {
        const larguraSlide = slideItems[0].offsetWidth + 5; // slide + gap
        slides.style.transform = `translateX(-${indiceAtual * larguraSlide}px)`;
    };

    btnDir.addEventListener("click", () => {
        if (indiceAtual < totalSlides - 2) {
            indiceAtual++;
            mostrarSlides();
        }
    });

    btnEsq.addEventListener("click", () => {
        if (indiceAtual > 0) {
            indiceAtual--;
            mostrarSlides();
        }
    });

    window.addEventListener("resize", mostrarSlides);

    const frases = [
        "Ter um hobby pode ser tão importante quanto ter o que comer — ambos alimentam partes diferentes de quem somos.",
        "Não é fuga, é reencontro: todo tempo dedicado ao que amamos é um ato de resistência à rotina.",
        "O que você faz quando ninguém está olhando diz mais sobre quem você é do que seu currículo.",
        "Sem um espaço de prazer, a vida vira apenas sobrevivência.",
        "A alma também precisa de descanso, e o hobby é o travesseiro invisível da mente.",
        "Criar por prazer é um grito silencioso contra a produtividade obrigatória.",
        "Um hobby não preenche o tempo: ele dá sentido ao tempo livre.",
        "A arte de perder tempo com o que se ama é, na verdade, o tempo mais bem investido.",
        "Entre o caos do mundo e a paz interior, existe um lugar chamado 'meu tempo'.",
        "Muitos trabalham para viver, poucos vivem — quem tem um hobby sabe a diferença."
    ];

    const bloco = document.getElementById("frase-hobby");
    const btn = document.querySelector(".explorar");

    const novaFrase = () => {
        const indice = Math.floor(Math.random() * frases.length);
        bloco.textContent = frases[indice];
    };

    btn.addEventListener("click", novaFrase);
    novaFrase(); // mostra uma frase aleatória ao carregar
});
