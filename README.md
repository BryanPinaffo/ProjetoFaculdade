Classe Player
A classe Player define um jogador com atributos como nome, idade, ataque, arma, pontos de vida (hp) e experiência (xp). Possui dois construtores e vários métodos para gerenciar esses atributos.

Construtores:

Construtor padrão: Inicializa um jogador sem parâmetros.
Construtor com parâmetros: Inicializa um jogador com os valores fornecidos para nome, idade, ataque, hp, xp e arma.
Métodos:

takeDamage(int damage): Reduz os pontos de vida do jogador e do inimigo de acordo com o dano recebido.
isAlive(): Verifica se o jogador ainda está vivo (hp > 0).
distributeXpPoints(int xpPoints): Permite ao jogador distribuir pontos de experiência entre vida e força.
Getters e Setters: Métodos para acessar e modificar os atributos do jogador.
Classe Profile
A classe Profile gerencia a criação e configuração inicial de um jogador.

Construtor:

Construtor padrão: Inicializa um perfil com um novo jogador.
Métodos:

createPlayer(): Cria um novo jogador solicitando ao usuário informações como nome, idade e escolha de arma. Define os atributos iniciais do jogador e ajusta esses atributos conforme a arma escolhida.
Classe Text
A classe Text contém métodos estáticos para interação com o usuário usando caixas de diálogo (JOptionPane).

Métodos:
select(String title, String msg, String[] options): Exibe uma seleção com opções e retorna a opção selecionada.
getValidSelection(String title, String msg, String[] options): Obtém uma seleção válida, garantindo que uma opção foi escolhida.
showMessage(String message): Exibe uma mensagem simples.
showInput(String message): Solicita uma entrada de texto do usuário.
inputNumber(String message): Solicita uma entrada numérica do usuário, garantindo que um número válido foi inserido.
playerProfile(Player player): Retorna uma string com o perfil do jogador.
enemyEncounter(Enemy enemy): Retorna uma string com detalhes do encontro com um inimigo.
randomInt(int min, int max): Gera um número aleatório dentro de um intervalo.
Classe Main
A classe Main contém o método principal (main), que inicializa o jogo.

Método main(String[] args): Tenta inicializar o jogador como nulo e exibe o menu do jogo. Se ocorrer uma exceção, exibe uma mensagem de erro.


Classe BattleSimulator
A classe BattleSimulator gerencia as batalhas entre o jogador e os inimigos no jogo.

Atributos:

player: Objeto da classe Player representando o jogador.
enemy: Objeto da classe Enemy representando o inimigo.
canUseSpecialAttack: Booleano que indica se o jogador pode usar um ataque especial.
textUtil: Objeto da classe Text para manipulação de texto (assumido pelo contexto do código).
Construtor:

Inicializa os atributos do simulador de batalha.
Métodos:

startBattle(): Inicia e controla o loop da batalha até que o jogador ou o inimigo morra.
rewardBattle(int xpEarned): Recompensa o jogador com pontos de experiência após uma batalha.
performNormalAttack(): Realiza um ataque normal do jogador.
performSpecialAttack(): Realiza um ataque especial do jogador.
healing(): Cura o jogador.
simulateEnemyAttack(): realiza o ataque do inimigo ao jogador.
Classe Enemy
A classe Enemy herda de Player e representa os inimigos no jogo.

Construtor:
Inicializa um inimigo com nome, ataque e pontos de vida (hp), passando valores nulos para idade, experiência (xp) e arma.
Classe GameMenu
A classe GameMenu gerencia os menus do jogo, permitindo ao jogador iniciar um novo jogo ou sair.

Métodos:
showMenu(Player player): Exibe o menu principal do jogo.
defeatMenu(Player player): Exibe o menu quando o jogador é derrotado.
newGame(): Inicia um novo jogo, criando um novo jogador e executando os níveis do jogo.
Classe Level
A classe Level gerencia os diferentes níveis do jogo, fornecendo a narrativa e desafios específicos de cada nível.

Atributos:

textUtil: Objeto da classe Text para manipulação de texto.
Construtor:

Inicializa o objeto textUtil.
Métodos:

level01(Player player): Implementa o primeiro nível do jogo, onde o jogador enfrenta o "Executivo Corporativo".
level02(Player player): Implementa o segundo nível do jogo, onde o jogador enfrenta a "Engenheira Louca".
level03(Player player): Implementa o terceiro nível do jogo, onde o jogador enfrenta a "Lenhadora Desonesta".
level04(Player player): Implementa o quarto nível do jogo, onde o jogador enfrenta o "Barão da Poluição".
levelFinal(Player player): Implementa o nível final do jogo, onde o jogador enfrenta a "Rainha das Trevas".
Explicação dos Níveis
Nível 1: O Distrito Poluído
Narrativa: O jogador enfrenta criaturas mutantes em um ambiente poluído.
Decisões: Atacar o "Executivo Corporativo" ou se esconder.
Inimigo: Executivo Corporativo.
Nível 2: As Ruínas Subterrâneas
Narrativa: O jogador encontra refugiados subterrâneos e enfrenta a "Engenheira Louca".
Decisões: Desistir ou enfrentar a "Engenheira Louca".
Inimigo: Engenheira Louca.
Nível 3: A Floresta Ancestral
Narrativa: O jogador protege a floresta dos desmatadores.
Decisões: Desistir ou enfrentar a "Lenhadora Desonesta".
Inimigo: Lenhadora Desonesta.
Nível 4: O Céu Enegrecido
Narrativa: O jogador luta ao lado de pássaros para limpar o céu da poluição.
Decisões: Abandonar o desafio ou enfrentar o "Barão da Poluição".
Inimigo: Barão da Poluição.
Nível 5: O Santuário da Vida
Narrativa: O jogador une forças com vários aliados para enfrentar a "Rainha das Trevas".
Decisões: Abandonar a batalha ou enfrentar o inimigo final.
Inimigo: Rainha das Trevas.
