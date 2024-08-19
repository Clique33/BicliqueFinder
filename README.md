# BicliqueFinder
Neste repositório se encontra a versão mais atual da ferramenta utilizada no auxílio da busca por bicliques em diversas cifras, gerando as seguintes publicações:

[_Generator sets for the selection of key differences in the Biclique Attack_](https://sol.sbc.org.br/index.php/sbseg/article/view/21654) (Ataque sobre a cifra Serpent-256)

[_Revisiting the Biclique Attack on the AES_](https://sol.sbc.org.br/index.php/sbseg/article/view/27204) (Ataques sobre a cifra Rijndael-128)

_The Best Biclique Cryptanalysis of the Lightweight Cipher FUTURE_ (Aceito em 08/08/2024. Ainda não publicado.)

## Introdução

A criptoanálise, desde seus primórdios na segunda guerra mundial, sempre foi um campo da matemática cujas soluções encontradas são _ad hoc_, isto é, dada uma cifra, tenta-se encontrar uma forma de quebrá-la que, essencialmente, só funciona nesta cifra. Mesmo os métodos mais modernos, como os ataques linear, diferencial e biclique, possuem formas gerais de utilização que devem ser especialmente modificadas para cada cifra a ser atacada. Dessa forma, ferramentas são costumeiramente criadas e utilizadas exclusivamente para determinada cifra, sendo totalmente modificada para aplicação em outras cifras. Muitas vezes, sequer são utilizadas ferramentas.

Nos últimos anos, o uso de ferramentas para auxílio da criptoanálise tem se tornado um elemento importante para a compreensão, aprimoramento e aplicação prática destes ataques. No caso da criptoanálise biclique, a primeira grande ferramenta foi publicada por Abed et al. em 2013 que era capaz de buscar por bicliques simples em diversas cifras diferentes. O principal destaque no uso desta ferramenta foi a descoberta de uma pequena falha no cálculo de complexidade do ataque original aos AES-192, bem como aplicação deste sobre a cifra BKSQ. Recentemente, o uso de ferramentas semi-automáticas e frameworks para auxílio na criptoanálise tem se tornado comum principalmente nos ataques diferenciais e lineares contra cifras do tipo ARX (_Add-Rotate-Xor_), onde não é possível encontrar boas diferenciais ou características lineares sem o auxílio de computadores. Um dos principais pioneiros deste crescimento no uso de ferramentas é Nicky Mouha, que produziu uma série de frameworks para a busca de diferenciais de forma generalizar seu uso o máximo possível, nos trabalhos com cifras baseadas em S-boxes, buscas de diferenciais para cifras ARX e na generalização da aplicação de criptoanálise diferencial em S-functions, onde o objetivo é "transformar em S-boxes" as operações de cifras que utilizam fontes diferentes de não-linearidade. 
    
Nesse contexto, apresentamos uma ferramenta desenvolvida em Java, através da IDE Netbeans IDE 8.2, que semi-automatiza a busca por bicliques em cifras baseadas em palavras de tamanho fixo e possuem S-boxes como única fonte de não-linearidade. Várias cifras modernas se encaixam nessas restrições, em especial o Rijndael (AES), a principal cifra simétrica no ocidente. Quase todas as cifras do tipo SPN (_Substitution-Permutation Network_) também conformam com as restrições, como a LED, SQUARE, Serpent e FUTURE, as duas últimas sendo alvo também desta ferramenta.  

