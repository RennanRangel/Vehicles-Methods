#  Projeto de Veículos em Java

Este projeto demonstra conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, utilizando **herança**, **sobrescrita de métodos** e **encapsulamento**.

---

## Estrutura do Projeto

### **Classe `Veiculo`**
- Atributos:
  - `marca`
  - `ano`
- Métodos:
  - `getMarca()` e `setMarca()`
  - `getAno()` e `setAno()`
  - `exibirInformacoes()` → Exibe os dados do veículo

---

### **Classe `Carro` (herda de `Veiculo`)**
- Atributo adicional:
  - `numPortas`
- Métodos:
  - `getNumPortas()` e `setNumPortas()`
  - Sobrescreve `exibirInformacoes()` para incluir o número de portas
  - `buzinar()` → Exibe um som de buzina (`Beee`)

---

### **Classe `ATVIZA`**
- Contém o método `main` para executar o programa:
  - Cria objetos `Veiculo` e `Carro`
  - Exibe suas informações no console

---

## Exemplo de Uso

### Código:
```java
public class ATVIZA {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Lamborghini Aventador", 2023);
        veiculo.exibirInformacoes();

        Carro carro = new Carro("Ferrari", 2025, 2);
        carro.exibirInformacoes();
        carro.buzinar();
    }
}
