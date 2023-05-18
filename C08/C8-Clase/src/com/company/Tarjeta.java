package com.company;

public class Tarjeta {
        private String numero;
        private String banco;

        public String getNumero() {
            return numero;
        }

    public Tarjeta(String numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getBanco() {
            return banco;
        }

        public void setBanco(String banco) {
            this.banco = banco;
    }
}
