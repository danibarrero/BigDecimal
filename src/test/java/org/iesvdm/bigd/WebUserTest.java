package org.iesvdm.bigd;

import Ejercicios.Tienda.UserState;
import Ejercicios.Tienda.WebUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WebUserTest {
    @Test
    void activate_NewUser() {
        WebUser usuario = new WebUser("usuario", "1234");
        usuario.activate();
        assertEquals(UserState.ACTIVE, usuario.getState());
    }

    @Test
    void activate_AlreadyActiveUser() {
        WebUser usuario = new WebUser("usuario", "1234");
        usuario.setState(UserState.ACTIVE);
        usuario.activate();
        assertEquals(UserState.ACTIVE, usuario.getState());
    }

    @Test
    void checkPassword() {
        WebUser usuario = new WebUser("usuario", "1234");
        assertTrue(usuario.checkPassword("1234"));
    }
}
