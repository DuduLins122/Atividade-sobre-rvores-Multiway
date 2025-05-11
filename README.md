# Projeto Árvore 2-3 (Atividade Árvores Multiway)

## Estrutura Escolhida: Árvore 2-3

### Regras Seguidas
- Nenhum uso de listas, arrays, estruturas prontas ou StringBuilder.
- Apenas `String`, `int`, `try-catch` e input/output básico.
- Manipulação direta dos filhos e chaves nos nós.
- Nomes de variáveis e métodos em **português**.

---

### Operações Implementadas

### Inserção
A inserção é feita recursivamente nos nós folha. Se o nó ainda não está cheio, a chave é inserida nele. Caso contrário, ela é redirecionada para os filhos esquerdo, centro ou direito, conforme a ordenação da chave.

### Busca
A busca também é recursiva, verificando se a chave atual está no nó, ou buscando nos filhos conforme o valor da chave.

### Remoção
A remoção é feita localizando a chave e removendo-a diretamente do nó. Não há rebalanceamento automático, pois o foco é manter a estrutura manual simples, dentro das regras da atividade.

---

##  Testes

O arquivo `Principal.java` contém testes de inserção, busca e remoção.

---

## Autores
- Carolos Jeronimo
- Guilherme Oliveira
- Miguel Rezende
- Marcelo Eduardo

---


