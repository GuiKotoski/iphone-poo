# POO - Desafio iPhone (DIO)

Modelagem e implementação simples do componente **iPhone** (2007), representando três funcionalidades:
- **Reprodutor Musical**
- **Aparelho Telefônico**
- **Navegador na Internet**

O foco é praticar **POO com interfaces** e uma classe concreta que implementa os contratos.

---

## Diagrama UML (Mermaid)

> Visualize em um viewer Mermaid (ex.: GitHub renderiza Mermaid em muitos casos, ou use um editor online compatível).

```mermaid
classDiagram
    direction LR

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
