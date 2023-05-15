package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompruebaMailTest {
    @Test
    public void mailASpam(){
        CompruebaMail colmena = new CompruebaMail();
        Mail mail = new Mail("persona@gmail.com","persona2@gmail.com", "Buen día");
        String respEsperada="Mail enviado a SPAM";
        String respActual= colmena.compruebaMail(mail);
        assertEquals(respEsperada, respActual);
    }
}
