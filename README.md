# Jogo de cartas

Jogo de cartas desenvolvido para a disciplina de Programação orientada a objetos - Senac - SP 


# Batalha

Escolha entre as cartas aleatórias de 6 personagens, 6 armas, 6 joias e 6 armaduras para começar a rodada, a rodada começa de forma aleatória, sendo assim, quem tiver as melhores cartas, será o vencedor. 


# Como jogar

Comece com 6 personagens, 6 armas, 6 joias e 6 armaduras, escolha uma opção em cada rodada, cada carta escolhida em cada rodada será descartada, se o seu personagem sobreviver a rodada, ele será recolocado no seu deck, podendo escolhe-lo novamente em outra rodada, mas, se sua carta morrer, ela será removida do deck, sobrando outras 5 cartas para a próxima rodada. 

As cartas de armas, armaduras e joias, serão equipadas no personagem desejado, fazendo com que elas saiam do deck, ficando equipada no personagem escolhido, mesmo se o personagem sobreviver a rodada, ele terá utilizado essas cartas, fazendo com que elas sejam removidas das próximas rodadas. 

Ao final de cada rodada, será mostrado o vencedor junto com a energia que sobrou, caso esteja vivo, aparecerá novamente no seu deck.


# Como funciona

1 - Inserir o nome; 

2 - Seleção de cartas aleatórias para o player 1 e 2; 

3 - Escolha de carta que será utilizada na batalha pelo player 1; 

4 - Escolha da arma pelo player 1 (é acrescentado o valor do poder da arma a energia do personagem); 

5 - Escolha da joia pelo player 1 (é acrescentado o valor do poder da joia a energia do personagem); 

6 - Escolha da armadura pelo player 1 (é acrescentado o valor do poder da armadura a energia do personagem); 

7 - Player 2 escolhe aleatoriamente suas cartas, joias, armas e armaduras; 

8 - É exibido as informações das cartas que batalharam durante a rodada; 

9 - Inicio da rodada; 

10 - Resultado da rodada; 

11 - Exibido as cartas, joias, armas e armaduras disponíveis do player 1 e do player 2; 

13 - A batalha termina até que um dos jogadores fique sem cartas no deck; 

14 - O vencedor do jogo é exibido; 


# Personagens

  **Orc** 
- Orc do deserto
- Orc da montanha.

 **Humano** 
- Sacerdote 
- Bruxa da floresta
- Espadachim da chama azul
- Guerreiro
- Mago de luz
- Mago negro
- Alakazam
- Arqueiro
- Gigante.

 **Dragão** 
- Dragão de gelo
- Dragão branco
- Dragão vermelho
- Dragão azul.

 **Anão** 
- Anão da terra
- Anão de gelo
- Anão de fogo.

 **Elfo** 
- Fada mistica
- Fada das águas
- Elfo da floresta
- Elfo da luz
- Elfo da escuridão
- Elfo venenoso.

 **Monstro** 
- Exodia
- Monstro Marinho
- Enguia das águas
- Rei caveira
- Monstro de pedra
- Guardião das águas.


# Armas

- Arma guardiã
- Arma das feras
- Arma espiritual
- Arma protetora
- Arma do soberano
- Arma magica
- Arma vendaval
- Arma de fogo
- Arma de sangue
- Arma do espadachim
- Arma da justiça
- Arma do caçador
- Arma treme terra
- Arma de terra
- Arma do purgatorio
- Arma de gelo
- Arma de lava
- Arma do guerreiro
- Arma de água
- Arma de força.


# Joias

- Joia da terra
- Joia de ar
- Joia de magia
- Joia de água
- Joia de fogo
- Joia de força.


# Armaduras

- Armadura pesada
- Armadura espadachim 
- Armadura do caçador 
- Armadura magica
- Armadura de fogo
- Armadura estaca de sangue
- Armadura protetora
- Armadura do guardião
- Armadura do espirito
- Armadura de gelo
- Armadura do barbaro
- Armadura de lava
- Armadura do purgatorio
- Armadura senhor das feras
- Armadura de água
- Armadura treme terra
- Armadura do duque
- Armadura da justiça
- Armadura da terra
- Armadura do soberano.


# Regras de negocio

Cria um jogador e associa as cartas com os personagens de forma aleatória;

Cria as joias, armaduras e armas e associa ao jogador de forma aleatória;

Se uma joia, arma ou armadura escolhida for do mesmo tipo do personagem é acrescentado no valor da energia do personagem em 20 pontos; 

Se ambos os personagens selecionados para batalhar forem do mesmo tipo é removido 10 pontos da energia de cada personagem durante toda a batalha. (até que uma das cartas fique sem energia);

Ao finalizar uma batalha a carta do jogador perdedor é removida do deck, assim como a joia, armadura e arma utilizada;

Ao finalizar uma batalha a carta do jogador vencedor retorna para o deck com a energia que finalizou a batalha. As joias, armas e armaduras utilizadas durante a batalha são descartadas.


Estrutura projeto: 

projeto -> game 

pacotes -> 
       
       Armaduras (Tipos concretos de armadura) 

       Armas (Tipos concretos de arma) 

       Factory (fabricas de arma, armadura, joia, personagem) 

       Joias (Tipos concretos de joia) 

       Modelos (Tipos abstratos de anão, arma, armadura, dragão, elfo, humano, joia, monstro, orc,  personagem, enum de tipos, interface de batalha) 

       Personagens (Tipos concretos de personagens) 

       Template (método de início do jogo e quebra de linha) 

       Teste (Classe de teste do jogo) 



