# 📒 Agenda de Contatos

Projeto didático desenvolvido em **Java** na disciplina de **Programação Orientada a Objetos (POO)**.

O projeto é desenvolvido de forma incremental, com cada versão introduzindo novos conceitos, estruturas e funcionalidades.

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de armazenamento, da organização do código, da persistência de dados e das funcionalidades do sistema.

## 📈 Evolução do projeto

| Versão | Estrutura | Principais conceitos |
|---|---|---|
| **V.0.0.0** | Variáveis simples | `String`, `Scanner`, `if-else`, `switch`, `while` |
| **V.0.1.0** | Arrays | Vetores, índices, `for` e capacidade fixa |
| **V.0.2.0** | `List` + `ArrayList` | Coleções, tamanho dinâmico, `add()`, `get()`, `remove()`, `size()` |
| **V.0.3.0** | `List` + `ArrayList` | Alteração de contatos com `set()` e CRUD |
| **V.1.0.0** | Métodos | Organização do código em métodos |
| **V.1.1.0** | Classes `Agenda` e `Uteis` | Separação de responsabilidades e organização do código |
| **V.1.1.1** | Classes `Agenda` e `Uteis` | Correção do encerramento do sistema e opção "Sobre" |
| **V.2.1.0** | Classe `Persistencia` | Persistência de dados em arquivos (`FileWriter`, `PrintWriter`, `BufferedReader`) |
| **V.3.0.0** | Classe `Contato` | Instanciação de objetos e acesso aos atributos |
| **V.3.1.0** | Coleção de objetos | `List<Contato>`, `add()`, `get()` e `for-each` |
| **V.3.2.0** | CRUD orientado a objetos | Operações e persistência com `List<Contato>` |
| **V.3.3.0** | Encapsulamento | Atributos privados, construtores, getters, setters e `this` |

### V.0.0.0

Primeira versão do projeto, utilizando variáveis simples para armazenar **apenas um contato**.

### V.0.1.0

Substituição das variáveis por **arrays**, permitindo armazenar vários contatos com capacidade fixa.

### V.0.2.0

Substituição dos arrays por **`List` e `ArrayList`**, permitindo o armazenamento dinâmico de contatos.

### V.0.3.0

Adição da funcionalidade de **alterar contatos**, utilizando o método `set()`.

Com essa versão, o sistema passou a possuir um CRUD básico:

- **CREATE** → Adicionar contato
- **READ** → Listar e procurar contato
- **UPDATE** → Alterar contato
- **DELETE** → Excluir contato

### V.1.0.0

Organização do código por meio da criação de **métodos**, separando as diferentes funcionalidades da aplicação.

As operações de adicionar, listar, pesquisar, atualizar, excluir e sair passaram a ser implementadas em métodos próprios.

### V.1.1.0

Organização do projeto em diferentes classes, separando as responsabilidades da aplicação.

A classe **`Agenda`** passou a concentrar as operações relacionadas aos contatos, enquanto a classe **`Uteis`** passou a concentrar funcionalidades auxiliares, como inicialização, menu, seleção de opção e informações sobre o sistema.

Também foi adicionada a opção **"Informações Sobre a Agenda de Contatos"**, utilizando `JOptionPane`.

### V.1.1.1

Correção do funcionamento da opção **Sair**.

Na versão anterior, o método `sair()` recebia a variável `continuar`, mas a alteração feita dentro do método não modificava a variável existente no `main`.

Na V.1.1.1, o método `sair()` passou a retornar um valor `boolean`, permitindo que o `main` atualize corretamente a variável `continuar` e encerre o sistema.

### V.2.1.0

Introdução da classe **`Persistencia`** para salvar e carregar os contatos em arquivo de texto (`contatos.txt`).

- **Carregamento automático:** Os dados são lidos do arquivo ao iniciar a aplicação.
- **Salvamento automático:** Os dados são gravados no arquivo ao optar por sair do sistema.

### V.3.0.0

Introdução da classe `Contato` e de um objeto de exemplo com `nome`, `celular` e `email`. Nesta etapa, o CRUD e a persistência ainda usam as três listas de strings da versão 2.1.0. O exemplo não é salvo no arquivo de contatos.

Código e documentação desta etapa: [tag v3.0.0](https://github.com/MuriStack/Agenda-Contatos/tree/v3.0.0).

### V.3.1.0

Introdução de uma coleção **`List<Contato>`**, conforme a etapa de coleção de objetos do projeto da disciplina.

- Criação de três objetos `Contato` e inclusão na coleção com `add()`.
- Recuperação de objetos com `get()` e percurso com `for-each` e índices.
- Acesso aos atributos públicos `nome`, `celular` e `email` dos objetos armazenados.
- Os contatos de exemplo são apenas didáticos: não entram no CRUD nem são salvos em `contatos.txt`.
- O CRUD e a persistência continuam usando as três listas de strings da V.2.1.0 nesta etapa.

### V.3.2.0

Adaptação das operações da agenda e da persistência para trabalhar com uma única **`List<Contato>`**.

- Cada cadastro cria um objeto com `nome`, `celular` e `email`.
- Listagem e pesquisa percorrem a coleção com `for-each`.
- Alteração e exclusão localizam o objeto por referência; a exclusão ocorre após o percurso da coleção.
- As buscas ignoram maiúsculas e minúsculas. Em nomes repetidos, a pesquisa lista todos, e a alteração e a exclusão afetam o último encontrado, seguindo o código do professor.
- As listas paralelas e os exemplos didáticos da V.3.1.0 são removidos do programa principal.
- A persistência salva os atributos dos objetos e reconstrói a coleção ao carregar o arquivo.
- O formato `nome;celular;email` de `contatos.txt` permanece compatível com a V.2.1.0.

### V.3.3.0 — Versão atual

Encapsulamento e melhoria da modelagem da classe **`Contato`**.

- Os atributos `nome`, `celular` e `email` passam a ser `private`.
- Getters permitem consultar os dados e setters permitem alterá-los.
- Um construtor com parâmetros inicializa o contato com seus dados; o construtor sem parâmetros também permanece disponível, como no projeto de referência.
- A palavra-chave `this` diferencia os atributos dos parâmetros.
- O CRUD utiliza getters e setters; o cadastro e a leitura do arquivo utilizam o construtor com parâmetros.
- A persistência utiliza getters para salvar os dados, mantendo o formato do arquivo.
- A opção **Sair** salva os contatos, chama `Uteis.sair()`, fecha o `Scanner` e encerra o `main` com `return`.

```java
Contato contato = new Contato("Ana", "8599999-0000", "ana@example.com");
System.out.println(contato.getNome());
contato.setNome("Ana Silva");
```

As etapas seguem o [repositório do professor Roger M. Sarmento](https://github.com/rogermsarmento/agenda-contatos). O código de referência está sob a licença MIT, preservada no arquivo [LICENSE](LICENSE).

## 🏷️ Consulta das versões

A sequência didática completa é **V.2.1.0 → V.3.0.0 → V.3.1.0 → V.3.2.0 → V.3.3.0**.

Os novos commits registram a V.3.1.0, reaplicam a V.3.2.0 e avançam para a V.3.3.0 nessa ordem. Cada etapa possui um commit de código e outro de documentação.

- [V.3.0.0 — Classes e objetos](https://github.com/MuriStack/Agenda-Contatos/tree/v3.0.0)
- [V.3.1.0 — Coleção de objetos](https://github.com/MuriStack/Agenda-Contatos/tree/d5098cb6385b61108f055d2aaffb16793089ff21)
- [V.3.2.0 — CRUD reaplicado após a V.3.1.0](https://github.com/MuriStack/Agenda-Contatos/tree/b10be2b3ad89dc3ff9ee8a0cf3e1dc2c095676e8)
- [V.3.3.0 — Encapsulamento](https://github.com/MuriStack/Agenda-Contatos/tree/0356df6100ebacede2fba4623097b5bf0d7d0e5c)

Os commits anteriores e a tag original `v3.2.0` foram preservados. Para consultar a V.3.2.0 reaplicada nesta sequência, utilize o link acima.

## ⚙️ Funcionalidades

- ➕ Adicionar contato
- 📋 Listar contatos
- 🔎 Procurar contato
- ✏️ Alterar contato
- 🗑️ Excluir contato
- 💾 Persistência em arquivo (`contatos.txt`)
- 🚪 Sair
- ℹ️ Informações sobre a Agenda de Contatos

## 📂 Estrutura do projeto

```text
Agenda-Contatos/
├── .gitignore
├── LICENSE
├── README.md
└── src/
    └── br/
        └── edu/
            └── principal/
                ├── Principal.java
                ├── Contato.java
                ├── Agenda.java
                ├── Uteis.java
                └── Persistencia.java
```

## ▶️ Como executar

Com um JDK 14 ou superior, execute na raiz do projeto:

```sh
javac -encoding UTF-8 -d bin src/br/edu/principal/*.java
java -cp bin br.edu.principal.Principal
```

O arquivo `contatos.txt` é lido e salvo no diretório de execução. A opção "Sobre" utiliza uma janela Swing e requer ambiente gráfico.

## ✅ Verificação das versões

As versões **3.1.0, 3.2.0 e 3.3.0** foram compiladas com `javac --release 14 -Xlint:all -encoding UTF-8` e comparadas ao código do professor em dez cenários por versão:

- Agenda vazia e contatos não encontrados;
- Cadastro e busca com acentos e diferença entre maiúsculas e minúsculas;
- Alteração de contato;
- Exclusão do único contato e de um contato no meio da coleção;
- Alteração e exclusão de homônimos;
- Leitura de arquivo antigo com registro inválido;
- Opção inválida e saída imediata.

Cada cenário verificou a saída do programa, o conteúdo salvo e uma nova execução para recarregar os dados. Foram **120 execuções**, somando as três versões deste projeto e as respectivas versões de referência. Na V.3.1.0, também foi conferido que os contatos de exemplo não são salvos.

Na V.3.3.0, foram verificados os atributos privados, os dois construtores, os getters e os setters da classe `Contato`. A janela "Sobre" mantém a identificação do desenvolvedor, mas não foi validada visualmente.
