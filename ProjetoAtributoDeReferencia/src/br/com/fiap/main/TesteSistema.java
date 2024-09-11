package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        //instanciar objetos
        Cliente onjCliente = new Cliente();
        Endereco onjEndereco = new Endereco();
        Produto onjProduto = new Produto();

        //entrada
        onjCliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        onjCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
        onjCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));

        onjEndereco.setLogradouro(JOptionPane.showInputDialog("Digite seu logradouro"));
        onjEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")));
        onjEndereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
        onjEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP"));
        onjEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro"));
        onjEndereco.setCidade(JOptionPane.showInputDialog("Digite a cidade"));

        onjCliente.setEndereco(onjEndereco);

        onjProduto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
        onjProduto.setTipo(JOptionPane.showInputDialog("Digite o tipo"));
        onjProduto.setMarca(JOptionPane.showInputDialog("Digite a marca"));
        onjProduto.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
        System.out.println(
                "INFORMAÇÕES DO CLIENTE" +
                "\nNome: " + onjCliente.getNome() +
                "\nIdade: " + onjCliente.getIdade() +
                "\nAltura: " + onjCliente.getAltura() +
                        "\nLogradouro: " + onjCliente.getEndereco().getLogradouro() +
                        "\nNumero: " + onjCliente.getEndereco().getNumero() +
                        "\nComplemento: " + onjCliente.getEndereco().getComplemento() +
                        "\nCep: " + onjCliente.getEndereco().getCep() +
                        "\nBairro: " + onjCliente.getEndereco().getBairro() +
                        "\nCidade: " + onjCliente.getEndereco().getCidade() +

                        "\n\nINFORMAÇÕES DO PRODUTO" +
                        "\nCodigo: " + onjProduto.getCodigo() +
                        "\nTipo: " + onjProduto.getTipo() +
                        "\nMarca: " + onjProduto.getMarca() +
                        "\nValor: " + onjProduto.getValor()

        );
    }
}
