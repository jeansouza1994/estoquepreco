# RabbitMQ Producer & Consumer API

Projeto desenvolvido com o objetivo de estudar e validar a comunicação assíncrona entre microsserviços utilizando RabbitMQ, implementando os conceitos de Producer (Produtor) e Consumer (Consumidor) através do ecossistema Spring Boot.

A aplicação demonstra o envio e processamento de mensagens por filas, permitindo desacoplar componentes da aplicação e simular uma arquitetura baseada em eventos.

---

# Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring AMQP
* RabbitMQ
* Docker
* Maven

---

# Objetivo do Projeto

O principal objetivo deste projeto é demonstrar o funcionamento de filas de mensagens utilizando RabbitMQ.

A arquitetura é composta por dois componentes principais:

### Producer

Responsável por receber requisições da API e publicar mensagens em uma fila RabbitMQ.

### Consumer

Responsável por consumir as mensagens enviadas para a fila e realizar o processamento dos dados recebidos.

Link do consumidor: https://github.com/jeansouza1994/ConsumidorEstoque

Essa abordagem permite:

* Comunicação assíncrona entre serviços
* Desacoplamento de responsabilidades
* Maior escalabilidade da aplicação
* Processamento distribuído
* Maior resiliência em cenários de alta demanda

---

# Fluxo de Funcionamento

1. O cliente realiza uma requisição para a API.
2. O Producer recebe os dados.
3. A mensagem é serializada para JSON.
4. O RabbitMQ recebe e armazena a mensagem na fila.
5. O Consumer monitora a fila.
6. Ao receber uma nova mensagem, o Consumer realiza o processamento.
7. O processamento é registrado nos logs(System.out.println) da aplicação.

---

# Estrutura da Mensagem

Exemplo de payload enviado para a fila:

```json
{
  "codigoProduto": "15.10",
  "quantidade": 50
}
```

---

# DTO Utilizado

```java
public class EstoqueDto {

    private String codigoProduto;
    private int quantidade;

    // getters e setters
}
```

---

# Endpoint de Envio

Endpoint responsável por publicar mensagens na fila.

```http
POST /estoque
```

### Respostas

| Código | Descrição                    |
| ------ | ---------------------------- |
| 200    | Mensagem enviada com sucesso |
| 400    | Dados inválidos              |
| 500    | Erro ao enviar mensagem      |

---

# Conversão de Mensagens

Para envio e recebimento de objetos Java foi utilizado o:

```java
Jackson2JsonMessageConverter
```

Esse conversor é responsável por transformar automaticamente objetos Java em JSON durante o envio para a fila e converter o JSON recebido novamente para objetos Java no Consumer.

---

# Aprendizados do Projeto

Durante o desenvolvimento foram explorados conceitos como:

* Mensageria assíncrona
* RabbitMQ Exchanges
* Queues
* Producers
* Consumers
* Serialização JSON
* Spring AMQP
* Docker Containers
* Integração entre microsserviços
* Tratamento de mensagens
